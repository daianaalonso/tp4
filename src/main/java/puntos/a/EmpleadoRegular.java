package puntos.a;

public class EmpleadoRegular implements Empleado {
    private final String nombre;
    private final double salario;

    public EmpleadoRegular(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double obtenerMontoSalario() {
        return salario;
    }

    @Override
    public void aniadirEmpleado(Empleado empleado) {
        throw new RuntimeException("Error");
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        throw new RuntimeException("Error");
    }

}
