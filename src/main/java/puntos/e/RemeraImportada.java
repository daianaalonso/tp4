package puntos.e;

public class RemeraImportada extends Remera {
    public RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularRecargos(double precioUnitario) {
        return precioUnitario * 0.08;
    }

    @Override
    protected double calcularBonificaciones(double precioUnitario) {
        return precioUnitario * 0;
    }

    @Override
    protected double calcularRecargoComercio(double precioUnitario) {
        return precioUnitario * 0.25;
    }
}
