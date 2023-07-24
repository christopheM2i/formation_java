package demos;

public class Conditions {
    public static void main(String[] args) {
        // if
        if (3 > 2) {
            System.out.println("3 est supérieur à 2 !!!");
        }

        if (3> 2) System.out.println("3 est supérieur à 2 !!!");

        double note = 12.5;

        // if else if else
        if (note >= 16){
            System.out.println("Tres bien");
        } else if (note >= 14) {
            System.out.println("Bien");
        }else if(note >= 12){
            System.out.println("Assez Bien");
        }else {
            System.out.println("Bof");
        }

        System.out.println("1- Dire bonjour");
        System.out.println("2- Dire au revoir");
        System.out.println("3- Dire bonne nuit");

        int choix = 2;

        switch (choix) {
            case 1:
                System.out.println("Bonjour !!!");
                break;
            case 2:
                System.out.println("Au revoir !!");
                break;
            case 3:
                System.out.println("Bonne nuit");
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix");
                break;
        }

        switch (choix) {
            case 1 -> System.out.println("Bonjour !!!");
            case 2 -> System.out.println("Au revoir !!");
            case 3 -> System.out.println("Bonne nuit");
            default -> System.out.println("Je n'ai pas compris votre choix");
        }



    }
}
