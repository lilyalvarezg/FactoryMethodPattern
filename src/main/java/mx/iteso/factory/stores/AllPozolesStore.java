package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by Lily on 08/10/2015.
 */
public class AllPozolesStore{
    public Pozole createPozole(String type, String meat) {
        Pozole pozole=null;
        if(type.equals("Rojo")){
            PozoleStore rojoStore = new PozoleRojoStore();
            pozole= rojoStore.orderPozole(meat);
        }else if(type.equals("Verde")){
            PozoleVerdeStore verdeStore= new PozoleVerdeStore();
            pozole= verdeStore.orderPozole(meat);
        }else if(type.equals("Blanco")){
            PozoleBlancoStore blancoStore= new PozoleBlancoStore();
            pozole= blancoStore.orderPozole(meat);
        }else if(type.equals("Pozolillo")){
            PozolilloStore pozoStore= new PozolilloStore();
            pozole= pozoStore.orderPozole(meat);
        }else if(type.equals("Menudo")){
            MenudoStore menuStore= new MenudoStore();
            pozole= menuStore.orderPozole(meat);
        }
        return pozole;
    }
}
