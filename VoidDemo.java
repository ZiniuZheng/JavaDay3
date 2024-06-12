package function;

public class VoidDemo {

	public static void main(String[] args) {
		printNum();
	}
	
	public static void printNum(){
		for(int i=100;i<1000;i++) {
			int s = i%10;
			int t = i/10%10;
			int h = i/100%10;
			if((s*s*s+t*t*t+h*h*h)==i) {
				System.out.println(i);
			}
		}
		
	}

}
