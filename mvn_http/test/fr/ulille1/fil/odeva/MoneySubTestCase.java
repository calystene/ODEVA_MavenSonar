package fr.ulille1.fil.odeva;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MoneySubTestCase {

	
	private Money f12EUR,  f14EUR, f12CHF;
    private MoneyFactory mf;
    
    @Before
    public void init() throws UnexistingCurrencyException
    {
      mf=MoneyFactory.getDefaultFactory();
      f12EUR=mf.createMoney(12, "EUR");
      f14EUR=mf.createMoney(14, "EUR");
      f12CHF=mf.createMoney(12, "CHF");
    }
    
    
    /**
     * simpleAdd
     */
    @Test
    public void simpleSub() throws UnexistingCurrencyException
    {
        Money expected=mf.createMoney(2, "EUR");
        Money result=MoneyOps.simpleSub(f14EUR,f12EUR);
       
        assertEquals(expected,result);
    }
    
    /**
     * SimpleSub with throwing IncompatibleCurrencyExeption 
     */
    @Test(expected=IncompatibleCurrencyException.class)
    public void simpleSubException() throws UnexistingCurrencyException, IncompatibleCurrencyException
    {
    	f12CHF=mf.createMoney(12, "CHF");
    	MoneyOps.simpleSub(f12EUR, f12CHF);
    }
    
    
}
