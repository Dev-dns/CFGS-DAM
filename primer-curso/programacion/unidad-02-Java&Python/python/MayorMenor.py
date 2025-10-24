menor = 0
mayor = 0

for i in range(1,11):
    num = int(input(f"Introduzca el {i}º numero: "))
    if num > mayor:
        mayor = num
    elif num < menor:
        menor = num

print(f"El numero mas pequeño ha sido: {menor}")
print(f"El numero mas grande ha sido: {mayor}")