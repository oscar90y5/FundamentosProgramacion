import java.util.Scanner;


public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero:");
		int numero = in.nextInt();
		primos(numero);
	}
	
	static void primos(int numero){
		for(int i=numero-1;i>0;i--){
			if(numero%i==0){
				System.out.println(numero/i);
				numero=i;
			}
			
		}
		
	}

}
