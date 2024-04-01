package sample04;

public class ForSample3 {

	public static void main(String[] args) {

		int[] array = {10, 20, 30, 40};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int[] array2 = {100, 200, 300, 400};
		for(int a:array2) {
			System.out.println(a);
		}
	}
}
