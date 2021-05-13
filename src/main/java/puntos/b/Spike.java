package puntos.b;

public class Spike implements Item {
    private final int horas;

    public Spike(int horas) {
        this.horas = horas;
    }

    @Override
    public int obtenerHoras() {
        return horas;
    }

    @Override
    public void aniadirItem(Item item) {
        throw new RuntimeException("Error");
    }

    @Override
    public void eliminarItem(Item item) {
        throw new RuntimeException("Error");
    }
}
