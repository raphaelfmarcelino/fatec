#include <stdio.h>

int main () {
    float menor;
    float num;
    float maior;

    printf("Digite um número: ");
    scanf("%f", &num);

    menor = num;
    maior = num2;

    while (num != 0) {
        if (num < menor) {
            menor = num;
        } else { (num2 > maior) {
            maior = num2;
        }

        //printf("Digite o próximo número: ");
        //scanf("%f", &num);
        //
        // if (num2 > maior) {
        //    maior = num2;
        //}
        //printf("Digite o próximo número: ");
        //scanf("%f", &num2);
    }
    

    printf("O menor número é %.2f e o maior número é %.2f", menor, maior);
}