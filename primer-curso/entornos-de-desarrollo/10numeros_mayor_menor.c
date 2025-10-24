#include <stdio.h>


int main(){
    //Esta seccion pedira los 10 numeros al usuario para guardarlos en un array

    int numeros[10];
    int aux = 0;
    for (int i = 0; i < 10; i++) {
       printf("Inserte el %d numero: ", i+1);
       scanf("%d", &numeros[i]);
    }
//Una vez obtenidos los numeros para el array, pasamos a ordenarlos con
//Bubble short
    for(int i = 0; i < 10;i++){
        for(int j = i+1; j < 10; j++){
            if(numeros[i] > numeros[j]){
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }

    }

//Printeamos los numeros ordenados
    for(int i = 0; i < 10;i++){
        printf("%d ,", numeros[i]);
    }

    return 0;
}

