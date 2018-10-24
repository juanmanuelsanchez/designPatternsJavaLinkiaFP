package ejerciciosLibro.patronesEstructurales.Decorador;

public class PaginaDecorator extends Component {
    protected Component componente;
    public void setComponent(Component c){
        componente = c;
    }

    @Override
    public int calcular() {
        if (componente != null){
            return componente.calcular();
        }else {
            return 0;
        }
    }
}
