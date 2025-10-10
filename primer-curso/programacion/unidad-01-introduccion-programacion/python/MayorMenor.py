num1 = int(input("Introduce el numero 1: "))
num2 = int(input("Introduce el numero 2: "))
num3 = int(input("Introduce el numero 3: "))


if (num1 > num2 and num1 > num3) or (num1 == num2 and num1 > num3) or (num1 == num3 and num1 > num2):
	print(f"El {num1} es el mayor de los 3")
elif (num2 > num1 and num2 > num3) or (num2 ==num3 and num2 > num1): 
	print(f"El {num2} es el mayor de los 3")
elif (num3 > num1 and num3 > num2):
	print(f"El {num3} es el mayor de los 3")
else:
	print("Todos los numeros son iguales")

#Si cambiamos los signos de > a < podremos hacer un programa parecido pero sacando el menor de los 3


if (num1 < num2 and num1 < num3) or (num1 == num2 and num1 < num3) or (num1 == num3 and num1 < num2):
	print(f"El {num1} es el menor de los 3")
elif (num2 < num1 and num2 < num3) or (num2 ==num3 and num2 < num1): 
	print(f"El {num2} es el menor de los 3")
elif (num3 < num1 and num3 < num2):
	print(f"El {num3} es el menor de los 3")

