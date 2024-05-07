package com.keatnis.desafio.mod;

public class Compra implements  Comparable<Compra> {
    // en l;a clase no se agragan los setters por ya se inicializan con el constructor

    private String descripcion;
    private double valor;

    public Compra( String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "descripcion='" + descripcion + '\'' +
                ", valor=" + valor;
    }

    @Override
    public int compareTo(Compra compra) {
        // no se usa el double primitivo porque no permite realizar la comparacion, en este caso se usara Double
         return Double.valueOf(this.valor).compareTo(compra.getValor());
    }
}
