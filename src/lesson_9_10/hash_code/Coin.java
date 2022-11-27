package lesson_9_10.hash_code;

import java.util.Objects;

public class Coin {
    private int nominal;
    private double diameter;
    private String country;
    private int year;

    public Coin(int nominal, double diameter, String country, int year) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "nominal = " + nominal +
                ", diameter = " + diameter +
                ", country = '" + country  +
                ", year = " + year+ "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diameter, diameter) != 0) return false;
        if (year != coin.year) return false;
        return Objects.equals(country, coin.country);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
