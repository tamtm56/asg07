package linkedList;

public class StringItem implements Item 
{
	private String value;
	public StringItem(String _value)
	{
		value = _value;
	}
	public Item clone()
	{
		return new StringItem(value);
	}
	public String toString()
	{
		return value;
	}
	public boolean equals(Item otherItem)
	{
		return this.toString().equals(otherItem.toString());
	}
}
