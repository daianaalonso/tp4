package puntos.b;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProyectoTest {
    private Item tarea1= new Tarea(3);
    private Item tarea2= new Tarea(6);
    private Item spike1= new Spike(4);
    private Item spike2= new Spike(7);

    @Test
    public void calcularHorasTotalesDeProyecto(){
        Proyecto proyecto= new Proyecto();

        Item historiaDeUsuario1 = new HistoriaDeUsuario();
        historiaDeUsuario1.aniadirItem(tarea1);
        historiaDeUsuario1.aniadirItem(spike1);

        Item historiaDeUsuario2= new HistoriaDeUsuario();
        historiaDeUsuario2.aniadirItem(tarea2);
        historiaDeUsuario2.aniadirItem(spike2);

        proyecto.aniadirItem(historiaDeUsuario1);
        proyecto.aniadirItem(historiaDeUsuario2);

        int resultadoEsperado= 20;

        assertEquals(resultadoEsperado, proyecto.obtenerHorasTotales());
    }
}
