package Pertemuan6.Pert6;

public class Main{
    public static void main(String[] args) {
        // Segitiga 1
        Segitiga segitiga1 = new Segitiga(1,1,1);
        System.out.println("Luas segitiga 1: " + segitiga1.getLuas());
        System.out.println("Keliling segitiga 1: " + segitiga1.getKeliling());

        // Segitiga 2 
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("Luas segitiga 2: " + segitiga2.getLuas());
        System.out.println("Keliling segitiga 2: " + segitiga2.getKeliling());

        // Segitiga3 
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("Luas segitiga 3: " + segitiga3.getLuas());
        System.out.println("Keliling segitiga 3: " + segitiga3.getKeliling());

    }
}
