package ejerciciosLibro.patronesEstructurales.Decorador;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginDecoratorTest {

    @Test
    public void calcular() {
        Pagina pagina = new Pagina();
        CarritoDecorator cd = new CarritoDecorator();
        cd.setComponent(pagina);
        LoginDecorator lg = new LoginDecorator();
        lg.setComponent(cd);
        int precio = lg.calcular();
        assertEquals(700,precio);
    }
}