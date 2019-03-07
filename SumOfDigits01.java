
public class SumOfDigits01 {
    public static void main(String[] args) {
        int num = 799;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num)	{
    	if(num < 10 || num >= 100) {
    	
    	return 0;
    	}
    	else
    		return num%10 + num/10;
	    
    }
}