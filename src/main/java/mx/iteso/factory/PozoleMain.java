package mx.iteso.factory;

import mx.iteso.factory.Condiments.Cebolla;
import mx.iteso.factory.Condiments.Col;
import mx.iteso.factory.pozoles.PozoleVerdeCachete;
import mx.iteso.factory.stores.*;

public class PozoleMain {
    public static void main (String[] args) {
        AllPozolesStore allPStore= new AllPozolesStore();
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = verdeStore.orderPozole("pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        System.out.println("Third order is: "+ pozole.getName());

        pozole= allPStore.createPozole("verde", "pollo");
        System.out.println("Fourth order is: "+ pozole.getDescription());

        Pozole pozole2 = new PozoleVerdeCachete();
        pozole2= new Cebolla(pozole2);
        pozole2= new Col(pozole2);
    }
}