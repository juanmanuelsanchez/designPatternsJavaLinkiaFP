package ejerciciosLibro.patronesEstructurales.Fachada;

public class Procesador {

    public Procesador(){ }
    public void asignarProceso(Memoria memoria){
        System.out.println("Asignado proceso a la memoria en posición: " + memoria.getPosicion());
    }

}
