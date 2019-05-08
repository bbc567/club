package Grade_Administrator;

public class linkedList {
	private int length;
	private Node head;
	private Node tail;
	
	public linkedList() {
		length = 0;
		head = null;
		tail = null;
	}
	
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object input) {
			data = input;
			next = null;
		}
		public String toString() {
			return String.valueOf(data);
		}
	}
	

	public void add(int index, Object input) {
		if(length == 0)
			addFirst(input);
		else {
			try {
				Node temp;
				temp = indexToNode(index - 1);

				Node newNode = new Node(input);
				newNode.next = temp.next;
				temp.next = newNode;
				length++;
			
				if(newNode.next == null)
					tail = head;
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		
		newNode.next = head;
		head = newNode;
		
		length++;
		if(newNode.next == null)
			tail = head;
	}
	
	public void addLast(Object input) {		
		if(length == 0)
			addFirst(input);
		else {
			Node newNode = new Node(input);
			
			tail.next = newNode;
			tail = newNode;
			length++;
		}
	}
	
	private Node indexToNode(int index) throws Exception{
		if(index < 0 || index >= length)
			throw new Exception("index is out of length");
		
		Node node = head;
		for(int i = 0; i < index; i++) 
			node = node.next;
		return node;
	}

//	public void print() {
//		if(length == 0)
//			System.out.println("");
//		else {
//			Node temp = head;
//			int index = 0;
//			
//			while(temp.next != null) {
//				System.out.println(index + " " + temp.data);
//				temp = temp.next;
//				index++;
//			}
//		}
//	}
	
	public void removeFirst() {
		Node to_remove = head;
		head = to_remove.next;
		
		to_remove = null;
		length--;
	}
	
	public void remove(int index) throws Exception{
		if(index < 0 || index >= length)
			throw new Exception("index is out of length");
		
		if(index == 0)
			removeFirst();
		
		Node temp = indexToNode(index - 1);
		Node to_remove = temp.next;
		temp.next = to_remove.next;
		
		if(to_remove == tail)
			tail = null;
		
		to_remove = null;
		length--;
	}
	
	public int getLength() {
		return length;
	}
	
	public Object getData(int index) throws Exception{
		if(index < 0 || index >= length)
			throw new Exception("index is out of length");
		
		Node temp = indexToNode(index);
		return temp.data;
	}
	
	public int dataToIndex(Object data) throws Exception{
		Node searchNode = head;
		
		for(int i = 0; i < length; i++) {
			if(searchNode.data == data)
				return i;
			searchNode = searchNode.next;
		}
		throw new Exception("search data do not exist");
	}
	
	public void changeData(Object data, int index) {
		try {
			Node changeNode = indexToNode(index);
			changeNode.data = data;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}