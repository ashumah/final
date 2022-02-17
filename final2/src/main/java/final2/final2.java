package final2;



class A{
	int a = 19;
	final void m1() {
		a=20;
		System.out.println("print the value a" +a);
		
	}
	void m2() {
		System.out.println("i am in method 2");
	}
	void m2(String s) {
		
	}
}

public class final2 extends A {
	void m2() {
		System.out.println("i am method m2 of final");
	}

	public static void main(String[] args) {
		A a = new A();
		final2 f =new final2();
		
		a.m1();
		a.m2();
		f.m2();
		System.out.println("methof of final");
		// TODO Auto-generated method stub

	}

}
