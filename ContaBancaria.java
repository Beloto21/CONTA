package teste;

public class ContaBancaria {
    
    private double saldo;
    private int contadorConsultas; 

    // construtor da classe
    public ContaBancaria() {
        this.saldo = 0.0;
        this.contadorConsultas = 0;
    }

    // aqui é  para realizar depósito
    public void deposito(double valor) {
        // aqui vai verificar se o valor é positivo
        if (valor > 0) {
            double taxa = valor * 0.01;
            saldo += (valor - taxa); 
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    // aqui é para realizar saque
    public void saque(double valor) {
        // aqui vai verificar se o valor é positivo e se há saldo suficiente
        if (valor > 0 && valor <= saldo) {
            double taxa = valor * 0.005; 
            saldo -= (valor + taxa); 
        } else {
        	
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // aqui é para consultar o saldo
    public double consultaSaldo() {
        contadorConsultas++; 
       
        if (contadorConsultas % 5 == 0) {
            saldo -= 0.10;
        }

        return saldo; 
    }

    public double getSaldo() {
        return saldo;
    }
}