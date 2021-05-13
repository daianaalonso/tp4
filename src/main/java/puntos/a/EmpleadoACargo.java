package puntos.a;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoACargo implements Empleado {
    private final String nombre;
    private final double salario;
    private final List<Empleado> empleados;

    public EmpleadoACargo(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.empleados = new ArrayList<>();
    }

    @Override
    public double obtenerMontoSalario() {
        double montoTotal = 0;
        for (Empleado e : empleados) {
            montoTotal += this.salario + e.obtenerMontoSalario();
        }
        return montoTotal;
    }

    @Override
    public void aniadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
}
