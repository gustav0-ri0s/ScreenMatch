package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExeption;
import com.google.gson.annotations.SerializedName;

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

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionExeption("No pude convertir la duración del título, porque contiene 'N/A' en la propiedad 'runtime'");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().replaceAll("[^\\d]", ""));
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

    @Override
    public String toString() {
        return "(nombre=" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento+
                ", duracion: "+duracionEnMinutos+" minutos)";
    }
}
