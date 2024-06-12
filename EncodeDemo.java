package function;
import java.util.Scanner;

public class EncodeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a 4-digit number: ");
		int num = sc.nextInt();
		while(num > 9999 || num < 1000) {
			System.out.println("Invalid input. Please enter again: ");
			num = sc.nextInt();
		}
		int s = num % 10;
		int t = num/10%10;
		int h = num/100%10;
		int th = num/1000%10;
		int[] arr = {th,h,t,s};
		for(int i=0;i<4;i++) {
			arr[i] = (arr[i]+5)%10;
		}
		for(int start=0, end = arr.length-1;start<=end;start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		int num2 = 1000*arr[0]+100*arr[1]+10*arr[2]+arr[3];
		System.out.println("The encoded number is: " + num2);
	}
	
}
