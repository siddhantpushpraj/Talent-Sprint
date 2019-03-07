import java.util.Scanner;

public class NextHundred01 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(getNextMultipleOf100(num));
	}
	
	public static int getNextMultipleOf100(int num) {
		if(num <= 0) {
			return -1;
		}
		else
			return (100 - num%100) + num;
	}
}