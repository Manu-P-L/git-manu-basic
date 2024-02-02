package Stream;

public class A {

	public static void main(String[] args) {
		// prime no or not

		int num=7;
		int count=0;
		
		if(num > 1) {
			for(int i=1; i<=num ; i++) {
				if(num % i ==0)
					count ++;
			}
			if(num % 2 ==0) {
				System.out.println("prime no");
			}else {
				System.out.println("not prime no");
			}
		
		}
		else {
			System.out.println("not prime no");
		}
	}

}
