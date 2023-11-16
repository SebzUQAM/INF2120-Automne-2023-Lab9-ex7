public class Fraction implements Nombre<Fraction>,  Comparable<Fraction> {
    private double numerateur;
    private double denominateur;

    public Fraction() {
        numerateur = 0;
        denominateur = 1;
    }

    public Fraction(double numerateur, double denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    @Override
    public Fraction add(Fraction x) {
        double numerateur = this.numerateur * x.denominateur + this.denominateur * x.numerateur;
        double denominateur = this.denominateur * x.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    @Override
    public Fraction sub(Fraction x) {
        double numerateur = this.numerateur * x.denominateur - this.denominateur * x.numerateur;
        double denominateur = this.denominateur * x.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    @Override
    public Fraction mul(Fraction x) {
        double numerateur = this.numerateur * x.numerateur;
        double denominateur = this.denominateur * x.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    @Override
    public Fraction div(Fraction x) {
        double numerateur = this.numerateur * x.denominateur;
        double denominateur = this.denominateur * x.numerateur;
        return new Fraction(numerateur, denominateur);
    }

    public double getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(double numerateur) {
        this.numerateur = numerateur;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerateur=" + numerateur +
                ", denominateur=" + denominateur +
                '}';
    }

    private double fractionADouble(){
        return numerateur/denominateur;
    }

    @Override
    public int compareTo(Fraction fraction) {
        fraction = this.sub(fraction);
        double fractionDouble = fraction.fractionADouble();
        double arrondi = Math.ceil( Math.abs( fractionDouble ) );
        return (int)(Math.signum(fractionDouble) * arrondi);
    }
}