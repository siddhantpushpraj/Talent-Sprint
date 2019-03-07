public class LuckyNumber01 {
    public static void main(String[] args) {
        String date = "15-NOV-2016";
        System.out.println(getLuckyNumber(date));
    }

    public static int getLuckyNumber(String date) {
        String[] luckNumber = date.split("-");
        int MonthToNum = convertMMMtoMM(luckNumber[1]);
        int monthSum = getSumOfDigits(MonthToNum);
        int daySum = getSumOfDigits(Integer.parseInt(luckNumber[0]));
        int yearSum = getSumOfDigits(Integer.parseInt(luckNumber[luckNumber.length-1]));
       
        int luckyNumber=monthSum + yearSum + daySum;
        while(luckyNumber > 9)
        	luckyNumber = getSumOfDigits((luckyNumber));
        return luckyNumber;
    }

    public static int convertMMMtoMM(String mon) {
    	 mon = mon.substring(0, 3);
  	     mon=mon.toUpperCase();
        String month = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
        return(month.indexOf(mon)/3) + 1;
    }
    
    public static int getSumOfDigits(int num) {
    	 
        	 int sum = 0;
        	 
        	 while(num != 0 ) {
         		sum+=num%10;
         	   	 num/=10;
         	}  
        	
         
         return sum;
    }
    
   
}
