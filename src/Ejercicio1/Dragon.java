package Ejercicio1;

public class Dragon extends Criatura{

    public Dragon(String nombre, int edad) throws Exception {
        super(nombre, edad);
    }



    @Override
    public void realizarAccion() {
        System.out.println("Evaristo escupe fuego");
        super.realizarAccion();
    }

    @Override
    public void volar() {
        System.out.println("El dragón vuela agilmente sobre los árboles");
        super.volar();
    }
}
