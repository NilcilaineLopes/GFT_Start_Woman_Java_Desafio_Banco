package com.dio.banco.Desafio.Dio.Banco.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Boleto {

    private String codigoBarras;
    private double valorBoleto;
    private boolean pago;
    private String tipoConta;

    public Boleto(String codigoBarras, double valorBoleto, String tipoConta) {
        this.codigoBarras = codigoBarras;
        this.valorBoleto = valorBoleto;
        this.tipoConta = tipoConta;
        this.pago = false;
    }
    public boolean isPago() {
        return pago;
    }
}
