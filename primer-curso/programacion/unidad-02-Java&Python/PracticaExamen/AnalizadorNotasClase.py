while True:
	numero = 0
	notas = [];

	while numero <= 0:
		numero = int(input("¿Cuántas notas quieres introducir?: ")) 

	for i in range(1,numero+1):
		nota = -1
		while nota < 0 or nota > 10:
			nota = (float(input(f"Introduzca la {i}º nota: ")))
		notas.append(nota)

	while 1 != 6:
		opcion = -1
		while opcion < 0 or opcion > 6:
			opcion = int(input("\nAcciones Disponibles\n----------\n1 - Mostrar todas las notas\n2 - Calcular la nota media\n3 - Mostrar la nota mas alta\n4 - Mostrar la nota mas baja\n5 - Buscar una nota(Inserte una nota y le decimos si esta en la lista y cuantas veces)\n6 - Salir\nIntroduzca su opcion: "))

			print("\n")
			if opcion == 6:
				print("Programa finalizado")
				exit()
			elif opcion == 1:
				for i in notas:
					print(i)
			elif opcion ==2:
				suma = 0	
				for i in notas:
					suma+=i
				print(f"La nota media es: {suma/numero}")
			elif opcion ==3:
				print(f"La nota mas alta ha sido: {max(notas)}")
			elif opcion ==4:
				print(f"La nota mas baja ha sido: {min(notas)}")
			elif opcion ==5:
				esta = False
				buscar = float(input("Introduzca el numero a buscar: "))
				for i in notas:
					if i == buscar:
						esta = True
						break
				if esta == True:
					print(f"El numero {buscar} aparece en la lista {notas.count(buscar)} veces")
				else: 
					print(f"El numero {buscar} no aparece en la lista")