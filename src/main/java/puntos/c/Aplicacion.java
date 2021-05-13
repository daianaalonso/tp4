package puntos.c;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    private final List<Empaquetador> servicios;

    public Aplicacion() {
        this.servicios = new ArrayList<>();
    }

    public double obtenerCostoTotal() {
        double costo = 0;
        for (Empaquetador e : this.servicios) {
            costo += e.obtenerCosto();
        }
        return costo;
    }

    public void aniadirServicios(Empaquetador empaquetador) {
        this.servicios.add(empaquetador);
    }
}
