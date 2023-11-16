import java.util.Arrays;

public class AlgoFouille {
    public static < E extends Comparable< E > > int FouilleBinaire(E [] tableau, E element ){
        int debut = -1;
        if(tableau != null && tableau.length > 0) {
            debut = 0;
            int fin = tableau.length - 1;

            while( debut < fin ) {
                int milieu = ( debut + fin ) / 2;
                if( element.compareTo(tableau[milieu]) <= 0 ) {
                    fin = milieu;
                } else {
                    debut = milieu + 1;
                }
            }
            if(element.compareTo(tableau[debut]) != 0){
                debut = -1;
            }
        }
        return debut;
    }

    public static < E extends Comparable< E > > int FouilleBinaire2(E [] tableau, E element ){
        int resultat = -1;
        if(tableau != null && tableau.length > 0) {
            resultat = FouilleBinaireR(tableau, element, 0, tableau.length-1);
        }
        return resultat;
    }

    public static < E extends Comparable< E > > int FouilleBinaireR(
            E[] tableau,
            E element,
            int debut,
            int fin ){
        int resultat;
        if(debut < fin) {
            int milieu = (debut + fin) / 2;
            if (element.compareTo(tableau[milieu]) <= 0) {
                resultat = FouilleBinaireR(tableau, element, debut, milieu);
            } else {
                resultat = FouilleBinaireR(tableau, element, milieu + 1, fin);
            }
        }else if(element.compareTo(tableau[debut]) == 0){
            resultat = debut;
        }else{
            resultat = -1;
        }
        return resultat;
    }

    public static < E extends Comparable< E > > int FouilleBinaire3(E [] tableau, E element ){
        int resultat = -1;
        if(tableau != null){
            resultat = Arrays.binarySearch(tableau, element, (o1, o2) -> { return o1.compareTo(o2); });
        }
        return resultat;
    }

    public static < E extends Comparable< E > > void triRapide( E [] tab, int debut, int fin ) {
        if( debut < fin ) {
            E pivot = tab[ ( debut + fin ) / 2 ];
            int i = debut - 1;
            int j = fin + 1;

            while( i < j ) {
                do -- j; while( tab[j].compareTo( pivot ) > 0 );
                do ++ i; while( tab[i].compareTo( pivot ) < 0 );

                if( i < j ) {
                    E temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }

            triRapide( tab, debut, j );
            triRapide( tab, j + 1, fin );
        }
    }


}
