import java.util.Arrays;


public class Max3Num01 {
    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 56;
        int n3 = -5;
        System.out.println(getMaxNumber(n1, n2, n3));
    }

    public static int getMaxNumber(int num1, int num2, int num3) {
       if(num1 <= 0 || num2 <= 0 ||num3 <= 0 ) {
    	   return -1;
       }
       else {
    	   int[] arr= {num1,num2,num3};
    	   Arrays.sort(arr);
    	   return arr[2];
       }
    }
}
