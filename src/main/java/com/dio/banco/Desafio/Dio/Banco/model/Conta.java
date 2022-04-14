package com.dio.banco.Desafio.Dio.Banco.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(){}
    public void depositar(){}
    public void tranferir(){}

}