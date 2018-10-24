package patronesEstructurales.Decorador;

public class Pagina extends Component {

    @Override
    public int calcular() {
        System.out.println("+ Página básica = ");
        return 200;
    }
}
