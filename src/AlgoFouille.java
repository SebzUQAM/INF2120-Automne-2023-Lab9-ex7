import java.util.Arrays;

public class AlgoFouille {
    /*
     * Recherche lin�aire.
     * soit un tableau, trouver la position d'un element.
     * ex :
     * Integer [] tab = {4, 2, 6, 43, 7, 45};
     * int p = rechercheLineaire( tab, 2 );
     *
     * meilleur : O(1)
     * cas moyen : O(n)
     * pire cas : O(n)
     * rechercheLineaire( tab, element ) : int
     *     i <- 0
     *
     *     tantque i < tab.taille et tab[i] != element
     *         i <- i + 1
     *
     *     si( i = tab.taille ) alors i <- -1
     *
     *     retourner i
     *
     * rechercherDerniereOccurence( tab, element ) :int
     *     i <- tab.taille - 1
     *     tantque( 0 <= i et tab[i] != element )
     *         -- i
     *     retourner i
     *
     * rechercheBinaire
     *     collection est tri�e.
     *
     * rechercheBinaire( tab, element ) : int
     *     debut <- 0
     *     fin <- tab.taille - 1
     *
     *     // reduire l'espace de recherche.
     *     tantque( debut < fin )
     *         // invariant :
     *         // si l'element est dans le tableau,
     *         // alors sa position est entre debut et fin.
     *         milieu <- ( debut + fin ) / 2
     *         si( element <= tab[milieu] )
     *         alors
     *             fin <- milieu
     *         sinon
     *             debut <- milieu + 1
     *
     *     si tab[debut] != element
     *     alors debut <- -1
     *
     *     retourner debut
     */
    public static <E>
    int rechercheLineaire( E [] tab, E element ) {
        int i = 0;

        while( i < tab.length && ! tab[i].equals( element ) ) {
            ++ i;
        }

        if( i == tab.length ) {
            i = -1;
        }

        return i;
    }

    public static < E extends Comparable< E > >
    int FouilleBinaire( E [] tableau, E element ){
        int debut = 0;
        int fin = tableau.length - 1;

        while( debut < fin ) {
            int milieu = ( debut + fin ) / 2;
            if( element.compareTo( tableau[milieu] ) <= 0 ) {
                fin = milieu;
            } else {
                debut = milieu + 1;
            }
        }
        if( tableau[ debut ].compareTo( element ) != 0 ) {
            debut = -1;
        }

        return debut;
    }

    public static < E extends Comparable< E > >
    int FouilleBinaireR( E [] tableau, E element ){
        return FouilleBinaireR(tableau, element, 0, tableau.length-1);
    }

    public static < E extends Comparable< E > >
    int FouilleBinaireR( E [] tableau, E element, int debut, int fin ){
        int resultat = 0;

        if( debut < fin ) {
            int milieu = ( debut + fin ) / 2;
            if( tableau[ milieu ].compareTo( element ) < 0 ) {
                resultat = FouilleBinaireR( tableau, element, milieu + 1, fin );
            } else {
                resultat = FouilleBinaireR( tableau, element, debut, milieu );
            }
        } else if( tableau[ debut ].compareTo( element ) == 0 ) {
            resultat = debut;
        } else {
            resultat = -1;
        }

        return resultat;
    }
}