package mx.iteso.factory.Condiments;

import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;
import sun.text.resources.CollationData_nl;

/**
 * Created by Lily on 14/10/2015.
 */
public class Col extends CondimentsDecorator{
    Pozole pozole;
    public Col(Pozole pozole){
        this.pozole=pozole;
    }
    @Override
    public String getDescription() {
        return pozole.getDescription()+" con Col";
    }
}
