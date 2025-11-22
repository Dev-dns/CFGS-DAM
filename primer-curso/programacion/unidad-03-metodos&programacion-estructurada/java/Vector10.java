public class Vector10{
	public static void main(String[] args){
		int[] arr1 = crearArray(10);
		arr1 = inicArray(arr1);
		mostrarArray(arr1);
	}
	public static int[] crearArray(int tam){
		int[] arr1 = new int[tam];
		return arr1;
	}
	public static int[] inicArray(int[] array){
		for(int i = 0; i < array.length;i++){
			array[i] = 7;
		}
		return array;
	}
	public static void mostrarArray(int[] array){
		String texto = "";
		for(int i = 0;i < array.length;i++){
			if(i == array.length-1){
				texto+=array[i] + " ";
			}else{
				texto+=array[i] + ", ";
			}
		}
		System.out.print(texto + "\n");

	}
}