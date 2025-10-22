altura = int(input("Inserte la altura de la piramide: "))
texto = ""

for i in range(altura,0,-1):
	for j in range(0, altura):
		if j < altura-i:
			texto+=" "
		else:
			texto+="*"
	texto+="\n"
print(texto)