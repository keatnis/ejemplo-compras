package com.keatnis.desafio.mod;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;
    // no se pueden alterar el saldo ni el limite

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public Tarjeta(double limite) {
        this.limite = limite;
        this.saldo= limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra) {
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }

        return false;
    }
}
