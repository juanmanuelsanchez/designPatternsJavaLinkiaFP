package ejerciciosLibro.patronesEstructurales.Fachada;

public class Memoria {

    private static final int longitud = 3;
    private int posicion = 0;
    private boolean open = false;
    private static PosicionMemoria[] posiciones = new PosicionMemoria[longitud];
    private static PosicionMemoria posicionMemoria = posiciones[0];
    private static PosicionMemoria posicionMemoriaUltimaCarga;

    public Memoria() throws OutOfMemoryException{
        for (int i = 0; i < posiciones.length; i++){
            if (posiciones[i] == null){
                PosicionMemoria temp = new PosicionMemoria(i);
                setPosicionMemoriaUltimaCarga(posicionMemoria);
                posiciones[i] = temp;
                setPosicion(i);
                setPosicionMemoria(temp);
                setOpen(true);
                break;
            }
        }
        if (!isOpen()){
            throw new OutOfMemoryException(this.printErrorMessage());
        }
    }

    private void setPosicion(int posicion){
        this.posicion = posicion;
    }

    private int getPosicion() {
        return posicion;
    }

    private PosicionMemoria getPosicionMemoriaUltimaCarga() {
        return Memoria.posicionMemoriaUltimaCarga;
    }

    private void printPosiciones(){
        for (PosicionMemoria posicionMemoria: posiciones){
            System.out.println(posicionMemoria);
        }
    }

    public void cargar(String direccion){
        System.out.println("\t" + "La memoria en la posición " + this.getPosicion()  +  " ha cargado el archivo en la dirección: " + direccion);
        posiciones[this.getPosicion()] = null;
    }

    private String printErrorMessage(){
        return "********No se puede asignar más memoria. La memoria está llena o no está disponible. Espere a que terminen los procesos en curso. *******";
    }

    @Override
    public String toString() {
        return "Memoria en posición: " + this.getPosicion() + ", " +  "posición de memoria de la última carga: " + this.getPosicionMemoriaUltimaCarga();
    }

    private void setOpen(boolean open) {
        this.open = open;
    }

    private boolean isOpen() {
        return open;
    }

    private static void setPosicionMemoriaUltimaCarga(PosicionMemoria posicionMemoriaUltimaCarga) {
        Memoria.posicionMemoriaUltimaCarga = posicionMemoriaUltimaCarga;
    }


    private static void setPosicionMemoria(PosicionMemoria posicionMemoria) {
        Memoria.posicionMemoria = posicionMemoria;
    }

    public static void main(String[] args){

        try {
            Memoria memoria1 = new Memoria();
            System.out.println(memoria1);
            Memoria memoria2 = new Memoria();
            System.out.println(memoria2);
            Memoria memoria3 = new Memoria();
            System.out.println(memoria3);
            memoria2.cargar("@direccionB");
            memoria1.cargar("@direccionA");
            Memoria memoria4 = new Memoria();
            memoria4.printPosiciones();

        }catch (OutOfMemoryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
