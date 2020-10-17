package recursion;

public class PetrolPumpwithMinDistance {
	
	void petrol(int[] petrol, int[] distance, int index, int sol) {
		if(petrol[index]-distance[index] > 0) {
			System.out.println(sol);
			return;
		}
		
		petrol(petrol, distance, index+1, sol+1);
	}
	
	public static void main(String[] args) {
		PetrolPumpwithMinDistance obj = new PetrolPumpwithMinDistance();
		int[] petrol = {4, 6, 7, 4};
		int[] distance = {6, 5, 3, 5};
		
		obj.petrol(petrol, distance, 0, 1);
	}

}
