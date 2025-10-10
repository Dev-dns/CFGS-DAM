cadena1 = "coche"
cadena2 = "Coche"

#Mientras que en java es variable1.equals(variable2) para comparar strings
#En python es:

if cadena1 == cadena2:
	print("Son iguales")
else:
	print("Son distintas")

#Para ignorar las mayusculas o minusculas, pasaremos todo a una de las dos
#Usamos o .lower() o .upper()

if cadena1.lower().strip() == cadena2.lower().strip():
	print("Son iguales")
else:
	print("Son distintas")


#Para remover los espacios en blanco .strip()
#De momento para las tildes no podemos hacer nada



