while True:
	opcion = -1
		while opcion < 0 or opcion > 9:
			opcion = int(input("Generador de Patrones Artisticos\n-------------\nSeleccione la opción que quiera generar\n1 - Triangulo Rectangulo Creciente Alineado a la izquierda\n2 - Triangulo Rectangulo Creciente Alineado a la derecha\n3 - Triangulo Rectangulo Decreciente Alienado a la izquierda\n4 - Triangulo Rectangulo Decreciente Alienado a la derecha\n5 - Piramide centrada creciente\n6 - Piramide centrada decreciente\n7 - Cuadrado Hueco\n8 - Cuadrado Relleno\n9 - Rombo\n0 - Para acabar el programa\n-Seleccione su opcion: "))

		# Si la opcion es 0 se acaba el programa
		if opcion == 0:
			print("Fin del programa")
			break
		#Printeamos el triangulo rectangulo creciente alineado a la izquierda
		elif opcion == 1:
			texto =""
			altura = int(input("Inserte la altura del Triangulo: "))
			for i in range(1,altura+1):
				texto+= "*" * i
				texto+="\n"
			print(texto)
		#Printeamos el triangulo rectangulo creciente alienado a la derecha
		elif opcion == 2:
			texto =""
			altura = int(input("Inserte la altura del Triangulo: "))
			for i in range(1,altura+1):
				texto+= " " * (altura-i)
				texto+= "*" * i 
				texto+="\n"
			print(texto)
		#Printeamos el triangulo decreciente alienado a la izquierda
		elif opcion == 3:
			texto =""
			altura = int(input("Inserte la altura del Triangulo: "))
			for i in range(altura,0,-1):
				texto+= "*" * i
				texto+="\n"
			print(texto)
		#Printeamos el triangulo decreciente alineado a la derecha
		elif opcion == 4:
			texto =""
			altura = int(input("Inserte la altura del Triangulo: "))
			for i in range(0,altura):
				texto+= " " * (i)
				texto+= "*" * (altura-i)
				texto+="\n"
			print(texto)
		#Printeamos la piramide centreada creciente
		elif opcion == 5:
			texto =""
			altura = int(input("Inserte la altura del Triangulo: "))
			for i in range(1,altura+1):
				texto+= " " * (altura-i)
				texto+= "*" * (2*i-1)
				texto+="\n"
			print(texto)
		#Printeamos la piramide centrada decreciente
		elif opcion == 6:
			texto =""
			altura = int(input("Inserte la altura del Triangulo: "))
			for i in range(altura,0,-1):
				texto+= " " * (altura-i)
				texto+= "*" * (2*i-1)
				texto+="\n"
			print(texto)
		#Cuadrado hueco
		elif opcion == 7:
			texto =""
			lado = int(input("Inserte el tamaño del lado del Cuadrado: "))
			for i in range(0,lado):
				for j in range(0,lado):
					if i == 0 or i == lado-1 or j == lado-1 or j == 0:
 						texto += "* " 
					else:
						texto +="  "
				texto+="\n"
			print(texto)
		#Cuadrado relleno
		elif opcion == 8:
			texto =""
			lado = int(input("Inserte el tamaño del lado del Cuadrado: "))
			for i in range(0,lado):
				texto+="* " * lado
				texto+="\n"
			print(texto)
		#Rombo
		elif opcion == 9:
			texto =""
			altura = int(input("Inserte la anchura del rombo: "))
			for i in range(1,altura+1):
				texto+= " " * (altura-i)
				texto+= "*" * (2*i-1)
				texto+="\n"
			for i in range(altura-1,0,-1):
				texto+= " " * ((altura)-i)
				texto+= "*" * (2*i-1)
				texto+="\n"
			print(texto)