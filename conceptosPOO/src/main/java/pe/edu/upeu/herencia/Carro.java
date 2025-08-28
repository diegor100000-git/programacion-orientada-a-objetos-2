package pe.edu.upeu.herencia;

public class Carro extends Vehiculo{
    public static void main(String[] args) {

        Carro c = new Carro();
        System.out.println("caracteristicas:"+c.modelo);
        c.marca = "Toyota";
        System.out.println("marca"+c.marca);
        System.out.println("modelo"+c.modelo);
        System.out.println("color"+"no se puede heredar por ser privado");

        c.sonido();
    }
}
