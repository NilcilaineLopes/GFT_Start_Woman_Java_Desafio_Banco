package com.dio.banco.Desafio.Dio.Banco;

import com.dio.banco.Desafio.Dio.Banco.model.Conta;
import com.dio.banco.Desafio.Dio.Banco.model.ContaCorrente;
import com.dio.banco.Desafio.Dio.Banco.model.ContaPoupanca;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioDioBancoApplication {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);

		Conta poupanca = new ContaPoupanca();
		cc.tranferir(100,poupanca);


		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}


}
