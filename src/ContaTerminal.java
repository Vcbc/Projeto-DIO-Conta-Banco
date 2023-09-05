import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    String agencia;
    int numero_conta;
    String nome_cliente;
    //float saldo = 0.00f;
    BigDecimal saldo;

    Scanner terminal = new Scanner(System.in);
    
    System.out.println(" POR FAVOR, PARA INICIAR A ABERTURA DE CONTA DIGITE O NÚMERO DA AGÊNCIA: ");
    agencia = terminal.next();

    System.out.println(" AGORA DIGITE O NÚMERO DA CONTA: ");
    numero_conta =  terminal.nextInt();

    System.out.println(" AGORA DIGITE SEU NOME COMPLETO: ");
    nome_cliente =  terminal.next();

    System.out.println(" POR ÚLTIMO, DIGITE O VALOR QUE VOCÊ DEPOSITOU AO ABRIR SUA CONTA: ");
    saldo = terminal.nextBigDecimal();

    System.out.println("OLÁ " + nome_cliente + "! OBRIGADO POR CRIAR UMA CONTA EM NOSSO BANCO, SUA AGÊNCIA É " + agencia + ", CONTA "
     + numero_conta + ", E SEU SALDO NO VALOR DE R$" + saldo + " JÁ ESTÁ DISPONÍVEL. ");


        
    }
}
