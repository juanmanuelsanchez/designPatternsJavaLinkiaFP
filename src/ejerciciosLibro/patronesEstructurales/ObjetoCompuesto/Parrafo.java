package ejerciciosLibro.patronesEstructurales.ObjetoCompuesto;

public class Parrafo implements Componente {

    private String nombre, descripcion;

    public Parrafo(String nombre, String descripcion){

        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void imprimeDetalles(){
        System.out.println("\t\t" + this.getNombre() + ", " +  this.getDescripcion());
    }

    @Override
    public void pintar(String color) {

        System.out.println("Se pintó " + this.getNombre() + " de color " + color );
    }

}
