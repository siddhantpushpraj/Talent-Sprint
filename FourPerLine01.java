public class FourPerLine01 {
    public static void main(String[] args) {
        int num = 199;
        System.out.println(getFourPerLine(num));
    }

	public static String getFourPerLine(int num) {
        String s=""; 
        int i;
        if(!(num >= 1 && num <=99)) {
        	return "-1";
        }
        
			 for(i= 1;i <= num;i++) {
				if(i%4 == 0) {
					if(i <= 9) {
						s+=" "+i+"\n";
						
					}
					else {
						s+=i+"\n";
						
					}
				}
				else {
					if(i<=9) {
						s+=" "+i+" ";
					}
					else {
						s+=i+" ";
					}
				}
			 }
			 
			 return s;
		 }
		
		
         
	
}
