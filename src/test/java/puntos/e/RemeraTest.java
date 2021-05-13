package puntos.e;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemeraTest {

    @Test
    public void costoRemeraNacional() {
        Remera nacional = new RemeraNacional(150);

        double resultadoEsperado = 140.07;

        assertEquals(resultadoEsperado, nacional.obtenerPrecio());
    }

    @Test
    public void costoRemeraImportada() {
        Remera importada = new RemeraImportada(150);

        double resultadoEsperado = 202.5;

        assertEquals(resultadoEsperado, importada.obtenerPrecio());
    }
}
