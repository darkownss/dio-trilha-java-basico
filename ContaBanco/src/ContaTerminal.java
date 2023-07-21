import java.util.*;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
       int numero = Integer.parseInt(args[0]);
       String agencia = args[1];
       String nomeCliente = args[2];
       double saldo = Double.parseDouble(args[3]);
       Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Agência !");

        String str = sc.nextLine();

         System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,",nomeCliente);
         System.out.println("sua agência é "+ agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
         sc.close();
         
    }
}
