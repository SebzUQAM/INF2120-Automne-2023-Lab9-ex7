import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            Fraction[] fractions01 = creerFractions(1);
            Fraction[] fractions02 = creerFractions(2);
            Fraction[] fractions03 = creerFractions(3);
            Fraction[] fractions16 = creerFractions(16);

            Fraction fraction01 = fractions01[intAleatoire(0,1)];
            Fraction fraction02 = fractions02[intAleatoire(0,2)];
            Fraction fraction03 = fractions03[intAleatoire(0,3)];
            Fraction fraction16 = fractions16[intAleatoire(0,16)];

            int resultat;
            resultat = AlgoFouille.rechercheLineaire(fractions01, fraction01);
            System.out.println(resultat);
            resultat = AlgoFouille.rechercheLineaire(fractions02, fraction02);
            System.out.println(resultat);
            resultat = AlgoFouille.rechercheLineaire(fractions03, fraction03);
            System.out.println(resultat);
            resultat = AlgoFouille.rechercheLineaire(fractions16, fraction16);
            System.out.println(resultat);

            resultat = AlgoFouille.FouilleBinaire(fractions01, fraction01);
            System.out.println(resultat);
            resultat = AlgoFouille.FouilleBinaire(fractions02, fraction02);
            System.out.println(resultat);
            resultat = AlgoFouille.FouilleBinaire(fractions03, fraction03);
            System.out.println(resultat);
            resultat = AlgoFouille.FouilleBinaire(fractions16, fraction16);
            System.out.println(resultat);

            resultat = AlgoFouille.FouilleBinaireR(fractions01, fraction01);
            System.out.println(resultat);
            resultat = AlgoFouille.FouilleBinaireR(fractions02, fraction02);
            System.out.println(resultat);
            resultat = AlgoFouille.FouilleBinaireR(fractions03, fraction03);
            System.out.println(resultat);
            resultat = AlgoFouille.FouilleBinaireR(fractions16, fraction16);
            System.out.println(resultat);

            resultat = Arrays.binarySearch(fractions01, fraction01, (o1, o2) -> o1.compareTo(o2));
            System.out.println(resultat);
            resultat = Arrays.binarySearch(fractions02, fraction02, (o1, o2) -> o1.compareTo(o2));
            System.out.println(resultat);
            resultat = Arrays.binarySearch(fractions03, fraction03, (o1, o2) -> o1.compareTo(o2));
            System.out.println(resultat);
            resultat = Arrays.binarySearch(fractions16, fraction16, (o1, o2) -> o1.compareTo(o2));
            System.out.println(resultat);

            Tri.miniTest();
            System.out.println("" + 10_000);
            Tri.testCharge(10_000);
            System.out.println("testChargeArray : " + 10_000);
            Tri.testChargeArray(10_000);
            System.out.println();
            System.out.println("" + 100_000);
            Tri.testCharge(100_000);
            System.out.println("testChargeArray : " + 100_000);
            Tri.testChargeArray(100_000);
            System.out.println();
            System.out.println("" + 1_000_000);
            Tri.testCharge(1_000_000);
            System.out.println("testChargeArray : " + 1_000_000);
            Tri.testChargeArray(1_000_000);
            System.out.println();
            System.out.println("" + 10_000_000);
            Tri.testCharge(10_000_000);
            System.out.println("testChargeArray : " + 10_000_000);
            Tri.testChargeArray(10_000_000);
        }

        private static Fraction[] creerFractions(int nombreDeFraction){
            if(nombreDeFraction < 1){
                return new Fraction[0];
            }
            Fraction[] resultat = new Fraction[nombreDeFraction];
            resultat[0] = Fraction.creerFractionAleatoire();
            for (int i=1; i<resultat.length; i++){
                resultat[i] = resultat[i-1].add(Fraction.creerFractionAleatoire());
            }
            return resultat;
        }

        private static int intAleatoire(int min, int max){
            return (int)Math.floor(Math.random() * (max-min) + min);
        }
}