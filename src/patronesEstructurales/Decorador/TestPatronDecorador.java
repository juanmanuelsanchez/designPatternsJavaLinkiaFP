package patronesEstructurales.Decorador;

public class TestPatronDecorador {
    public static void main(String[] args){
        System.out.println("Ejemplo de patrón Decorador");
        Pagina pagina = new Pagina();
        CarritoDecorator cd = new CarritoDecorator();
        cd.setComponent(pagina);
        int precio = cd.calcular();
        System.out.println("   " + precio);

        LoginDecorator lg = new LoginDecorator();
        lg.setComponent(cd);
        int precio2 = lg.calcular();
        System.out.println("   " + precio2);
    }
}
