numeros = [1,4,5,6,1]

#version for each

for num in numeros:
	print(f"Numeros: {num}");

#Imprimir todo en una misma linea

texto = ""

for num in numeros: 
	texto += str(num) + " "

print(texto)

#For in range
for i in range(10):
	print(i)

print("")
#Establecemos desde donde empieza hasta que sea menor que el segundo numero
for i in range(5,10):
	print(i)


texto ="\nNumeros: "

for i in range(5):
	texto += str(numeros[i]) + " "
print(texto)


#Printeamos longitud del array
print(f"Longitud del array: {len(numeros)}")

