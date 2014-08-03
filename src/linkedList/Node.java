package linkedList;

public class Node 
{
	public Item data;
	public Node next;
	public Node(Item _data,Node _next)
	{
		next = _next;
		data = _data.clone();
	}
}
