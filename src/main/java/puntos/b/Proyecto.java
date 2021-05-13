package puntos.b;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private final List<Item> items;

    public Proyecto() {
        this.items = new ArrayList<>();
    }

    public int obtenerHorasTotales() {
        int horasTotales = 0;
        for (Item i : items) {
            horasTotales += i.obtenerHoras();
        }
        return horasTotales;
    }

    public void aniadirItem(Item item) {
        items.add(item);
    }

    public void eliminarItem(Item item) {
        items.remove(item);
    }
}
