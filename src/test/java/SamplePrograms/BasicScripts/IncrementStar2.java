package SamplePrograms.BasicScripts;

public class IncrementStar2 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 6; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
