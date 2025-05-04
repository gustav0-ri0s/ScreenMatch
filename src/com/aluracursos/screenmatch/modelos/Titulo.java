package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pellícula es: "+getNombre());
        System.out.println("Su fecha de lanzamiento fue: "+getFechaDeLanzamiento());
        System.out.println("Duracion en minutos: "+ getDuracionEnMinutos());
    }


    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;

    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;

    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
