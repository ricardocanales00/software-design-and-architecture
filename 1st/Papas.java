public class Papas extends Acompanante{
    @Override
    public String getName() {
        return "Papas";
    }

    @Override
    public double getPrice(int size, boolean combo) {
        int price;
        switch(size){
        case 1:
            price = 15;
            break;
        case 2:
            price = 17;
            break;
        case 3:
            price = 19;
            break;
        }
        if(combo) return price * 0.8;
        else return price;
    }
}