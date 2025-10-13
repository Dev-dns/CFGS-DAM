import java.util.Scanner;

public class ArrayString{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		String[] textos = new String[3];

		for(int i = 0; i < textos.length; i++){
			System.out.print((i+1) + "º texto: ");
			textos[i] = teclado.nextLine().trim();
		}


		for(int i = 0; i < textos.length; i++){
			for(int j = 0; j < textos[i].length(); j++){

				if(textos[i].charAt(j) == ' '){
					System.out.print("\n");
				}else {
					System.out.print(textos[i].charAt(j));
				}

			}
			System.out.println();

		}

	}
}