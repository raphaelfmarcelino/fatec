#include <stdio.h>

int main () {

    float A, B, C;

    printf("Insira o valor de A, B e C:");

    scanf("%f", &A);
    scanf("%f", &B);
    scanf("%f", &C);

    if ((A < B + C)&&(B < A + C)&&(C < A + B)) {
        if ((A == B)&&(B==C)) {
            printf("Triângulo Equilátero");
        }
        else {
            if ((A == B) || (A == C) || (B == C)) {
                printf("Triângulo Isóceles");
            }
        } 
        else {
            printf("Triângulo qualquer");
        }
    }
    else {
        printf("Não é triângulo");
    }
    return (0);
}