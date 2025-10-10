opcion = input("Inserte el tipo de operacion que quieres realizar (suma, resta, multiplicacion, division): ").lower()

#Comprobando valores iguales tendremos que utilizar la orden or mientras que comparando que 
# no sean iguales, utilizaremos and porque no podra ser ninguna de esas

if opcion != "suma" and opcion != "resta" and opcion != "multiplicacion" and opcion != "division":
	print("Operacion no valida")
	exit()

print("Continuar")

num1 = float(input("Numero 1º: "))
num2 = float(input("Numero 2º: "))


if opcion == "suma":
	resultado = num1 + num2
	print(f"{num1} + {num2} = {resultado}")
elif opcion == "resta":
	resultado = num1 - num2
	print(f"{num1} - {num2} = {resultado}")
elif opcion == "division":
	if num2 == 0:
		print("No se puede dividir entre cero")
	else:
		resultado = num1/num2 
		print(f"{num1} / {num2} = {resultado}")
elif opcion == "multiplicacion":
	resultado = num1 * num2
	print(f"{num1} * {num2} = {resultado}")


