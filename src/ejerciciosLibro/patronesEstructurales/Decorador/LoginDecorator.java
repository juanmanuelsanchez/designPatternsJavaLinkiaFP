package ejerciciosLibro.patronesEstructurales.Decorador;

public class LoginDecorator extends PaginaDecorator {
    @Override
    public int calcular() {
        System.out.println("+ Login");
        return super.calcular() + 300;
    }
}
