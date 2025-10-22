while 1 != 0:

	num = int(input("Introduzca un numero: "))

	if num == 0 or num < 0:
		print("Introduzca un numero mayor que 0")
		continue

	print(f"\nNumeros pares desde el 0 hasta {num}")
	if num != 2 and num != 1:
		for i in range(0,num):
			if i%2 == 0:
				print(i)
	else:
		print(f"No hay numeros pares en el rango del {num}")

	print(f"\nNumeros impares desde el 0 hasta {num}")

	if num != 1:
		for i in range(0,num):
			if i%2 != 0:
				print(i)
	else:
		print(f"No hay numeros impares en el rango del {num}")

	salir = input("¿Quieres seguir? (Si / No): ")
	if salir.lower() == "si":
		continue
	else: 
		break