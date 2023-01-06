package randoms;

import java.util.Arrays;

public class IceCreamBars {
	class Solution {
		public static int maxIceCream(int[] costs, int coins) {
			int count=0;
			Arrays.sort(costs);
			for(int j=0;j<costs.length;++j) {
			if(costs[j]<=coins) {
	      		coins=coins-costs[j];
				count++;
			   }
			}
			return count;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,6,3,1,2,5};

		System.out.println("No of icecream= "+Solution.maxIceCream(arr,20)); 
	}

}
