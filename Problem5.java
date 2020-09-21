package Problems;

//Greedy Techniques to find minimum number of platforms required for trains.

public class Problem5 {
	public static int maxNeededPlatform(int[] arrivalTimeArray, int[] departureTimeArray) {
		int i=0, j=0, platformNeeded=0, maxPlatformNeed=0;
		
		while(i < arrivalTimeArray.length && j < departureTimeArray.length) {
			if(arrivalTimeArray[i] < departureTimeArray[j]) {
				i++;
				platformNeeded++;
				if(platformNeeded > maxPlatformNeed)
					maxPlatformNeed = platformNeeded;
			}
			
			else {
				j++;
				platformNeeded--;
			}
		}
		
		return maxPlatformNeed;
	}
	
	public static void main(String[] args) {
		int[] arrivalArray = {900, 940, 950, 1100, 1500, 1800};
		int[] departureArray = {910, 1200, 1120, 1130, 1900, 2000};
		
		System.out.println("Maximum Needed Platform for trains are: "+maxNeededPlatform(arrivalArray, departureArray));
	}
}
