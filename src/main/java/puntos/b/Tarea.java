package puntos.b;

public class Tarea implements Item {
    private final int horas;

    public Tarea(int horas) {
        this.horas = horas;
    }

    public int obtenerHoras() {
        return this.horas;
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
