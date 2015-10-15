package mx.iteso.factory.Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by Lily on 14/10/2015.
 */
public class Cebolla extends CondimentsDecorator {
    PozoleStore pozole;
    public Cebolla(PozoleStore pozole){
        this.pozole=pozole;
    }
    @Override
    public String getDescription() {
        return pozole.getDescription()+" con Cebolla";
    }
}
