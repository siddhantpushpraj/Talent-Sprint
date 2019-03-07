

public class Armstrong01 {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 16;
        System.out.println(generateArmstrongNums(num1, num2));
    }
    
    public static String generateArmstrongNums(int start, int limit) {
       
    	String result="";
    	int count=0;
    	
    	if(start <= 0 || limit <= 0 ) {
        	return "-1";
        }
        else if(start >= limit) {
        	return "-2";
        }
        else {
        	for(int i = start ; i <= limit ; i++ ) {
        		
        		if(isArmstrong(i)) {
        			count++;
        			result+=i+",";
        		}
        	}
        }
    	
    	if(count > 0) {
    		result=result.substring(0,result.length()-1);
    		return result.trim();
    	}
    	else
    		return "-3";
    }

    public static boolean isArmstrong(int num) {
        int armstrongNum=sumOfPowersOfDigits(num);
        if(num == armstrongNum) {
        	return true;
        }
        else {
        	return false;
        }
    }

    public static int sumOfPowersOfDigits(int n) {
       int sum = 0;
       int[] digits = getDigits(n);
       for(int i = 0; i < digits.length ; i++) {
    	   sum+=power(digits[i], digits.length);
       }
       return sum;
    }

    public static int[] getDigits(int n) {
    	int[] digits=new int[(n+"").length()];
    	int index=0;
    	while(n != 0) {
    		digits[index] = n%10;
    		n/=10;
    		index++;
    	}
    	return digits;
    }

    public static int power(int d, int p) {
        return (int)Math.pow(d,p);
    }
}
