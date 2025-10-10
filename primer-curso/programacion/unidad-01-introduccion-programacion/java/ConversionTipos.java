public class ConversionTipos {

	public static void main(String[] args){

		int num1 = 100;
		double num2 = 2345.45;
		byte num3 = (byte) num1; //Le ponemos (tipo) delante del valor a asignar para realizar la conversion 
		//del tipo de variable anterior al que queramos, generalmente el mismo del de la variable a asignar.

		//El tipo byte solo utiliza 8 bits y almacena valores de entre -128 a 127

		System.out.println("num1 " + num1);
		System.out.println("num3 " + num3);

		//Esto lo que hará será eliminar la parte decimal del numero, mostrando nada mas la parte entera
		int num4 = (int) num2; 
		System.out.println(num2 + " convertido a entero es " + num4);

		byte num5 = (byte) 3456.556f; //Los valores float se le pone f al final
 		System.out.println("El float 3456.556 convertido a byte es " + num5);
 		//Le da el valor -128 ya que no es capaz de almacenar dicho valor.

	}
}