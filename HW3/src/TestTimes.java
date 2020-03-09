public class TestTimes implements TestTimesInterface {
	
	long[] tt;
	int numItems;
	
	public TestTimes() {
	long[] tt = new long[10];
	int numItems = 0;
	}
	
	@Override
	public long getLastTestTime() {
		return tt[numItems];
	}

	@Override
	public long[] getTestTimes() {
		return tt;	
	}

	@Override
	public void resetTestTimes() {
		
	long[] tt = new long[10];
	numItems = 0;
		
	}

	@Override
	public void addTestTime(long testTime) {
		if (numItems != 10){
			tt[numItems] = testTime;
		}
		
		numItems++;
		
	}

	@Override
	public double getAverageTestTime() {
			
		double average = 0;
		
		for(int i = 0; i < numItems; i++){
		average += tt[i];
		}
		
		if (average == 0)
		return 0;
		
		return average/numItems;
		
		// if numItems = 0 it might cause a bug
	}

}
