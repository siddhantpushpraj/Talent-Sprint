public class RoundSum01 {
    public static void main(String[] args) {
        int a = 23, b = 0, c = 69;
        System.out.println(sumOfMultiples(a, b, c));
    }

    public static int sumOfMultiples(int a, int b, int c) {
         int sum=0;
         
         if(a <= 0 || b <= 0 || c<=0) {
        	 return -1;
         }
         else {
        	 sum+=nextMultipleOfTen(a);
        	 sum+=nextMultipleOfTen(b);
        	 sum+=nextMultipleOfTen(c);
         }
         return sum;
         
         
    }
    
    public static int nextMultipleOfTen(int num) {
    	if(num%10 != 0) {
    		return (10 - num%10) + num;
        }
        else {
        	return num;
        }
        
    }
}
