
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		adder(12,8);
	}
	
	public static int adder(int val1, int val2)
	{
		int result;
		int rest;
		result = val1 + val2;
		System.out.println(result);
		result = val1 - val2;
		System.out.println(result);
		result = val1*val2;
		System.out.println(result);
		result = val1%val2;
		rest = val1*val2 - val1*(val1%val2);
		System.out.println(result + "and" + rest);
		System.out.println("Hello world");
		return 0;
	}
}
