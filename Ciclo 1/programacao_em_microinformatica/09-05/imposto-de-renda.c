#include <stdio.h>

int main () {

    float cpf;
    float dep;
    float renda_anual;
    float aliquota1, aliquota2, aliquota3, aliquota4;

    printf("Digite seu CPF: ");
    scanf("%f", &cpf);

    printf("Digite seu número de dependentes: ");
    scanf("%f", &dep);

    printf("Digite sua renda anual: ");
    scanf("%f", &renda_anual);

    while (cpf != 0) {

        if (renda_anual <= 20000){
            aliquota1 = 0;
        }

        if (renda_anual >= 20000 && renda_anual <= 50000) {
            aliquota2 = renda_anual * 0.05;
        }

        if (renda_anual >=50000 && renda_anual <=100000) {
            aliquota3 = renda_anual * 0.10;
        }

        if (renda_anual >=100000) {
            aliquota4 = renda_anual * 0.15;
        }
    }

    printf("O valor do seu desconto será de %.2f", aliquota1, aliquota2, aliquota3, aliquota4);

}