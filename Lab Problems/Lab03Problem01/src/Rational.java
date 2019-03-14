public class Rational {

    private int nominator;
    private int denominator;

    Rational(int nominator, int denominator){
        if (denominator == 0){
            throw new ArithmeticException("Denominator can't be zero");
        }

        int gcd = CustomMath.gcd(nominator, denominator);

        this.nominator = nominator / gcd;
        this.denominator = denominator / gcd;

    }

    Rational add(Rational other){
        int resNominator = nominator * other.denominator + denominator * other.nominator;
        int resDenominator = denominator * other.denominator;

        return new Rational(resNominator, resDenominator);
    }

    Rational sub(Rational other){
        int resNominator = nominator * other.denominator - denominator * other.nominator;
        int resDenominator = denominator * other.denominator;

        return new Rational(resNominator, resDenominator);
    }

    Rational mul(Rational other){
        int resNominator = nominator * other.nominator;
        int resDenominator = denominator * other.denominator;

        return new Rational(resNominator, resDenominator);
    }

    Rational div(Rational other){
        int resNominator = nominator * other.denominator;
        int resDenominator = denominator * other.nominator;

        return new Rational(resNominator, resDenominator);
    }

    int compareTo(Rational other){
        int a = nominator * other.denominator;
        int b = denominator * other.nominator;

        return a - b;
    }

    public String toString(){
        return nominator + "/" + denominator;
    }

    static Rational parse(String s){
        String[] parts = s.split("/");

        if(parts.length == 0 || parts.length > 2){
            throw new IllegalArgumentException("Incorrect rational " + s);
        }

        try{
            if(parts.length == 1){
                return new Rational(Integer.parseInt(parts[0]), 1);
            }
            else{
                return new Rational(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException("Incorrect rational " + s);
        }
    }
}
