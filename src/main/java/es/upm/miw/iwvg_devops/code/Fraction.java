package es.upm.miw.iwvg_devops.code;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper (){
        return this.numerator < this.denominator;
    }

    public boolean isImproper (){
        return this.numerator > this.denominator;
    }

    public boolean isEquivalent(Fraction fraction2) {
        return (this.numerator * fraction2.denominator) == (this.denominator * fraction2.numerator);
    }

    public Fraction add (Fraction fraction2){
        Fraction resul;
        if(this.denominator==fraction2.denominator){
            int numeratorResul = this.numerator+fraction2.numerator;
            resul= new Fraction(numeratorResul,this.denominator);
        }
        else{
            int mcm = minimoComunMultiplo(this.denominator,fraction2.denominator);
            int numerator1 = this.numerator * fraction2.getDenominator();
            int numerator2 = fraction2.getNumerator() * this.denominator;
            int numeratorResul = numerator1 + numerator2;
            resul=  new Fraction(numeratorResul,mcm);

        }
        return resul;
    }

    private static int minimoComunMultiplo(int a, int b) {
        int gcd = maximoComunDivisor(a, b);
        return (a * b) / gcd;

    }

    private static int maximoComunDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction multiply(Fraction fraction2){
        int numeratorResul = this.numerator*fraction2.numerator;
        int denominatorResul = this.denominator*fraction2.denominator;
        return new Fraction(numeratorResul,denominatorResul);
    }

    public Fraction divide(Fraction fraction2){
        int numeratorResul = this.numerator*fraction2.denominator;
        int denominatorResul = this.denominator*fraction2.numerator;
        return new Fraction(numeratorResul,denominatorResul);
    }


    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
