public class Driver implements DriverInterface{
	
	public Driver(){
		TestTimes tt = new TestTimes();
	}
	
	@Override
	public ListInterface<Integer> createList(ListType listType, TestType forTestType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListInterface<Integer> initializeList(ListInterface<Integer> list, int firstNumber, int lastNumber,
			int increment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double memoryUsage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TestTimes runTestCase(ListType listType, TestType testType, int numberOfTimes) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void main(String[] args){
		
	}
	
	
}


