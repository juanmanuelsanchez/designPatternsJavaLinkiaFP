package ejerciciosLibro.patronesEstructurales.Fachada;

public class DiscoDuro {
    String nombre = "SCSI";
    public DiscoDuro(){ }
    protected String getDireccion(String nombreArchivo){
        return  "@direccion/" + (char)(Math.random() * 26 + 'a') + "/" + nombreArchivo ;
    }

    public static void main(String[] args){
        DiscoDuro discoDuro = new DiscoDuro();
        System.out.println(discoDuro.getDireccion("prueba.txt"));
    }
}
