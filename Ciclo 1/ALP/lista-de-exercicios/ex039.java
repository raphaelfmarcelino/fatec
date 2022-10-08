public class ex039 {
    public static void main (String args []) {

        //entrada
        double total = 780000;
        
        //processamento
        double ganhador1 = total * 0.46;
        double ganhador2 = total * 0.32;
        double ganhador3 = total - (ganhador1 + ganhador2);

        //saída
        System.out.println ("Da importancia de R$780000.00, o ganhador 1 recebera " + ganhador1 + "O ganhador 2 recebera " + ganhador2 + "E o terceiro lugar recebera " + ganhador3);

    }
}