package ejerciciosLibro.patronesEstructurales.Fachada;

public class ComputerFachada {
    private Procesador cpu;
    private Memoria memoria;
    private DiscoDuro discoDuro;

    public ComputerFachada()throws OutOfMemoryException{
        this.cpu = new Procesador();
        this.memoria = new Memoria();
        this.discoDuro = new DiscoDuro();
    }
    public void abrirArchivo(String archivo){
        String direccion = this.discoDuro.getDireccion(archivo);
        this.memoria.cargar(direccion);
        this.cpu.asignarProceso(this.memoria);
    }

    public static void main(String[] args){
        try {
            System.out.println("***** Patrón Fachada ******");
            ComputerFachada computerFachada1 = new ComputerFachada();
            computerFachada1.abrirArchivo("prueba1.txt");

            ComputerFachada computerFachada2 = new ComputerFachada();
            computerFachada2.abrirArchivo("prueba2.txt");

            //Descomentar para producir stack memory overflow
          /*  ComputerFachada computerFachada3 = new ComputerFachada();
            computerFachada3.abrirArchivo("prueba3.txt");*/

        }catch (OutOfMemoryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
