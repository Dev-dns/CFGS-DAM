altura = int(input("Inserte la altura de la piramide: "))
texto = ""

for i in range(altura+1):
	for j in range(0, altura-i):
		texto+=" "
	for j in range(2*i-1):
		texto+="*"
	texto+="\n"
print(texto)