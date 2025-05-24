package main;

import classes.CategorieJucator;
import classes.Jucator;
import classes.JucatorFactory;

public class Main {
    public static void main(String[] args) {
        Jucator portar = JucatorFactory.createJucator(CategorieJucator.PORTAR, "Ion Popescu");
        Jucator fundas = JucatorFactory.createJucator(CategorieJucator.FUNDAS, "Gheorghe Ionescu");
        Jucator atacant = JucatorFactory.createJucator(CategorieJucator.ATACANT, "Vasile Georgescu");

        portar.descriere();
        fundas.descriere();
        atacant.descriere();
    }
}