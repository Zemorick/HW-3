import java.lang.reflect.Array;

public class ArrayBasedList<T extends Comparable> implements ListInterface{

	T[] aBL;
	int count;
	
	public ArrayBasedList(){
		aBL = (T[]) Array.newInstance(Comparable.class, 10);
		count = 0;
	}
	
	
	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
		
	}

	@Override
	public void add(Comparable element) {
		if(count != 10){
		aBL[count]= (T) element;
		count++;
		}
		
	}

	@Override
	public boolean add(Comparable element, int index) {
		
		if(index < 0 || index > 10){
			return false;
		}
		else{
			aBL[index] = (T) element;
			return true;
		}
		
	}

	@Override
	public void addSorted(Comparable element) {
	
	for (int i = 0; i < aBL.length-1; i++){
	
		int nextIndex = i+1;
		int prevIndex = 0;
		
		if (i-1 < 0){
		prevIndex = 0;
		}
	else{
		prevIndex = i-1;
	}
	
	
	if (element.compareTo((T) aBL[prevIndex]) >= 0 || element.compareTo((T) aBL[nextIndex]) <= 0){	
		aBL[i] = (T) element;
		break;
	}
		
	}
	
	}

	@Override
	public Comparable get(int index) {
		
		return aBL[index];
	}

	@Override
	public Comparable replace(Comparable element, int index) {
		if(index < 0 || index > 10){
			return null;
		}
		
		Comparable temp = aBL[index];
		aBL[index] = (T) element;
		
		return temp;
		
		}
	

	@Override
	public boolean remove(int index) {
		if(index < 0 || index > 10){
			return false;
		}
		else{
			aBL[index] = null;
			return true;
		}
	}

	@Override
	public void removeAll() {
		aBL = (T[]) new Comparable[10];
		
	}

}





// it is a generic type <T>??