package puntos.c;

public class Seguro implements Empaquetador {
    private double costo;

    public Seguro(double costo) {
        this.costo = costo;
    }

    @Override
    public double obtenerCosto() {
        return costo;
    }
}
