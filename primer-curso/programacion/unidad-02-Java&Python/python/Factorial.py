numero = -1
while numero < 0:
	numero = int(input("Introduza un numero para calcular su factorial: "))
	if numero < 0:
		print("ERROR: El numero no puede ser negativo")

if numero == 0 or numero == 1:
	print(f"{numero} + ! = 1")
else:
	factorial = 1
	texto = f"{numero} ! ="
	for i in range(1,numero+1):
		factorial = factorial * i
		texto += f"{i}"
		if i < numero:
			texto+=" x "
	print(f"{texto} = {factorial}")


