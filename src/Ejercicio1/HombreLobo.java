package Ejercicio1;

public class HombreLobo extends Criatura {
    public HombreLobo(String nombre, int edad) throws Exception {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Lobezno aúlla a la luna");
        super.realizarAccion();
    }
}
