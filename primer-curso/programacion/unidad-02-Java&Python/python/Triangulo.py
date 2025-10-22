altura = int(input("Inserte la altura del triangulo: "))
texto = ""
for i in range(1,altura+1):
	for j in range(1,i+1):
		texto += "*"
	texto +="\n"
print(texto)

print("Programa Finalizado")