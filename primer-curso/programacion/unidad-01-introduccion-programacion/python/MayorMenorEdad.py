edad = int(input("Introduce tu edad: "))

if edad < 0 or edad > 110:
	print("Edad no válida")
elif edad < 18:
	print("La persona es menor de edad")
elif edad > 18:
	print("La persona es mayor de edad")
