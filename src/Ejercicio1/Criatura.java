package Ejercicio1;


public abstract class Criatura {

    private final String nombre;

    private final int edad;

    private  int nivelEnergia;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public Criatura(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void realizarAccion(){

    }

    public void volar(){

    }
}
