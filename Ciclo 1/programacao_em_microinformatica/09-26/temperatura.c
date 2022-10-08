#include <stdio.h>

int main() {

    float cs, fh, valorFinal;
    int opcao, continuar;

    printf ("Qual você deseja calcular:\n1 - Celsius para Fahrenheit\n2 - Fahrenheit para Celsius\n\nEscolha: ");
    scanf ("%i", &opcao);

    while (1) {

        if (opcao != 1 && opcao !=2) {
            break;
        }

        if (opcao == 1) {
            printf ("Digite um valor em Celsius: ");
            scanf ("%f", &cs);

            valorFinal = (cs * 9/5) + 32;

            printf ("A temperatura em Fahrenheit é: %.2f\n", valorFinal);

        } else {
            printf ("Digite um valor em Fahrenheit: ");
            scanf ("%f", &cs);

            valorFinal = (fh - 32) * 5/9;

            printf ("A temperatura em Celsius é: %.2f\n", valorFinal);
        }

        break;

    }
}