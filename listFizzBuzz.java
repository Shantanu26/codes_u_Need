package randoms;

import java.util.ArrayList;
import java.util.List;

public class listFizzBuzz {

	public static void main(String[] args) {
		int n=100;
		int num=1;
		boolean flag=true;
		List<String> li=new ArrayList<>();

		int choice=0;
		if(n%3==0 && n%5==0 && flag) {
			flag=false; 	
			choice=1;
		}
		if(n%3==0 && flag){
			flag=false; 
			choice=2;
		}
		if(n%5==0 && flag){
			flag=false; 
			choice=3;
		}else if(flag){
			flag=false;
			choice=4;
		}

		switch(choice) {

		case 1: 
			for(int i=1;i<=n;++i) {
				if(i%3==0 && i%5==0) {
					li.add(i-1, "FizzBuzz");	

				}else
					if(i%3==0) {
						li.add(i-1, "Fizz");

					}else
						if(i%5==0) {
							li.add(i-1, "Buzz");

						}
						else {
							String s=Integer.toString(num);
							li.add(i-1,s);

						}
				num++;
			}
			break;
		case 2:
			for(int i=1;i<=n;++i) {
				if(i%3==0 && i%5==0) {
					li.add(i-1, "FizzBuzz");	

				}else
				if(i%3==0) {
					li.add(i-1, "Fizz");

				}else
					if(i%5==0) {
					li.add(i-1, "Buzz");

				}
				else {
					String s=Integer.toString(num);
					li.add(i-1,s);
				}
				num++;
			}
			break;
		case 3:
			for(int i=1;i<=n;++i) {
				if(i%3==0 && i%5==0) {
					li.add(i-1, "FizzBuzz");	

				}else
				if(i%3==0) {
					li.add(i-1, "Fizz");

				}else
				if(i%5==0) {
					li.add(i-1, "Buzz");

				}
				else {
					String s=Integer.toString(num);
					li.add(i-1,s);
				}
				num++;
			}	
			break;
			
		case 4:
			for(int i=1;i<=n;++i) {
				String s=Integer.toString(num);
				li.add(i-1,s);
				num++;
			}
			 break;

		}
        
		for(int i=1;i<=li.size();++i) {
			System.out.print(li.get(i-1)+",");
		}

	}

}
