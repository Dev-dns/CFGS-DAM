#Pedir un numero y comprobar si es par e impar, que repita el proceso hasta que se introduzca el cero que finalizara
while (1 != 0):
	numero = int(input("Introduzca un numero entero: "))
	if(numero==0):
		print("Programa finalizado")
		break
	elif(numero%2==0):
		print("El numero es par")
		continue
	else:
		print("El numero es impar")
		continue
