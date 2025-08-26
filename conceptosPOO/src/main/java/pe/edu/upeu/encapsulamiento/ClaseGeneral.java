package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {
    public static void main(String[] args) {
        Persona p = new Persona();// p=objeto

        //p.nombre = "Juan";
        //p.edad = 25;

        p.setNombre("Mario"); //encapsulamiento
        p.setEdad(25);
        p.apellido = "Mamani";
        p.saludo();


        Trabajador t = new Trabajador();//t =objeto
        t.setNombre("david");
        t.setApellido("mamani");
        t.setEdad(25);
        t.setArea("sistemas");
        t.setGenero('M');
        System.out.println(t.toString());
    }
}
