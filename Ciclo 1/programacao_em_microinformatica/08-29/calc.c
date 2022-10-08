#include <stdio.h>

int main () {

    float soma;
    float numero;
    soma = 0;

    printf("Digite um número ");
    scanf("%f", &numero);

    while (numero != 0) {
        soma = soma + numero;
        printf("Digite um número ");
        scanf("%f", &numero);
    }

    printf("A soma é %.2f", soma);

}