public class Palindrome01 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num) {
      int num2=num;
      int count=0;
      while(num2!=0) {
    	  num2/=10;
    	  count++;
      }
      if(count!=3 || num<=0) {
    	  return -1;
      }
      else
      {
    	  int rem=0,num1;
    	  num1=num;
    	  while(num1!=0) {
    		  rem=rem*10+num1%10;
    		  num1=num1/10;
    	  }
    	  if(num==rem) {
    		  return 1;
    	  }
    	  else
    		  return 0;
      }
    	  
    }
}