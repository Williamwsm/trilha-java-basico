package controle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contador contador = new Contador();
        int num1;
        int num2;

        System.out.println("Informe o primeiro numero:");
        num1 = ler.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = ler.nextInt();

        try {
            contador.contar(num1,num2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}