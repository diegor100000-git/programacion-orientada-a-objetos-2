package pe.edu.upeu.abspolimorfismo;

public class Loro extends Animal {

    @Override
    void emitirSonido() {
        System.out.println("hey....no te distraigas");
    }


    @Override
    void dormir() {
        super.dormir();
        System.out.println("dejaem dormir.."+"zzz....zzz..");
    }
}
