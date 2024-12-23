package customexceptions;

public class TestUserDefinedException {

	// this is a user defined method which makes use of the customized exception
	// created by user
	public void exceptionuserdefined() {
		int a = 2;
		int b = 1;
		if (a > b) {
			try {
				throw new TestExceptionDemouserSample2("this logic will fail retry sample exception");
			} catch (TestExceptionDemouserSample2 e) {
				e.printStackTrace();
			}

        }
		System.out.println("logic is success");
	}

	public static void main(String[] args) {
		// We are calling a non-static in a main method with the help of object
		TestUserDefinedException obj = new TestUserDefinedException();
		obj.exceptionuserdefined();
	}

}
