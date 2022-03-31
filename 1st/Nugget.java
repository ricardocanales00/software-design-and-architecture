public class Nugget extends Comida{
    @Override
    public double getPrice(int size, boolean combo) {
        if(combo){
            return 38;
        } else {
            return 32;
        }
    }
}