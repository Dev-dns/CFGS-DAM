lado = int(input("Introduza la longitud del lado: "))

texto=""

for i in range(1, lado+1):
	for j in range(1, lado+1):
		if i == 1 or i == lado or j == 1 or j == lado : 
			texto+="* "
		else: 
			texto+="  "
	texto+="\n"
print(texto)