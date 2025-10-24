#include <stdio.h>
#include <string.h>

int main(){

    //Inicializamos el array de char (string) y el contador de palabras
    char palabra[100];
    int palabras = 0;

    //Solicitamos al usuario que introduzca el texto que quiera
    printf("Inserte el texto que quiera (Recuerda no dejar un espacio al final de la ultima palabra): ");
    fgets(palabra, 100, stdin);

    int longitud = strlen(palabra);

    for(int i = 0; i < longitud; i++){
        if(palabra[i] == ' '){
            palabras++;
        }
    }

    printf("El total de palabras ha sido: %i \n", palabras+1);

     for(int i = 0; i < longitud; i++){
        if(palabra[i] != ' '){
            printf("%c", palabra[i]);
        } else {
            printf("\n");
        }
    }

    return 0;

}
