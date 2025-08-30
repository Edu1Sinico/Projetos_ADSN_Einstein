import java.util.Scanner;

public class ValidarNumerosDigitados {
    Scanner scan = new Scanner(System.in);

    public void receberNumeros(int num) {
        int somaNum = 0, somaNumPares = 0;
        int contNum = 0, contNumPares = 0, contNumImps = 0;
        double mediaNum = 0, mediaNumPares = 0;
        int maiorNum = -99999, menorNum = 99999;
        int porcentagemNumImps = 0;

        if (num != 0) {
            do {
                if (num > 0) {
                    somaNum += num; // Soma de todos os números digitados
                    contNum++; // Contagem de números digitados
                    mediaNum = somaNum / contNum; // Média dos números digitados

                    // Validar maior número digitado
                    if (num > maiorNum) {
                        maiorNum = num;
                    }

                    // Validar menor número digitado
                    if (num < menorNum) {
                        menorNum = num;
                    }

                    // Média dos números pares digitados
                    if (num % 2 == 0) { // Validando se o número é par
                        somaNumPares += num;
                        contNumPares++;
                        mediaNumPares = somaNumPares / contNumPares;
                    }
                    // Porcentagem dos números impares digitados
                    else {
                        contNumImps++;
                        porcentagemNumImps = (contNumImps * 100) / contNum;
                    }

                    System.out.print("Informe números positivos (Pressione '0' para finalizar o programa): ");
                    num = scan.nextInt();

                } else {
                    System.out.println("Por favor, informe apenas números positivos!");
                }
            } while (num != 0);
        }

        // Exibindo as informações
        System.out.println("\nInformações dos números validadas...\n" +
                "- Soma de todos os números positivos informados: " + somaNum + "\n" +
                "- Quantidade de números positivos informados: " + contNum + "\n" +
                "- Média dos números informados: " + mediaNum + "\n" +
                "- O maior número informado: " + maiorNum + "\n" +
                "- O menor número informado: " + menorNum + "\n" +
                "- Média dos números pares informados: " + mediaNumPares + "\n" +
                "- Porcentagem de números ímpares informados: " + porcentagemNumImps + "%");
    }

}
