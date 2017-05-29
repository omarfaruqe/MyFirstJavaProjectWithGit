package demo.vu;


public class HelloWorld {
	static int a, b;
	public static void main(String[] args) {
		//System.out.println("Hello " + args[0] +" "+ args[1]);
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		int sum = a + b;
		
		System.out.println(a + " + " + b + " = " + sum);

	}
}
