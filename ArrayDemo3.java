package Array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] arr = {100,232,33,47,579,61,73,84};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<=arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
