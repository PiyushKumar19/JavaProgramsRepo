package Inheritence;

class A{
	void disp() {
		System.out.println("Hi from class A .");
	}
}
class B extends A{
	void dispB() {
		System.out.println("Hi from class B .");
	}
}
class C extends A{
	void dispC() {
		System.out.println("Hi from class C .");
	}
}
class D extends A{
	void dispD() {
		System.out.println("Hi from class D .");
	}
}

public class HierarichalInheritence {

	public static void main(String[] args) {
		B a1=new B();
		C a2=new C();
		D a3=new D();
		a1.disp();
		a1.dispB();
		a2.disp();
		a2.dispC();
		a3.disp();
		a3.dispD();

	}

}
