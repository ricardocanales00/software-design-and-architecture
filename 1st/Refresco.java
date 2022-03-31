public class Refresco extends Bebida{
    @Override
    public String getName() {
        return "Refresco";
    }

    @Override
    public double getPrice(int size, boolean combo) {
        int price;
        switch(size){
        case 1:
            price = 17;
            break;
        case 2:
            price = 18;
            break;
        case 3:
            price = 20;
            break;
        }
        if(combo) return price * 0.8;
        else return price;
    }
}