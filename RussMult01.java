public class RussMult01 {
    public static void main(String[] args) {
        int n1 = 25475;
        int n2 = 35655;
        System.out.println(getProduct(27, 35));
    }
    public static String getProduct(int num1, int num2) {
        String result="";
        int sum=0;
     
        if(num1 <= 0 || num2 <=0) {
        	return "-1";
        }
        else if(num1 >=100000 || num2 >= 100000) {
        	return "-2";
        }
        else {
        	while(num1 > 1) {
        		if((num1)%2 != 0) {
        			result+=num2+"+";
        			sum+=num2;
        		}
        		num1/=2;
        		num2*=2;
        		
        	}
        	if((num1)%2 != 0) {
    			result+=num2;
    			sum+=num2;
    		}
    		num1/=2;
    		num2*=2;

        	return result + " = "+ sum;
        }
        	
    }
}