package ejerciciosLibro.patronesEstructurales.Decorador;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarritoDecoratorTest {

    @Test
    public void calcular() {
        Pagina pagina = new Pagina();
        CarritoDecorator cd = new CarritoDecorator();
        cd.setComponent(pagina);
        int precio = cd.calcular();
        assertEquals(400,precio);
    }
}