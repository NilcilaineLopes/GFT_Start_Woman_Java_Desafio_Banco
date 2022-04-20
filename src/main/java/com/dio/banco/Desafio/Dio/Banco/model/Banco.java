package com.dio.banco.Desafio.Dio.Banco.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
