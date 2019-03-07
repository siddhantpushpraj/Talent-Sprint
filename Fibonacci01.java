/*
 public class Fibonacci01 {
	public static void main(String[] args) {
	 	System.out.println(getFibonacciSeries(40));
	}
	public static String getFibonacciSeries(int num) {
        String s="0";
        int a=0,b=1,sum=0;
       
        if(num<1 || num>40 ) {
        	return "-1";
        }
        else {
        	for(int i = 1;i < num;i++) {
        		a=b;
        		b=sum;
        		sum=a+b;
        		 s+=","+sum;
        	}
        	return s;
        }
    }
}
 */

public class Fibonacci01 {
	public static void main(String[] args) {
	 	System.out.println(getFibonacciSeries(8));
	}
	public static String getFibonacciSeries(int num) {
		String s1="";
		if(num<1 || num>40)
        {
			 return "-1";
        }
		else
		{
			int a=0;
        	int b=1;
        	int c=a+b;
        	while((num-1)!=0)
        	{
        		
        		s1=s1+","+c;
        		c=a+b;
        		a=b;
        		b=c;
        		num--;
        	}
        	return "0"+s1;
		}
		
    }
}
 