package p2Factory.main;

import p2Factory.classes.PersonalSpital;
import p2Factory.classes.PersonalSpitalFactory;
import p2Factory.classes.TipPersonal;

public class Main
{
    public static void main(String[] args)
    {
        PersonalSpital brancardier = PersonalSpitalFactory.createPersonal(TipPersonal.BRANCARDIER);
        PersonalSpital asistent = PersonalSpitalFactory.createPersonal(TipPersonal.ASISTENT);
        PersonalSpital medic = PersonalSpitalFactory.createPersonal(TipPersonal.MEDIC);

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();


        // Adăugare nou tip de personal
        PersonalSpitalFactory nouTipFactory = new PersonalSpitalFactory() {

            public PersonalSpital createPersonal() {
                return new PersonalSpital() {
                    @Override
                    public void descriere() {
                        System.out.println("Sunt un nou tip de personal.");
                    }
                };
            }
        };


    }

}