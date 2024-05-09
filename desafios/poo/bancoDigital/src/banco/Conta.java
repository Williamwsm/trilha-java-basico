package banco;

public abstract class Conta {
    private Cliente cliente;
    private int agencia;
    private double saldo;
    private int numero_conta;

    public Conta(Cliente cliente, int agencia, double saldo, int numero_conta) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public double sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
        }
        return saldo;
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return saldo;
    }

    public double pix(double valor, Cliente cliente){
        if (getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
        }
        return valor;
    }

}
