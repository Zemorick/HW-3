
public class LinkedListNode<I extends Comparable> {
	private I data;
	LinkedListNode<I> next;

		public LinkedListNode(I d){
			data = d;
			next = null;
		}

	
		public LinkedListNode(I d, LinkedListNode<I> ln){
			data = d;
			next = ln;
		}
		
		public I getData(){
			return data;
		}
		
		public void setData(I d){
			data = d;
		}
		
		public I getNext(){
		return (I) next;	
		}
		
		public void setNext(LinkedListNode n){
			next = n;
		}
		
	
}
