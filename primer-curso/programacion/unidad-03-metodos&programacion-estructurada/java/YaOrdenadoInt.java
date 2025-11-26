public class YaOrdenadoInt{
	public static void main(String[] args){
		int[] vect = {1,4,1,2,3,5,6};
		if(yaOrdenadoInt(vect) == true){
			System.out.println("El array esta ordenado");
		}else{
			System.out.println("El array no esta ordenado");
		}

		System.out.println(yaOrdenadoInt(vect) ? "El primer array esta ordenado" : "El primer array no esta ordenado");

	}
	public static boolean yaOrdenadoInt(int[] vect){
		for(int i = 0; i < vect.length-1;i++){
			if(vect[i] > vect[i+1]){
				return false;
			}
		}
		return true;
	}
}