public class TwinPrimes01 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 15;
        System.out.println(twinPrimes(num1, num2));
    }

    public static String twinPrimes(int start, int limit) {
        int count=0;
    	String s="";
    	if(start <= 0 ||  limit <= 0) {
        	return "-1";
        }
        else if(start >= limit) {
        	return "-2";
        }
        else {
        	for(int i = start;i < limit;i++) {
        		if(isPrime(i)) {
        			
        			if(isPrime(i+2)) {
        				int j=i+2;
        				s+=i+":"+j+",";
        				
        			}
        		}
        	}
        }
    	
    	if(s.length()==0) {
    		return "-3";
    	}
    	else
    		return s.substring(0,s.length()-1);
    }

    public static boolean isPrime(int num) {
        boolean flag=true;
        if(num == 1) {
        	return false;
        }
        else {
    	for(int i = 2; i < num;i++) {
    		if(num % i== 0) {
    			flag=false;
    			break;
    		}
    	}
    	}
    	return flag;
    }
}
