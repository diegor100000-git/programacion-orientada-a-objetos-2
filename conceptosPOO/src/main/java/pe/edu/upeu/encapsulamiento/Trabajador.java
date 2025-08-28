package pe.edu.upeu.encapsulamiento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
//@Setter
//@Getter
public class Trabajador {

    private String nombre;
    private int edad;
    private String apellido;
    private String area;
    private char genero;

    @Override
    public String toString() {
        return  "tiene las siguientes caracteristicas: \n"+
                "Nombre:"+nombre+"\n"+
                "Apellido:"+apellido+"\n";

    }
}
