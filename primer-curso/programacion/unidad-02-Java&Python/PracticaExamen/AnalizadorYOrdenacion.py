numeros = [1,3,4,6,7,8,4,2,2]

opcion = int(input("¿Que orden quieres utilizar (Ascendente (1) o Descendente (2))?:"))

for i in range(0,len(numeros)):
	for j in range(i,len(numeros)):
		if (opcion == 1 and numeros[i] > numeros[j]) or (opcion ==2 and numeros[i] < numeros[j]):
			aux = numeros[i]
			numeros[i] = numeros[j]
			numeros[j] = aux

print(numeros)