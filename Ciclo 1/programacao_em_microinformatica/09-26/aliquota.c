#include <stdio.h>

int main() {

    float cpf, dependentes, rendaAnual, desconto, despesasMedicas, aliquota, restituicao;

    while(1) {
        printf ("Digite o seu CPF: ");
        scanf ("%f", &cpf);

        if(cpf==0) {
            break;
        }

        printf ("Agora, digite o número de dependentes: ");
        scanf ("%f", &dependentes);

        printf ("Digite sua renda anual: ");
        scanf ("%f", &rendaAnual);

        printf ("Por fim, digite o valor das suas despesas médicas desse ano: ");
        scanf ("%f", &despesasMedicas);

        desconto = (500 * dependentes) + despesasMedicas;

        if (rendaAnual <= 20000) {
            aliquota = 0;
        } else {
            if (rendaAnual >= 20000.01 && rendaAnual <= 50000) {
                aliquota = (0.05 * rendaAnual) - desconto;
            } else {
                if (rendaAnual >= 50000.01 && rendaAnual <= 100000) {
                    aliquota = (0.1 * rendaAnual) - desconto;
                } else {
                    if (rendaAnual > 100000) {
                        aliquota = (0.15 * rendaAnual) - desconto;
                    }
                }
            }

            restituicao = aliquota * (-1);

        } if (aliquota > 0) {
            printf ("O valor do imposto a ser pago é de: %.2f\n", aliquota);
        } else {
            printf ("O valor a ser restituído é de: %.2f\n", restituicao);
        }
    }
}