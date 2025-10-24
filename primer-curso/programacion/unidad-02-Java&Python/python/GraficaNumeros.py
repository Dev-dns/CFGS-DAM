numeros = [-6,2,5,-14,15,3,12,5,-4,7,1]
menor = 5
texto =""

print(numeros)
menor = abs(min(numeros))


for i in numeros:
	if i >=0:
		espacios = (menor) 
		texto += " " * espacios
		texto+="|"
		texto+="*" * i

	if i < 0:
		espacios = (menor) - abs(i)
		texto += " " * espacios
		texto+= "*" * abs(i)
		texto+= "|"

	texto+="\n"

print(texto)