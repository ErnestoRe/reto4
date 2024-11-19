package reto4;

import java.util.Scanner;

public class reto4 {
	// este main calcula los multiplos de un número y luego con
	// la funcion hace una piramide con es numero de estrellas

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int producto = 0;
		//Aqui pide un número 
		System.out.println("Introduce un número");
		funciones.dimeEntero(null, sc);
		do {
			for (i = num; i <= 0; i--)
				;
			{

				producto = num * i;
			}

		} while (producto != 0);
		funciones1.dimelo(producto, num);
	}
	

}
