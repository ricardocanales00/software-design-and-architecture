public abstract class Comida implements Item {
    @Override
    public abstract double getPrice(int size, boolean combo);
}