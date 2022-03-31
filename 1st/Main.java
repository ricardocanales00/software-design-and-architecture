public class Main {

    public static void main(String[] args) {

        /*
            Decidí utilizar Builder, factory porque se pueden autogenerar los elementos de forma en que se puedan
            agrupar y atribuir información perteneciente a cada uno de estos para una un acceso relacional  y la distinción 
            entre las diferentes restricciones que se tienen en el contexto del proyecto, y así aplicarle y manipular la 
            interfaz en sus clases para la comida, bebida y companantes.
        */
        
        ComboBuilder db = new ComboBuilder();

        Combo combo1= db.createCombo1();
        Combo combo2= db.createCombo2();
    }
}