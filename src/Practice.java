
public class Practice {

	public static void main(String[] args) {
		// print ------->sum of even numbers from 1 to 10
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of all even from 1 to 10 is:" + sum);
        System.out.println("==============================##########################==");
		// print------->prime number from 100 to 20

		for (int a = 100; a >= 20; a = a - 3) {
			System.out.println(a);
		}
	}
}
