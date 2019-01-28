package ejerciciosLibro.patronesEstructurales.ObjetoCompuesto;

public class EjemploObjetoCompuesto {

    public static void main(String[] args){
        Contenedor diptico = new Contenedor("Campaña vacunación contra la gripe");
        Contenedor paginaUno = new Contenedor("Presentación de la campaña");
        Contenedor paginaDos = new Contenedor("Desarrollo de la campaña: calendario y protocolo de vacunación");

        Parrafo parrafoUnoPresentacion = new Parrafo("párrafo uno de la Presentación");
        Parrafo parrafoDosPresentacion = new Parrafo("párrafo dos de la Presentación");
        Parrafo parrafoTresPresentacion = new Parrafo("párrafo tres de la Presentación");

        Parrafo parrafoUnoDesarrollo = new Parrafo("párrafo uno del Desarrollo");
        Parrafo parrafoDosDesarrollo = new Parrafo("párrafo dos del Desarrollo");
        Parrafo parrafoTresDesarrollo = new Parrafo("párrafo tres del Desarrollo");

        diptico.Add(paginaUno);
        diptico.Add(paginaDos);

        paginaUno.Add(parrafoUnoPresentacion);
        paginaUno.Add(parrafoDosPresentacion);
        paginaUno.Add(parrafoTresPresentacion);

        paginaDos.Add(parrafoUnoDesarrollo);
        paginaDos.Add(parrafoDosDesarrollo);
        paginaDos.Add(parrafoTresDesarrollo);

        paginaUno.pintar("Azúl");
        paginaDos.pintar("Azúl claro");
    }
}
