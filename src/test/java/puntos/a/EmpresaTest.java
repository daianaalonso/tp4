package puntos.a;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpresaTest {
    private final Empleado director = new EmpleadoACargo("Daiana Alonso", 20000);
    private final Empleado gerente = new EmpleadoACargo("Lorena Ramos", 15000);
    private final Empleado mandoMedio = new EmpleadoACargo("Andres Blanco", 7000);
    private final Empleado liderProyecto = new EmpleadoACargo("Xiomara Pallalaf", 10000);
    private final Empleado empleadoRegular = new EmpleadoRegular("Valentin Pallalaf", 3000);

    @Test
    public void calcularMontoSalarialDeEmpresa() {
        Empresa laserX = new Empresa(director);
        director.aniadirEmpleado(gerente);
        gerente.aniadirEmpleado(mandoMedio);
        mandoMedio.aniadirEmpleado(liderProyecto);
        liderProyecto.aniadirEmpleado(empleadoRegular);

        double totalEsperado = 55000;

        assertEquals(totalEsperado, laserX.montoTotalSalarial());
    }

}
