package controle;

public class ParametrosInvalidosException  {
    public Exception parametroInvalido() throws Exception{
        throw new Exception("o primeiro parametro deve ser menor que o seguendo");
    }


}
