precio = float(input("Introduzca el precio del producto: "))
if precio <= 0:
	print("El precio no es valido")
	exit()
descuento = int(input(f"Introduzca el % descuento a aplicar: "))
if descuento > 100 or descuento < 0:
	print("El descuento no es valido")
	exit()


print(f"El precio final tras aplicar el decuento es: {precio - (precio*(descuento/100))}$")

