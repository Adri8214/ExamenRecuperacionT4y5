package Ejercicio1;

public class Mago extends Criatura {

    private final int nivelMagico;

    public Mago(String nombre, int edad, int nivelMagico) throws Exception {
        super(nombre, edad);
        this.nivelMagico = nivelMagico;
    }



    @Override
    public void realizarAccion() {
        if(nivelMagico >=50){
            System.out.println("Manuel lanza un poderoso hechizo");
        }
        super.realizarAccion();
    }
}
