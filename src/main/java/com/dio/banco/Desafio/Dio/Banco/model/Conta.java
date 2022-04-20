package com.dio.banco.Desafio.Dio.Banco.model;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static  int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta( Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected boolean possuiSaldo (double valor) {
        return getSaldo() >= valor;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void pagarBoleto(Boleto boleto){
        if(possuiSaldo(boleto.getValorBoleto())){
            sacar(boleto.getValorBoleto());
            boleto.setPago(true);
            System.out.println("Boleto de "+boleto.getTipoConta()+" pago com sucesso");
        }else{
            System.out.println("Seu saldo é insuficiente para está operação");
            boleto.setPago(false);

        }
    }
}

