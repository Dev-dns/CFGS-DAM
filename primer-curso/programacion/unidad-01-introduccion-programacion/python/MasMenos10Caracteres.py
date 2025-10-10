#Pedir al usuario un texto y que diga si tiene al menos 10 caracteres de longitud o no los tiene
#Debe ignorar espacios en blanco a la izq y derecha

texto = input("Introduce un texto: ").strip()

if len(texto < 10:
	print("El texto tiene menos de 10 caracteres")
else:
	print("El texto tiene mas de 10 caracteres")