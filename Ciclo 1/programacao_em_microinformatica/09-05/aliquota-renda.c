#include <stdio.h>

int main () {
    
    float cpf, dependentes, renda_anual, desconto, aliquota;

    while (1) {
        printf("Digite seu CPF: ");
        scanf("%f", &cpf);

        if (cpf==0) {
            break;
        }

        printf("Digite o número de dependentes: ");
        scanf("%f", &dependentes);

        printf("Digite sua renda anual: ");
        scanf("%f", &renda_anual);

        desconto = 500 * dependentes;

        if (renda_anual <= 20000) {
            aliquota = 0;
        } else {
            if (renda_anual >= 20000.01 && renda_anual <=50000) {
                aliquota = (0.05 * renda_anual) - desconto;
            } else {
                if (renda_anual >= 50000.01 && renda_anual <= 100000) {
                    aliquota = (0.10 * renda_anual) - desconto;
                } else {
                    if (renda_anual >100000.01) {
                        aliquota = (0.15 * renda_anual) - desconto;
                    }
                }
            }
        }
        printf ("O valor do imposto a ser pago é de %.2f.\n", aliquota);
    }
}