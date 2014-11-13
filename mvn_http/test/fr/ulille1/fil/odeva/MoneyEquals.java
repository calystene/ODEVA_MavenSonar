package fr.ulille1.fil.odeva;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MoneyEquals {
	private Money m1;
	private Money m2;
	private MoneyFactory mf;
	
	
	@Before
	public void init() {
		mf=MoneyFactory.getDefaultFactory();
	}
	
	
	/**
     * equals() même valeurs et même devise
     */
    @Test
    public void equalsMVMD() throws UnexistingCurrencyException
    {
    	m1 = mf.createMoney(10, "EUR");
    	m2 = mf.createMoney(10, "EUR");
    	
    	assertTrue(m1.equals(m2));
    }
    
    /**
     * equals() même valeurs et devises différentes
     */
    @Test
    public void equalsMVDD() throws UnexistingCurrencyException 
    {
    	m1 = mf.createMoney(10, "EUR");
    	m2 = mf.createMoney(10, "CHF");
    	
    	assertFalse(m1.equals(m2));
    }
    
    
    /**
     * equals() valeurs différente et même devises
     */
    @Test
    public void equalsVDMD() throws UnexistingCurrencyException 
    {
    	m1 = mf.createMoney(12, "EUR");
    	m2 = mf.createMoney(10, "EUR");
    	
    	assertFalse(m1.equals(m2));
    }
    
    
    /**
     * equals() valeurs et devises différentes
     */
    @Test
    public void equalsVDDD() throws UnexistingCurrencyException 
    {
    	m1 = mf.createMoney(12, "EUR");
    	m2 = mf.createMoney(10, "CHF");
    	
    	assertFalse(m1.equals(m2));
    }
    
    
    /**
     * equals() avec objet différent de Money
     */
    @Test
    public void equalsAutreObjet() throws UnexistingCurrencyException
    {
    	m1 = mf.createMoney(12,"EUR");
    	assertFalse(m1.equals("12EUR"));
    }
}
