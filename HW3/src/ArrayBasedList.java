public class ArrayBasedList<T extends Comparable> implements ListInterface{

	Comparable<T>[] aBL;
	int count;
	
	public ArrayBasedList(){
		aBL = new Comparable[10];
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
		aBL[count]= element;
		count++;
		}
		
	}

	@Override
	public boolean add(Comparable element, int index) {
		
		if(index < 0 || index > 10){
			return false;
		}
		else{
			aBL[index] = element;
			return true;
		}
		
	}

	@Override
	public void addSorted(Comparable element) {
	
	for (int i = 0; i < aBL.length-1; i++){
	int prevIndex = 0;
	int nextIndex = i+1;
	
	if (aBL[i])
		
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
		aBL[index] = element;
		
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
		aBL = new Comparable[10];
		
	}

}



//find out what comparable means and stop casting it to int???

// it is a generic type <T>??