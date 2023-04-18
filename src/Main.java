import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0.0, aux = 0.0, auxRenda = 0.0;

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        if (renda <= 2000) {
            System.out.print("Isento");
        }else if (renda > 2000.00){
            if (renda > 4500){
                //20 reais
                aux = renda - 4500;
                imposto = aux * 0.28;

                //4500
                auxRenda = renda - aux;
                aux = auxRenda - 3000.00;
                imposto = imposto + aux * 0.18; //aux 1500

                aux = 3000.00 - 2000.00;
                imposto = imposto + aux * 0.08;

                System.out.printf("R$ %.2f", imposto);
            } else if(renda > 3000) {
                //2 reais
                aux = renda - 3000.00;
                imposto = aux * 0.18;

                //3000
                auxRenda = renda - aux;
                aux = auxRenda - 2000.00;
                imposto = imposto + aux * 0.08;

                System.out.printf("R$ %.2f", imposto);

            } else {
                aux = renda - 2000;
                imposto = aux * 0.08;

                System.out.printf("R$ %.2f", imposto);
            }
        }

    }

}