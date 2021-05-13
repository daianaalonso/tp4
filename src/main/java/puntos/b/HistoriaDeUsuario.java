package puntos.b;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements Item {
    private final List<Item> items;

    public HistoriaDeUsuario() {
        this.items = new ArrayList<>();
    }

    @Override
    public int obtenerHoras() {
        int horasTotales = 0;
        for (Item i : this.items) {
            horasTotales += i.obtenerHoras();
        }
        return horasTotales;
    }

    @Override
    public void aniadirItem(Item item) {
        this.items.add(item);
    }

    @Override
    public void eliminarItem(Item item) {
        this.items.remove(item);
    }

}
