public class JulianDate01 {
    public static void main(String[] args) {
        String date = "23-jan-2016";
        System.out.println(dateFormat(date));
    }
   
    public static String dateFormat(String date) {
       String[] newdate = date.split("-");
       int day =  Integer.parseInt(newdate[0]);
       int month = convertMMMtoMM(newdate[1]);
       String date1 = julianDate(day,month);
       
       
       return (newdate[newdate.length - 1]+date1).trim();
    }
   
   public static String julianDate(int dd, int mon) {
   
	   int[] day = {0,31,59,90,120,151,181,212,243,273,304,334,365};
	   	int date = day[mon - 1] + dd;
	   	if(date <= 9) {
	   		return ("00"+date);
	   	}
	   	if(date <= 99) {
	   		return ("0"+date);
	   	}
	   	else
	   		return ""+date;
	   
   }
   
   public static int convertMMMtoMM(String mon) {
	  mon = mon.substring(0, 3);
	   mon=mon.toUpperCase();
      String month = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
     // System.out.println(month.indexOf(mon)/3);
      return(month.indexOf(mon)/3) + 1;
      
   }
}
