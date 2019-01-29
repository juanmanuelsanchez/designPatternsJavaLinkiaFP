package ejerciciosLibro.patronesEstructurales.ObjetoCompuesto;

public class EjemploObjetoCompuesto {

    public static void main(String[] args){
        Contenedor diptico = new Contenedor("Campaña vacunación contra la gripe", "Díptico");
        Contenedor paginaUno = new Contenedor("Presentación de la campaña", "Página 1 del díptico");
        Contenedor paginaDos = new Contenedor("Desarrollo de la campaña: calendario y protocolo de vacunación", "Página 2 del díptico");

        Parrafo parrafoUnoPresentacion = new Parrafo("párrafo uno de la Presentación", "Pertenece a la página 1 del díptico");
        Parrafo parrafoDosPresentacion = new Parrafo("párrafo dos de la Presentación", "Pertenece a la página 1 del díptico");
        Parrafo parrafoTresPresentacion = new Parrafo("párrafo tres de la Presentación", "Pertenece a la página 1 del díptico");

        Parrafo parrafoUnoDesarrollo = new Parrafo("párrafo uno del Desarrollo", "Pertenece a la página 2 del díptico");
        Parrafo parrafoDosDesarrollo = new Parrafo("párrafo dos del Desarrollo", "Pertenece a la página 2 del díptico");
        Parrafo parrafoTresDesarrollo = new Parrafo("párrafo tres del Desarrollo", "Pertenece a la página 2 del díptico");

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

        diptico.imprimeDetalles();

    }
}
