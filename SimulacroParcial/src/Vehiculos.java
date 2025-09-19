import java.util.ArrayList;

public  class Vehiculos {
    private Modelo modelo;
    private String marca;
    private String patente;
    private double velocidadRecomendada;
    private double kilometraje;

    public Vehiculos(Modelo modelo, String marca, String patente, double velocidadRecomendada, double kilometraje) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.velocidadRecomendada = velocidadRecomendada;
        this.kilometraje = kilometraje;
    }

    public Vehiculos() {
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getVelocidadRecomendada() {
        return velocidadRecomendada;
    }

    public void setVelocidadRecomendada(double velocidadRecomendada) {
        this.velocidadRecomendada = velocidadRecomendada;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }


        }



