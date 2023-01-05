package randoms;

import java.util.Arrays;

public class cookies {

	public static void main(String[] args) {
     cookies obj=new cookies();
     int [] g=new int[] {10,9,8,7};
     int [] s=new int[] {5,6,7,8};
     
     System.out.println(obj.findContentChildren(g,s));

	}
	public int findContentChildren(int[] g, int[] s) {
		int temp=0;
		Arrays.sort(g);
		Arrays.sort(s);
	   	
    	int i=0;
    	int j=0;
    	
    	while(i<g.length && j<s.length) {
    		if(g[i]<=s[j]) {
    			temp++;
                i++;
    		}j++;
    	}
	
        return temp;
	}

}
