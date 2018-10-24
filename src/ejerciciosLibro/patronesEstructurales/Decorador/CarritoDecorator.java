package ejerciciosLibro.patronesEstructurales.Decorador;

public class CarritoDecorator extends PaginaDecorator {
    @Override
    public int calcular() {
        System.out.println("+ Carrito");
        return super.calcular() + 200;
    }
}
