package puntos.c;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpaquetadorTest {
    Seguro hogar = new Seguro(1000);
    Seguro automovil = new Seguro(1500);
    Seguro vida = new Seguro(1100);
    Seguro medicos = new Seguro(1400);
    Paquete paquete1 = new Paquete();

    @Test
    public void calcularCostoDePaquete() {
        paquete1.aniadirServicios(hogar);
        paquete1.aniadirServicios(automovil);
        paquete1.aniadirServicios(vida);
        paquete1.aniadirServicios(medicos);

        double resultadoEsperado = 4750;

        assertEquals(resultadoEsperado, paquete1.obtenerCosto());
    }

}
