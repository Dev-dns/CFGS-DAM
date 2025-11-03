import java.util.Scanner;

public class Fibonnaci{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int fibo;
		
		do{
			System.out.print("Introduzca el numero del termino de la sucesion de Fibonnaci: ");
			fibo = teclado.nextInt();
		}while(fibo < 0);


		int ter0 = 0;
		int ter1 = 1;
		int suma = 0;

		if (fibo == 0){
			System.out.println("El término es = 0");
		}else if (fibo == 1){
			System.out.println("El término es = 1");
		}else{
			for(int i = 2; i <= fibo;i++){
				suma = ter0 + ter1;
				ter0 = ter1;
				ter1=suma;
			}
			System.out.println("El termino es = " + suma);
		}

	}
}