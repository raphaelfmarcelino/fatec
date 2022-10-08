#include <stdio.h>

int main () {
    float x, y, soma;

    printf("Escreva um valor para x:");
    scanf("%f", &x);
    printf("Escreva um valor para y:");
    scanf("%f", &y);

    soma = x + y;
    printf("O resultado da soma é %.2f", soma);
}