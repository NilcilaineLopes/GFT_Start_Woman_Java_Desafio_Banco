package com.dio.banco.Desafio.Dio.Banco;

import com.dio.banco.Desafio.Dio.Banco.model.Cliente;
import com.dio.banco.Desafio.Dio.Banco.model.Conta;
import com.dio.banco.Desafio.Dio.Banco.model.ContaCorrente;
import com.dio.banco.Desafio.Dio.Banco.model.ContaPoupanca;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioDioBancoApplication {

	public static void main(String[] args) {
		Cliente nilci = new Cliente();
		nilci.setNome("Nilcilaine");

		Conta cc = new ContaCorrente(nilci);
		Conta poupanca = new ContaPoupanca(nilci);

		cc.depositar(100);
		cc.tranferir(50,poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}


}
