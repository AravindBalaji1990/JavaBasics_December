package SamplePrograms.InnerClassDemo;

public class Outer {
	// Simple nested inner class
	class Inner {
		public void show() {
			System.out.println("In a nested class method");
		}
	}

	public static void main(String[] args) {
		Inner in = new Outer().new Inner();
		in.show();

	}

}
