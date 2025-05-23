package classes;

public class JucatorFactory {
    public static Jucator createJucator(CategorieJucator categorie, String nume) {
        switch (categorie) {
            case CategorieJucator.PORTAR:
                return new Portar(nume);
            case CategorieJucator.FUNDAS:
                return new Fundas(nume);
            case CategorieJucator.ATACANT:
                return new Atacant(nume);
            default:
                throw new IllegalArgumentException("Categorie de jucător necunoscută: " + categorie);
        }
    }
}