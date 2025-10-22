while 1 != 0:
	print("\nTablas de Multiplicar en Rango\n---------------\nInstrucciones:\n- Si inserta 2 numeros iguales no se printeara ninguna tabla\n- Si el numero 1 es mayor que el numero 2 se hara desde el num1 hasta num2\n- Si el num2 es mayor que el num1 se hara dese num2 hasta num1")
	num1 = int(input(f"\nIntroduzca el 1º numero: "))
	num2 = int(input(f"\nIntroduzca el 2º numero: "))

	if num1 == num2:
		print("No existen tablas en medio ya que los numeros son iguales")
	elif num2 > num1:
		for i in range(num1,num2):
			for j in range (1,11):
				print(f"{i} x {j} : {i*j} ")
			print("\n")
	else: 
		for i in range(num2,num1):
			for j in range (1,11):
				print(f"{i} x {j} : {i*j} ")
			print("\n")

	salir = input("¿Quieres seguir? (Si / No): ")
	if salir.lower() == "si":
		continue
	else: 
		break 