public class OddPalindromes01 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 5000000;
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) {
        String s=" ";
        int count=0;
        int reverseNum;
        if(start <= 0 || limit <=0) {
        	return "-1";
        }
        else if(start>=limit) {
        	return "-2";
        }
        else {
        	for(int i = start; i <= limit ; i++) {
        		
        		
        		if(isAllDigitsOdd(i)) {
        			if(isPalindrome(i)) {
        				count++;
        				s+=i+",";
        			}
        			
        		}
        		
        	}
        }
        if(count > 0) {
        	s = s.substring(0 , s.length()-1);
        return s.trim();
        }
        else
        	return "-3";
    }

    public static boolean isPalindrome(int num) {
    	int reverseNum=reverse(num);
    	if(reverseNum == num) {
    		return true;
    		
    	}
    	else
    		return false;
    }

    public static int reverse(int num) {
        		
    	int reverse=0;
    	while(num!=0) {
    		
    		reverse=reverse * 10 + num % 10;
    		num/=10;
        			
        		}
    	return reverse;
    }

    public static boolean isAllDigitsOdd(int num) {
        int check=0;
        int digit;
        while(num!=0) {
        	
        	digit=num%10;
        	if(digit%2 == 0 && digit !=0 ) {
        		check=1;
        	}
        	num/=10;
        }
        if(check == 0) {
        	return true;
         }
        else
        	return false;
    }
}

