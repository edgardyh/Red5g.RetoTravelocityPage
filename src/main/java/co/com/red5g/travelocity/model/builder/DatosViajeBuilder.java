package co.com.red5g.travelocity.model.builder;

import co.com.red5g.travelocity.model.DatosViaje;
import co.com.red5g.travelocity.util.Builder;

public class DatosViajeBuilder implements Builder <DatosViaje> {

    private String destino;

    public DatosViajeBuilder (){
        this.destino = "";
    }

    public static DatosViajeBuilder con() {
        return new DatosViajeBuilder();
    }

    // Este metodo llena las variables - Statico para ser llamado por clase y metodo y listo
    public DatosViaje build() { return new DatosViaje(this); }

    // Metodo que Recibe una variable y lo asigna a la variable this.nombre
    public DatosViajeBuilder conDestino(String destino){
        this.destino=destino;
        return this;
    }

    public DatosViaje unDatoViaje(){
        conDestino("cancun");
        return build();
    }

    public String getDestino () { return destino; }
}
