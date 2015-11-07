import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args){
		int lado;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el tamaño del lado:");
		lado=in.nextInt();
		
		//parte de arriba.
		for(int i=0;i<lado;i++){
			for(int j = 0; j<lado-i-1;j++){
				System.out.print(" ");
			}	
			for(int k=0;k<(i+1)*2-1;k++){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		//parte de abajo.
        for(int i=lado;i>1;i--){
			for(int j = 0; j<lado-i+1;j++){
				System.out.print(" ");
			}	
			for(int k=0;k<i*2-3;k++){
				System.out.print("*");
			}
			
			System.out.println("");

        }
	}
}