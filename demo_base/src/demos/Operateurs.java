package demos;

public class Operateurs {
    public static void main(String[] args) {

        // region Opérateurs arithmétiques
        int result = 1+ 2;

        System.out.println("1 + 2 = "+ result); // 1 + 2 = 3
        int originalResult = result;

        result = result - 1;

        System.out.println((originalResult+ " - 1 = "+ result)); //  3 - 1 = 2
        originalResult = result;

        result = result * 2;

        System.out.println(originalResult+ " * 2 = "+ result); // 2 * 2 = 4
        originalResult = result;

        result = result / 2;

        System.out.println(originalResult+" / 2 = "+ result); //  4 / 2 = 2
        originalResult = result;

        result = result + 8;

        System.out.println(originalResult+" + 8 = "+ result); // 2 + 8 = 10
        originalResult = result;

        result = result % 7;

        System.out.println(originalResult+ " % 7 = "+result); // 10 % 7 = 3
        //endregion

        // région Opérateur unaires
        int nombre = +1;

        System.out.println(nombre); // 1

        // Opérateur de décrémentation
        nombre--;

        System.out.println(nombre); // 0

        // Opérateur d'incrémentation
        nombre++;

        System.out.println(nombre); // 1

        ++nombre;
        System.out.println(nombre); // 2

        // Opérateur de négation unaire
        nombre = -nombre;

        System.out.println(nombre); // -2

        // Opérateur not
        boolean success = false;

        System.out.println(success); // false
        System.out.println(!success); // true

        // region Affectations composées
        int x = 5;

        // Incrémentation
        x +=5; // x = x + 5

        // Decrementation
        x -=2; // x = x - 2

        // Opérateurs d'egalite relationnels
        int value1 = 1;
        int value2 = 2;
        boolean resultat;

        resultat = value1 == value2;
        System.out.println(resultat); // false

        resultat = value1 != value2;
        System.out.println(resultat); // true

        resultat = value1 > value2;
        System.out.println(resultat); // false

        // ET : les deux contitions doivent etre vraies
        resultat = (value1 == 1) && (value2 == 2);
        System.out.println(resultat); // true

        System.out.println("##################################################");

        // OU : l'une ou l'autre des conditions
        resultat = (value1 == 1) || (value2 == 2);
        System.out.println("le resultat de "+resultat);// true



    }
}
