package puntos.e;

public class RemeraNacional extends Remera {
    public RemeraNacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargos(double precioUnitario) {
        return precioUnitario * 0.015;
    }

    @Override
    protected double calcularBonificaciones(double precioUnitario) {
        return precioUnitario * 0.2;
    }

    @Override
    protected double calcularRecargoComercio(double precioUnitario) {
        return precioUnitario * 0.15;
    }
}
