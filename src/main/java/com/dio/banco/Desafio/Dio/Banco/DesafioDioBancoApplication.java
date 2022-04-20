package com.dio.banco.Desafio.Dio.Banco;

import com.dio.banco.Desafio.Dio.Banco.model.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DesafioDioBancoApplication {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Nilcilaine");
		cliente.setCpf("852.245.556-66");

		Boleto boleto = new Boleto();

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);


		cc.depositar(500);
		cc.tranferir(0,poupanca);

		Boleto agua = new Boleto("58422225111120055",20,"Água");
		Boleto luz = new Boleto("456465467652456446",80,"Luz");

		cc.pagarBoleto(agua);
		cc.pagarBoleto(luz);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}


}
