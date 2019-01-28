package ejerciciosLibro.patronesEstructurales.ObjetoCompuesto;

import java.util.ArrayList;

public class Contenedor implements Componente {
    private String nombre;
    private ArrayList<Componente> componentes;

    public Contenedor(String nombre){

        this.nombre = nombre;
        this.componentes = new ArrayList<Componente>();

    }

    public Contenedor(){
        this.nombre = "";
        this.componentes = new ArrayList<Componente>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public Componente getComponenteConcreto(int index){
        return this.componentes.get(index);
    }

    public void Add (Componente componente){
        this.componentes.add(componente);
    }

    public void addIntoPosition(int index, Componente componente){
        this.componentes.add(index, componente);
    }

    public void Remove(Componente componente){
        if (this.componentes.contains(componente)){

            this.componentes.remove(componente);

        }
    }

    public void removeFromIndex(int index){
        this.componentes.remove(index);
    }


    @Override
    public void pintar(String color) {
        System.out.println("Se pintó a " + this.getNombre() + " de color " + color + ": ");
        for (Componente componente: componentes){
            componente.pintar(color);
        }

    }
}
