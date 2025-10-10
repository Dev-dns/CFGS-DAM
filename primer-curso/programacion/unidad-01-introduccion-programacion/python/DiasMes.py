mes = int(input("Introduzca un numero de un mes (1-12): "))

if mes == 2:
	print("Tiene 28 dias")
elif mes == 4 or mes == 6 or mes == 9 or mes == 11:
	print("Tiene 30 dias")
elif mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 10 or mes == 12 or mes == 8:
	print("Tiene 31 dias")
else:
	print("El numero de mes no es valido")

