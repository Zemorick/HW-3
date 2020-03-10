public class LinkedList<I extends Comparable> implements ListInterface {
	
	private LinkedListNode<I> head;
	
	
	public LinkedList(){
	head = null;	
	}
	
	@Override
	public int size() {
	int count = 0;
	LinkedListNode<I> curr = head;
	
	if (head == null){
		return count;
	}
	else{
		count++;
	}
	
	while (curr.next != null){
	curr = curr.next;
	count++;
	}
	return count;
	
		
	}
	
	@Override
	public boolean isEmpty() {
	if (head==null){
		return true;
	}
	return false;
	}

	@Override
	public void add(Comparable element) {
		LinkedListNode<I> curr = head;
		
		while (curr.next != null){
			curr = curr.next;
		}
		curr.next.setData((I) element); //??
		
	}

	@Override
	public boolean add(Comparable element, int index) {
		// TODO Auto-generated method stub
		
		
	
		
		
		return false;
		
		
	}

	@Override
	public void addSorted(Comparable element) {
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public Comparable get(int index) {
		int count = 0;
		while (count != index){
			
		}
		
		
	}

	@Override
	public Comparable replace(Comparable element, int index) {
	
	}

	@Override
	public boolean remove(int index) {
		if(index == 0){
			head = head.next;
			return true;
		}
		
		LinkedListNode<I> curr = head.next; 
		int doublenext = index-1;
		
		
		
		
		
		
		
	}

	@Override
	public void removeAll() {
		head = null;
		
	}

}
