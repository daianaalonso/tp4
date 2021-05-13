package puntos.d;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double mesSinPromocion(double precioProducto) {
        return (precioProducto * 0.1) + precioProducto;
    }

    @Override
    protected double mesEnPromocion(double precioProducto) {
        return precioProducto;
    }
}