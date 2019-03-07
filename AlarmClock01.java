public class AlarmClock01 {
    public static void main(String[] args) {
        int day_of_week = 3;
        boolean onVac = true;
        System.out.println(ringAlarm(day_of_week, onVac));
    }

    public static String ringAlarm(int dayOfWeek, boolean onVac) {
        if((dayOfWeek >= 1 && dayOfWeek <=5 )&& onVac==true) {
        	return "10:00";
        }
        else if((dayOfWeek >= 1 && dayOfWeek <=5) && onVac==false) {
        	return "07:00";
        }
        else if((dayOfWeek == 0 || dayOfWeek == 6) && onVac==true) {
        	return "OFF";
        }
        else if((dayOfWeek == 0 || dayOfWeek == 6) && onVac==false) {
        	return "10:00";
        	
        }
        else {
        	return "Invalid Inputs";
        }
    }
}
