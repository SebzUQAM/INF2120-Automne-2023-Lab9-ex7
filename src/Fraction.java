public class Fraction implements Comparable<Fraction> {
    private double numerateur;
    private double denominateur;

    public Fraction(double numerateur, double denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction add(Fraction x) {
        double numerateur = this.numerateur * x.denominateur + this.denominateur * x.numerateur;
        double denominateur = this.denominateur * x.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    public Fraction sub(Fraction x) {
        double numerateur = this.numerateur * x.denominateur - this.denominateur * x.numerateur;
        double denominateur = this.denominateur * x.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    public Fraction mul(Fraction x) {
        double numerateur = this.numerateur * x.numerateur;
        double denominateur = this.denominateur * x.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    public Fraction div(Fraction x) {
        double numerateur = this.numerateur * x.denominateur;
        double denominateur = this.denominateur * x.numerateur;
        return new Fraction(numerateur, denominateur);
    }

    @Override
    public String toString() {
        return "Fraction : " + numerateur + "/" + denominateur;
    }

    private double fractionADouble(){
        return numerateur/denominateur;
    }

    @Override
    public int compareTo(Fraction fraction) {
        fraction = this.sub(fraction);
        double fractionDouble = fraction.fractionADouble();
        return fractionDouble < 0 ? (int)Math.floor(fractionDouble) : (int)Math.ceil(fractionDouble);
    }

    private static int nombreAleatoire(int plusPetit, int plusGrand){
        return (int)(Math.random() * (1+plusGrand-plusPetit) + plusPetit);
    }

    public static Fraction creerFractionAleatoire(){
        return new Fraction(nombreAleatoire(1,10), nombreAleatoire(1,10));
    }
}