package SamplePrograms.InnerClassDemo;

public class Outer_1 {
	void outerMethod() {
		System.out.println("inside outerMethod");
		// Inner class is local to outerMethod()
		class Inner {
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}

class MethodDemo {
	public static void main(String[] args) {
		Outer_1 x = new Outer_1();
		x.outerMethod();
	}

}
