import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro : ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            System.out.println();
            terminal.close();

        }catch (Exception e) {
             throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {



        if(parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
        else{
            throw new ParametrosInvalidosException("INVALIDO");
        }

    }
}