package puntos.a;

public class Empresa {
    private Empleado empleado;

    public Empresa(Empleado director) {
        this.empleado = director;
    }

    public double montoTotalSalarial() {
        return empleado.obtenerMontoSalario();
    }

}
