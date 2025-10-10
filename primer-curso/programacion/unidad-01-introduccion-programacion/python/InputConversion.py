#La orden input recoge lo que se ponga como tipo string
precio = float(input("Indica el precio de un producto: "))
cantidad = int(input("Cantidad de unidades del producto: "))

precioTotal = precio*cantidad

print(f"El importe final es {precioTotal}")