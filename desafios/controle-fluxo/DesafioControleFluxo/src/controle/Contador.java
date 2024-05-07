package controle;

public class Contador {
    ParametrosInvalidosException e = new ParametrosInvalidosException();
    public void contar(int num1, int num2) throws Exception {
        if (num1>= num2){
            e.parametroInvalido();
        }else {
            for (int i = 0; i < num2-num1; i++) {
                System.out.println("Imprimindo o número "+(i+1)+".");
            }
        }

    }
}
