package  fr.ulille1.fil.odeva;

public class Money {
	private int value;
	private String currency;
	static final int MULT = 15;
	

	Money(int value, String currency)
	{
		this.value=value;
		this.currency=currency;
	}

	public int getValue()
	{
		return this.value;
	}

	public String getCurrency()
	{
		return this.currency;
	}

    public String toString() {
     	return this.getValue()+" ("+this.getCurrency()+")";
    }
    
    public boolean equals(Object o) {
    	if(o instanceof Money) {
    		return ((Money)o).getValue()==this.getValue() 
    			&& ((Money)o).getCurrency()==this.getCurrency();
    	}
    	
    	return false;
    }
    
    public int hashCode() {
      return value * mult;
    }
}
