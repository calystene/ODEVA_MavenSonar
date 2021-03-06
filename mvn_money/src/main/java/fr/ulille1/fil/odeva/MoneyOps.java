/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ulille1.fil.odeva;

/**
 *
 * @author marius
 */
public final class MoneyOps {
  private static MoneyFactory mf = MoneyFactory.getDefaultFactory();
  
  private MoneyOps () {
    
  }

  /**
   * Add moneys having the same currency
  */
  public static Money simpleAdd(Money m1, Money m2) throws IncompatibleCurrencyException, UnexistingCurrencyException
  {  
	if(m1.getCurrency().equals(m2.getCurrency())) {
		return mf.createMoney(m1.getValue()+m2.getValue(),m1.getCurrency());
	}
	
	throw new IncompatibleCurrencyException(m1.getCurrency(), m2.getCurrency());
  }
  
  
  /**
   *  subtract moneys having the same currency
   */
  public static Money simpleSub(Money m1, Money m2) throws IncompatibleCurrencyException, UnexistingCurrencyException
  {  
	if(m1.getCurrency().equals(m2.getCurrency())) {  
		return mf.createMoney(m1.getValue()-m2.getValue(),m1.getCurrency());
	}
	
	throw new IncompatibleCurrencyException(m1.getCurrency(), m2.getCurrency());
  }
}

