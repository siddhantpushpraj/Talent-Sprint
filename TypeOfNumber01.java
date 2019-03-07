public class TypeOfNumber01 {
    public static void main(String[] args) {
        int num = 12;
        int res = sumOfProperDivisors(num);
        if (res == 0)
            System.out.println("Perfect Number");
        else if (res == 1) 
            System.out.println("Abundant Number");
        else if (res == -1)
            System.out.println("Deficient Number");
        else
            System.out.println("Please Enter Positive Number");
    }

    public static int sumOfProperDivisors(int num) {
    	int sum = divisorSum(num);
    	if(num < 0) {
    		return -2;
    	}
    	else if(num == 0) {
    		return -3;
    	}
    	else if(num == sum) {
        	return 0;
        }
        else if(num < sum) {
        	return 1;
        }
        else {
        	return -1;
        }
    }
    
    public static int divisorSum(int num) {
    	int sum = 0;
    	
    	for(int i = 1; i < num;i++) {
    		if(num % i == 0) {
    			sum+=i;
    		}
    	}
    	return sum;
    }
}

