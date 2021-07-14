package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
        this.limite = 500.00;
    }

    @Override
    public double sacar(double valor) {
        double limiteSaque = getValorDisponivel();

        if(limiteSaque >= valor) {
            verificarUsoChequeEspecial(valor);
            setSaldo(getSaldo()-valor);
            adicionarLancamento(-valor);

            System.out.println("Saque realizado com sucesso!");
            return valor;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }

    @Override
    public void transferirPara(Conta conta, double valor) {
        double limiteTransferencia = getValorDisponivel();

        if(limiteTransferencia >= valor){
            this.setSaldo(this.getSaldo()-valor);
            this.adicionarLancamento(-valor);
            conta.depositar(valor);
        }
    }

    private void verificarUsoChequeEspecial(double valor){
        if(valor > getSaldo()){
            System.out.println("Usando cheque especial.");
        }
    }

    public void alterarLimiteChequeEspecial(double valor, String senha){
        if(getGerente().getSenha().equals(senha)){
            this.limite = valor;
            System.out.println("Limite alterado com sucesso.");
        }else{
            System.out.println("Senha incorreta. Limite não foi alterado.");
        }
    }

    public void verLimiteMaximo(){
        double limiteSaque = getSaldo() + this.limite;
        System.out.println(String.format("Seu limite máximo é: %s", this.limite));
        System.out.println(String.format("Você ainda pode gastar %s.", limiteSaque));
    }

    public double getValorDisponivel(){
         return getSaldo() + limite;
    }


}