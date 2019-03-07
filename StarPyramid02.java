public class StarPyramid02 {
    public static void main(String[] args) {
        System.out.print(starPattern(6));
    }

	public static String starPattern(int rows) {
		String s="";
		if(rows < 0) {
			 return "-1";
		 }
		else if(rows == 0) {
			return "-2";
		}
		 else {
			 
			 for(int  i= 1;i <= rows;i++) {
				
				 for(int k = rows;k > i;k--) {
					 s+=" ";
				 }
				 for(int j = 1; j <=i ;j++) {
					if(i==j) {
						s+="*";
					}
					else
					 s+="**";
				 }
				 s+="\n";
			 }
		 }
		return s;
	}
    }

