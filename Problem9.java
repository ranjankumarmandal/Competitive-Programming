package Problems;

import java.util.ArrayList;

//Linear time approach to solve Stock Buy Sell Problem (generally used to get maximum profit)
class Interval {
	int buy, sell;
}

public class Problem9 {
	public void find(int[] price) {
		int n=price.length;
		
		if(n == 1)
			return;
		
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i=0, count=0;
		
		while(i < n-1) {
			while((i<n-1) && (price[i+1]<=price[i]))
				i++;
			
			if(i == n-1)
				break;
			
			Interval e = new Interval();
			e.buy = i++;
			
			while((i<n) && (price[i]>=price[i-1]))
				i++;
			
			e.sell = i-1;
			sol.add(e);
			
			count++;
		}
		
		if(count == 0)
			System.out.println("There is no profit in buying this stock!");
		else
			for(int j=0; j<count; j++)
				System.out.println("Buy on day: "+sol.get(j).buy+", Sell on day:"+sol.get(j).sell);
	}
	
	public static void main(String[] args) {
		Problem9 stock = new Problem9();
		int[] price = {100, 180, 260, 310, 40, 535, 695};
		
		stock.find(price);
	}
}