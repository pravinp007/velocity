package controlstatement;

public class ElseifCondition {

	public static void main(String[] args) { // marks>80 marks>60 >40
		int marks = 56;

		 if (marks >= 80) {
		System.out.println("u got A grade");
		 } else if (marks >= 60) {
		 System.out.println("u got b grade");
		 } else if (marks >= 40) {
		 System.out.println("u got c grade");
		 } else {
		 System.out.println("u r failed");
		 }

		// if your marks are 66 to 90 then you r distinction
		// if your marks are 40 to 65 then you r distinction
		// if your marks are betwn 35 to 39 then you r distinction
		// else ur fail
		{
			int mark = 79;
			if (mark >= 66) {
				System.out.println("distinction");
			} else if (mark >= 40 & mark <= 65) {
				System.out.println("1st cls");
			} else if (mark >= 35 & mark <= 39) {
				System.out.println("passed");
			} else {
				System.out.println("fail");
			}

		}
	}

}
