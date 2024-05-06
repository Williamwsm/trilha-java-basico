import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    private int  numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public void criarConta(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        numero = ler.nextInt();
        System.out.println("Por favor, informe qual a  sua Agência !");
        agencia = ler.next();
        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = ler.next();
        System.out.println("Por favor, digite o seu saldo !");
        saldo = ler.nextBigDecimal();
        ler.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo "+saldo+ " já está disponível para saque");

    }
}
