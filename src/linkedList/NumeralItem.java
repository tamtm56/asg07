package linkedList;

public class NumeralItem implements Item 
{
	private int value;
	public NumeralItem(int _value)
	{
		value = _value;
	}
	public Item clone()
	{
		return new NumeralItem(value);
	}
	public String toString()
	{
		return Integer.toString(value);
	}
	public boolean equals(Item otherItem)
	{
		return this.toString().equals(otherItem.toString());
	}
}