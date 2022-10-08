#include <stdio.h>

int main () {
    float menor;
    float num;

    printf("Digite um número: ");
    scanf("%f", &num);

    menor = num;

    while (num != 0) {
        if (num < menor) {
            menor = num;
        }
        printf("Digite o próximo número: ");
        scanf("%f", &num);
    }
    printf("O menor número é %.2f", menor);
}