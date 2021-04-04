package co.com.red5g.travelocity.model;

import co.com.red5g.travelocity.model.builder.DatosViajeBuilder;

public class DatosViaje {

    private String destino;
    private String nombre;
    private String apellido;
    private int edad;

    public DatosViaje(final DatosViajeBuilder datosViajeBuilder){
        this.destino= datosViajeBuilder.getDestino();
    }

    public String getDestino() { return destino; }
}
