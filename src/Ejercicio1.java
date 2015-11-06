import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num, numFin, ultimaCifra;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número:");
		num = entrada.nextInt();

		numFin = 0;		//Se va guardando el numero invertido.
		ultimaCifra = 0;	//Se van guardando las cifras del numero recivido desde la ultima a la primera.
		//se van cogiendo cifras de num y se van introduciendo en numFin en orden inverso.
		while (num != 0) {
			ultimaCifra = num % 10;
			num = num / 10;
			numFin = numFin * 10 + ultimaCifra;
		}
		
		numFin =numFin*2;
		
		System.out.println("El número resultante es:"+numFin);

	}

}
