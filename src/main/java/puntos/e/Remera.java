package puntos.e;

public abstract class Remera {
    private double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double obtenerPrecio() {
        double costo = this.precioUnitario;
        costo += calcularRecargos(this.precioUnitario);
        costo -= calcularBonificaciones(costo);
        return costo + calcularRecargoComercio(costo);
    }

    protected abstract double calcularRecargos(double precioUnitario);

    protected abstract double calcularBonificaciones(double precioUnitario);

    protected abstract double calcularRecargoComercio(double precioUnitario);

}
