import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fraction[] fractions = creerTableauDeFraction(1);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(2);
        System.out.println(
                "" + AlgoFouille.FouilleBinaire(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(3);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(16);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(1);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire2(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(2);
        System.out.println(
                "" + AlgoFouille.FouilleBinaire2(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(3);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire2(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(16);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire2(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(1);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire3(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(2);
        System.out.println(
                "" + AlgoFouille.FouilleBinaire3(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(3);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire3(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        fractions = creerTableauDeFraction(16);

        System.out.println(
                "" + AlgoFouille.FouilleBinaire2(
                        fractions,
                        new Fraction((int)(Math.random()*fractions.length),1)
                )
        );

        Long time = System.nanoTime();
        Integer[] integers = creerTableauIntAleatoire(10_000_000);

        AlgoFouille.triRapide(integers, 0, integers.length-1);

        time = System.nanoTime();
        integers = creerTableauIntAleatoire(10_000_000);

        Tri.triPlusRapide(integers);
        System.out.println("triPlusRapide : " + (System.nanoTime() - time));

        time = System.nanoTime();
        integers = creerTableauIntAleatoire(10_000_000);

        Tri.triInsertion(integers);
        System.out.println("triInsertion : " + (System.nanoTime() - time));

        time = System.nanoTime();
        integers = creerTableauIntAleatoire(10_000_000);

        Tri.triSelection(integers);
        System.out.println("triSelection : " + (System.nanoTime() - time));

        time = System.nanoTime();
        integers = creerTableauIntAleatoire(10_000_000);
        System.out.println("creerTableauIntAleatoire : " + (System.nanoTime() - time));

        time = System.nanoTime();
        Arrays.sort(integers);
        System.out.println("Arrays.sort : " + (System.nanoTime() - time));
    }

    private static Fraction[] creerTableauDeFraction(int taille){
        Fraction[] fractions = new Fraction[taille];
        for (int i=0; i< taille;i++){
            fractions[i] = new Fraction(i,1);
        }
        return fractions;
    }

    private static Integer[] creerTableauIntAleatoire(int taille){
        Integer[] integers = new Integer[taille];
        for (int i=0; i< taille;i++){
            integers[i] = (int)(Math.random()*taille);
        }
        return integers;
    }
}