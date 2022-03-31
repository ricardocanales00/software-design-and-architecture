public class ComboBuilder {

    public Combo createCombo1(){
        Combo combo= new Combo();
        combo.addItem(new Hamburguesa(true));
        combo.addItem(new Refresco(3, true));
        combo.addItem(new Papas(3, true));
        return combo;
    }

    public Combo createCombo2(){
        Combo combo= new Combo();
        combo.addItem(new Hamburguesa(true));
        combo.addItem(new Refresco(1, true));
        combo.addItem(new Papas(1, true));
        return combo;
    }

    public Combo createCombo3(){
        Combo combo= new Combo();
        combo.addItem(new Hamburguesa(true));
        combo.addItem(new Refresco(2, true));
        combo.addItem(new Papas(2, true));
        return combo;
    }

    public Combo createCombo4(){
        Combo combo= new Combo();
        combo.addItem(new Nugget(true));
        combo.addItem(new Refresco(3, true));
        combo.addItem(new Papas(3, true));
        return combo;
    }

    public Combo createCombo5(){
        Combo combo= new Combo();
        combo.addItem(new Nugget(true));
        combo.addItem(new Refresco(2, true));
        combo.addItem(new Papas(2, true));
        return combo;
    }

    public Combo createCombo6(){
        Combo combo= new Combo();
        combo.addItem(new Nugget(true));
        combo.addItem(new Refresco(2, true));
        combo.addItem(new Papas(2, true));
        return combo;
    }

}