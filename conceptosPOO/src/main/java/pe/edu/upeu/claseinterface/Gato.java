package pe.edu.upeu.claseinterface;

public class Gato implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("miau....miau");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzzz..........zzz....");
    }
}
