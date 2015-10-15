package mx.iteso.factory.Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

/**
 * Created by Lily on 14/10/2015.
 */
public class Oregano extends CondimentsDecorator {
    Pozole pozole;
    public Oregano(Pozole pozole){
        this.pozole=pozole;
    }
    @Override
    public String getDescription() {
        return pozole.getDescription()+" con Oregano";
    }
}
