package puntos.c;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Empaquetador {
    private final List<Empaquetador> servicios;

    public Paquete() {
        this.servicios = new ArrayList<>();
    }

    @Override
    public double obtenerCosto() {
        double costoTotal = 0;
        for (Empaquetador e : this.servicios) {
            costoTotal += e.obtenerCosto() - (0.05 * e.obtenerCosto());
        }
        return costoTotal;
    }

    public void aniadirServicios(Empaquetador empaquetador) {
        this.servicios.add(empaquetador);
    }

}
