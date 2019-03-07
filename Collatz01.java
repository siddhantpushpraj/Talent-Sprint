public class Collatz01 {
    public static void main(String[] args) {
        System.out.println(getCollatzSequence(3));
    }

    public static String getCollatzSequence(int number) {
	   int counter=0;
	   String result=number+" ";
	   if(number <= 0) {
		   return "Error";
	   }
	   else if(number == 1){
		   return "1 4 2 1";
		  
	   }
	   else if(number == 2) {
		   return "2 1 4 2 1";
	   }
	   else {
		   while(counter < 100 && number!=1) {
			   if(number%2 == 0) {
				   number/=2;
				   result+=number+" ";
			   }
			   else  if(number%2 != 0){
				   number*=3;
				   number++;
				   result+=number+" ";
			   }
			   counter++;
		   }
		   if(counter>=100) {
			 //  System.out.println(counter);
			   return "Does not Converge";
		   }
		   else {
			   return result.trim();
		   }
	   }
	   
	}
}

