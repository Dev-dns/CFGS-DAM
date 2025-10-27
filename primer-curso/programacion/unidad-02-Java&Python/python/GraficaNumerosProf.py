numeros = [-6,2,5,-14,15,3,-45,5,-4,7,1]
print(numeros)
texto = ""
menor = abs(min(numeros))
mayor = abs(max(numeros))

for i in numeros:
	if i < 0:
		texto+= " " * (menor - abs(i))
		texto+= "*" * abs(i)
		texto+="|"
		texto+="\n"
	if i >=0:
		texto+= " " * menor
		texto+="|"
		texto+= "*" * i
		texto+="\n"
print(texto)