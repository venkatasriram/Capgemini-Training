package Excepion;

public class test {
	public static void main(String[] args) {
		int a =10;
		int b = 10;
		try {
			int c = a/b;
			System.out.println(c);
			}
		catch(Exception r)
		{
			System.out.println("zero cannot divided = "+r);
			}
		finally {
			System.out.println("enter again");
			}
		demo ex = new demo();
		ex.array();
		}
}
