package io.github.danielaalineri.arquiteturaspring.montadora;

import java.awt.*;

public class Carro {

    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if(chave.getMontadora() != this.montadora){
            return new CarroStatus("Não é possível ligar o carro");
        }
        return new CarroStatus("Carro ligado, andando com o motor " + motor);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor=" + cor +
                ", motor=" + motor +
                ", montadora=" + montadora +
                '}';
    }
}
