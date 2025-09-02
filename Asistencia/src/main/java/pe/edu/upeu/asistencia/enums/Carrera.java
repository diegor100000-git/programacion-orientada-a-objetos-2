package pe.edu.upeu.asistencia.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Carrera {

    SISTEMAS(Facultad.FIA , "ing.Sistemas"),
    CIVIL(Facultad.FIA, "ing.Civil"),
    AMBIENTAL(Facultad.FIA, "ing.Ambiental"),

    ADMINISTRACION(Facultad.FCE, "Administación"),
    NUTRICION(Facultad.FCS, "Nutrición"),
    EDUCACION(Facultad.FACIHED, "Educación");

    private Facultad facultad;
    private String descripcion;

}
