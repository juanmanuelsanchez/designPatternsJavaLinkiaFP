package ejerciciosLibro.patronesEstructurales.ObjetoCompuesto;

public class Parrafo implements Componente {

    private String nombre;

    public Parrafo(String nombre){

        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void pintar(String color) {

        System.out.println("Se pintó " + this.getNombre() + " de color " + color );
    }
}
