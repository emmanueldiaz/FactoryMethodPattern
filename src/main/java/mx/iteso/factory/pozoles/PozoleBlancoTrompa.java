package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class PozoleBlancoTrompa extends Pozole {
    public PozoleBlancoTrompa() {
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
