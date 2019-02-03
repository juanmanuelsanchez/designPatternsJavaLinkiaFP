package ejerciciosLibro.patronesEstructurales.Fachada;

public class PosicionMemoria {

    private int posicion;

    public PosicionMemoria(int posicion){
        this.posicion = posicion;
    }

    public PosicionMemoria(){

    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "posicionMemoria: " + this.getPosicion();
    }
}
