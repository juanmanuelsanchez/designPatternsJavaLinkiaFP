package ejerciciosLibro.patronesEstructurales.Decorador;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaginaTest {

    @Test
    public void calcular() {
        Pagina pagina = new Pagina();
        int precioBasicoPagina = pagina.calcular();
        assertEquals(200, precioBasicoPagina);
    }
}