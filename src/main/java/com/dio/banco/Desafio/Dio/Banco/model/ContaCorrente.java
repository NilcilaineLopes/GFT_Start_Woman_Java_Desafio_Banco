package com.dio.banco.Desafio.Dio.Banco.model;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();


    }
}
