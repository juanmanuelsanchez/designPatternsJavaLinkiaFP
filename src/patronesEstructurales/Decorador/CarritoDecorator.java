package patronesEstructurales.Decorador;

public class CarritoDecorator extends PaginaDecorator {
    @Override
    public int calcular() {
        return super.calcular() + 200;
    }
}
