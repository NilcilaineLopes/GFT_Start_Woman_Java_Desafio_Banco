package com.dio.banco.Desafio.Dio.Banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ContaCorrente {
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(){}
    public void depositar(){}
    public void tranferir(){}

}
