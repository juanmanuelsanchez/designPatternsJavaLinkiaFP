package patronesEstructurales.Decorador;

public class LoginDecorator extends PaginaDecorator {
    @Override
    public int calcular() {
        return super.calcular() + 300;
    }
}
