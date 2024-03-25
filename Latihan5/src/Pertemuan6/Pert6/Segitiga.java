package Pertemuan6.Pert6;

public class Segitiga{
    private double alas;
    private double tinggi;
    @SuppressWarnings("unused")
    private double sisi;
    
    public Segitiga(){
    }

    public Segitiga(double alas, double tinggi, double sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getLuas(){
        return (alas * tinggi) / 2;
    }

    public double getKeliling(){
        return alas + tinggi + alas;
    }
    public void setAlas(double alasBaru){
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru){
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru){
        this.sisi = sisiBaru;
    }
}