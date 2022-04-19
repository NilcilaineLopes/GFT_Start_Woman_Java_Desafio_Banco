package com.dio.banco.Desafio.Dio.Banco.model;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static  int SEQUENCIAL = 1;


    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int agencia, int numero) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}