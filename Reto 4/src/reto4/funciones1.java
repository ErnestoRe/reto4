package reto4;

public class funciones1 {
	public static void dimelo(int producto, int num) {// hace una piramide
		for (producto = 4, num = 1; producto >= 0; producto--, num += 2) {
			System.out.println();
			for (int i = 0; i <= producto; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= num; j--) {
				System.out.print("*");
			}
		}
	}
}
