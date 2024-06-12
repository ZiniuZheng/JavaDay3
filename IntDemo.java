package function;

public class IntDemo {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		change(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void change(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				arr[i] *= 2;
			}
		}
	}
}
