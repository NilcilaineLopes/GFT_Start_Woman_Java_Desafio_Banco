package com.dio.banco.Desafio.Dio.Banco.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void pagarBoleto(Boleto boleto) {
        System.out.println("=== Boleto Bancario Conta Poupança===");
        super.pagarBoleto(boleto);

    }
}
