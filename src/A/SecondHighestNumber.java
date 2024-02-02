package A;
public class SecondHighestNumber {
    public static void main(String[] args) {
        
    	int num [] = {1,2,4,5,9,5 };
        int n= num.length;
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        // Traversing an array
        
        for(int i=0; i<n ; i++) {
        	
        	if (num [i] > highest) {
        		
        		secondHighest = highest;
        		highest=num[i];
        		
        	}
        	
        	if(num[i] < highest && num[i] > secondHighest ) {
        		secondHighest = num[i];
        	}
        }
        
        System.out.println("second highest number " + secondHighest);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
