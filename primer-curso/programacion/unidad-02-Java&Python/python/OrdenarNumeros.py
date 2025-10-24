numeros = []

while 1 != 0 :
    #Se realizara 10 veces al hacerlo desde el 0 hasta que sea menor que 10
    for i in range(0,10):
        numeros.append(int(input(f"Inserte el {(i+1)}º numero: ")))
    #Algoritmo de ordenacion Bubble Short
    for i in range(0,len(numeros)):
        for j in range (i+1,len(numeros)):
            if numeros[i] > numeros[j]:
                aux = numeros[i]
                numeros[i] = numeros[j]
                numeros[j] = aux
    #Printeamos el array ya ordenado
    print(numeros)
    #Preguntamos al usuario si quiere continuar, sino haremos un break para parar 
    #el bucle
    opcion = input(f"¿Desea continuar? (SI | NO)")
    if opcion.lower() == "si":
        continue
    else:
        break

    print("Programa finalizado")
