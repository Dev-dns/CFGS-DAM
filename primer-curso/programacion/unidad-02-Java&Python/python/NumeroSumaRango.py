while 1 != 0:

	num = int(input("Introduzca un numero: "))

	if num == 0 or num < 0:
		print("Introduzca un numero mayor que 0")
		continue
	sumapar = 0
	sumaimpar = 0 
	print(f"\nSuma de los numeros pares desde el 0 hasta {num}")
	if num != 2 and num != 1:
		for i in range(0,num):
			if i%2 == 0:
				sumapar += i
		print(sumapar)
	else:
		print(f"No hay numeros pares en el rango del {num}")

	print(f"\nSuma de los numeros impares desde el 0 hasta {num}")

	if num != 1:
		for i in range(0,num):
			if i%2 != 0:
				sumaimpar += i
		print(sumaimpar)
	else:
		print(f"No hay numeros impares en el rango del {num}")


	salir = input("¿Quieres seguir? (Si / No): ")
	if salir.lower() == "si":
		continue
	else: 
		break 
