package puntos.d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static java.time.LocalDate.now;

public class CalculadorTest {

    @Test
    public void jubiladoSinPromocion() {
        Calculador calculador = new CalculadorJubilado(now().getMonth().getValue() - 1);

        double resultadoEsperado = 110;

        assertEquals(resultadoEsperado, calculador.calcularPrecio(100));
    }

    @Test
    public void jubiladoConPromocion(){
        Calculador calculador= new CalculadorJubilado(now().getMonth().getValue());

        double resultadoEsperado = 100;

        assertEquals(resultadoEsperado, calculador.calcularPrecio(100));
    }

    @Test
    public void noJubiladoSinPromocion(){
        Calculador calculador = new CalculadorNoJubilado(now().getMonth().getValue() - 1);

        double resultadoEsperado = 121;

        assertEquals(resultadoEsperado, calculador.calcularPrecio(100));
    }

    @Test
    public void noJubiladoConPromocion(){
        Calculador calculador= new CalculadorNoJubilado(now().getMonth().getValue());

        double resultadoEsperado = 115;

        assertEquals(resultadoEsperado, calculador.calcularPrecio(100));
    }
}
