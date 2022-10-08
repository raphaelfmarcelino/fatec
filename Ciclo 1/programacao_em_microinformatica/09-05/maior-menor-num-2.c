#include <stdio.h>

int main () {
    float menor;
    float num;
    float maior;

    printf("Digite um número: ");
    scanf("%f", &num);

    menor = num;
    maior = num;

    while (num != 0) {

        if (num < menor) {
            menor = num;
        } else { 
            if (num > maior) {
            maior = num;
        }
        }

        printf("Digite um número: ");
        scanf("%f", &num);

    }
    
    printf("O menor número é %.2f e o maior número é %.2f", menor, maior);
}