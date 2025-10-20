numeros = [6,3,2,7,1,9]

print(f"Array de numeros: {numeros}")


for i in range(0,len(numeros)):
	num = ""
	for j in range(0,numeros[i]):
		num+= str(numeros[i])
	print(f"{num}")
