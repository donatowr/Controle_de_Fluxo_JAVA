import java.util.Scanner;
import java.lang.String;


public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {

        try {

            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = Integer.parseInt(terminal.next());
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = Integer.parseInt(terminal.next());

contagem(parametroUm,parametroDois);


        }catch (ParametrosInvalidosException e){
            System.out.println("o Segundo Parametro Precisa Ser Menor Que o Primeiro");
    }

    }
     static void contagem(int paramentroUm, int parametroDois) throws ParametrosInvalidosException {
         if (parametroDois < paramentroUm) {
             int resultado = paramentroUm - parametroDois;
             for (int i = 0; i < resultado; i++) System.out.println(i);
         }else {
             throw new ParametrosInvalidosException();
         }

     }


}