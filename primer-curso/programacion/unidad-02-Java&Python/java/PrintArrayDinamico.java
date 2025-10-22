public class PrintArrayDinamico{
	public static void main(String[] args){

		String texto = "";

		int[] numeros = {2,4,6,1,7};

		for(int i = 0; i < numeros.length; i++){
			for(int j = 0; j < numeros[i]; j++){
				System.out.print(numeros[i] + " ");
			}
			System.out.println();
		}
	}
}
