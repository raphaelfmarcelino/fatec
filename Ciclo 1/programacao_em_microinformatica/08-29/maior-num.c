#include <stdio.h>

int main () {
    float maior;
    float num;

    printf("Digite um número: ");
    scanf("%f", &num);

    maior = num;

    while (num != 0) {
        if (num > maior) {
            maior = num;
        }
        printf("Digite o próximo número: ");
        scanf("%f", &num);
    }
    printf("O maior número é %.2f", maior);
}