package fr.ulille1.fil.odeva;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MoneyCreationTestCase {
	MoneyFactory mf;
	
	
	@Before
	public void init() {
		mf = MoneyFactory.getDefaultFactory();
	}
	
	
	/**
     * creationMoney
     */
    @Test
    public void createMoney() throws UnexistingCurrencyException
    {
    	Money created=mf.createMoney(10, "EUR");
    	
    	assertNotNull(created);
    }
}
