menu = "MENU\n---------\nSeleccione un numero\n--------\n1 - Suma \n2 - Resta\n3 - Multiplicacion\n4 - Division\n\nSelecciona una opcion: "
opcion = int(input(menu))

#Comprobando valores iguales tendremos que utilizar la orden or mientras que comparando que 
# no sean iguales, utilizaremos and porque no podra ser ninguna de esas

if opcion < 1 or opcion > 4:
	print("Operacion no valida")
	exit()


num1 = float(input("Numero 1º: "))
num2 = float(input("Numero 2º: "))


if opcion == 1:
	resultado = num1 + num2
	print(f"{num1} + {num2} = {resultado}")
elif opcion == 2:
	resultado = num1 - num2
	print(f"{num1} - {num2} = {resultado}")
elif opcion == 4:
	if num2 == 0:
		print("No se puede dividir entre cero")
	else:
		resultado = num1/num2 
		print(f"{num1} / {num2} = {resultado}")
elif opcion == 3:
	resultado = num1 * num2
	print(f"{num1} * {num2} = {resultado}")

