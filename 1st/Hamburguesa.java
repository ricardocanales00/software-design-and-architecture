public class Hamburguesa extends Comida{
    @Override
    public double getPrice(int size, boolean combo) {
        if(combo){
            return 35;
        } else {
            return 40;
        }
    }
}