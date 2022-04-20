package com.dio.banco.Desafio.Dio.Banco.model;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void tranferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    void pagarBoleto(Boleto boleto);

}
