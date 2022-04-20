package com.dio.banco.Desafio.Dio.Banco.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }

    @Override
    public void pagarBoleto(Boleto boleto) {
        System.out.println("=== Boleto Bancario Conta Corrente===");
        super.pagarBoleto(boleto);

    }

}
