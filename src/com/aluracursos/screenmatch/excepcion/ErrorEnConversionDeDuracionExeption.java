package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionExeption extends RuntimeException {
   private String mensaje;

    public ErrorEnConversionDeDuracionExeption(String mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public String getMessage() {
        return this.mensaje;
    }


}
