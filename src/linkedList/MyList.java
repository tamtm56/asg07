package linkedList;

public class MyList implements Item // a linkedlist class
{
	private Node start;
	private Node end;
	public MyList()
	{
		start = null;
		end = null;
	}
	public void append(Item newData) // add an Item in the end of list
	{
		Node newNode = new Node(newData.clone(), null);
		if (start == null)
		{
			start = newNode;
			end = start;
		}
		else
		{
			end.next = newNode;
			end = newNode;
			end.next = null;
		}
	}
	public void appendList(MyList otherList) // add a list in the end of this list
	{
		Node recentPt = otherList.start;
		while (recentPt != null)
		{
			this.append(recentPt.data.clone());
			recentPt = recentPt.next;
		}
	}
	public Item clone() // make a clone of the list
	{
		MyList bufList = new MyList();
		Node recentPt = this.start;
		while (recentPt != null)
		{
			bufList.append(recentPt.data.clone());
			recentPt = recentPt.next;
		}
		return bufList;
	}
	public String toString() // make a string from the list
	{
		String rsString = "(";
		Node recentPt = this.start;
		while (recentPt != end)
		{
			rsString = rsString + recentPt.data.toString() + ", ";	
			recentPt = recentPt.next;
		}
		rsString = rsString + recentPt.data.toString() + ")";
		return rsString;
	}
	
	public int length() // return length of list
	{
		int length = 0;
		Node recentPt = this.start;
		while (recentPt != null)
		{
			length++;
			recentPt = recentPt.next;
		}
		return length;
	}
	public boolean equals(Item otherItem) // check equality
	{
		return this.toString().equals(otherItem.toString());
	}
	
	public Item find(Item key) // find an Item
	{
		String keyString = key.toString();
		Node recentPt = this.start;
		while ((recentPt != null) && (recentPt.data.toString().equals(keyString)))
		{
			recentPt = recentPt.next;
		}
		return recentPt.data;
	}
	
	private void insert(Item newData) // insert an Item in the head of list
	{
		Node newNode = new Node(newData.clone(), null);
		if (start == null)
		{
			start = newNode;
			end = start;
		}
		else
		{
			Node oldStart;
			oldStart = start;
			start = newNode;
			start.next = oldStart;
		}
	}
	public void invert() // invert the list
	{
		MyList bufferList = new MyList();
		Node recentPt = this.start;
		while (recentPt != null)
		{
			bufferList.insert(recentPt.data);
			recentPt = recentPt.next;
		}
		this.start = bufferList.start;
		this.end = bufferList.end;
	}
}
