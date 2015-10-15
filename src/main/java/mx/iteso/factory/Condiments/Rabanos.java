package mx.iteso.factory.Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

/**
 * Created by Lily on 14/10/2015.
 */
public class Rabanos extends CondimentsDecorator{
    Pozole pozole;
    public Rabanos(Pozole pozole){
        this.pozole=pozole;
    }
    @Override
    public String getDescription() {
        return pozole.getDescription()+" con Rabanos";
    }
}
