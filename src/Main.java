/**
 * Zadanie 1 - Kody pocztowe
 *
 * Napisz program, który dla podanych kodów pocztowych sprawdzi, czy są one poprawne.
 * Na potrzeby zadania poprawnym kodem pocztowym będzie taki który:
 * składa się z 6 znaków
 * na 3 pozycji posiada myślnik.
 */

public class Main {
    public static void main(String[] args) {

        int size = 100;
        ZipCodesRepo zips = new ZipCodesRepo(size);

        //dodanie 1 zip code
        String zip1 = "13-5328";
        ZipCode z1 = new ZipCode(zip1);
        zips.add(z1);

        //dodanie 2 zip code
        String zip2 = "1--532";
        ZipCode z2 = new ZipCode(zip2);
        zips.add(z2);

        //dodanie 3 zip code
        String zip3 = "10--472";
        ZipCode z3 = new ZipCode(zip3);
        zips.add(z3);

        //dodanie 4 zip code
        String zip4 = "01-732";
        ZipCode z4 = new ZipCode(zip4);
        zips.add(z4);

        //dodanie 5 zip code
        String zip5 = "341-732";
        ZipCode z5 = new ZipCode(zip5);
        zips.add(z5);

        //dodanie 6 zip code
        String zip6 = "41-087";
        ZipCode z6 = new ZipCode(zip6);
        zips.add(z6);

        //dodanie 7 zip code
        String zip7 = "418-93";
        ZipCode z7 = new ZipCode(zip7);
        zips.add(z7);

        //dodanie 8 zip code
        String zip8 = "12-667";
        ZipCode z8 = new ZipCode(zip8);
        zips.add(z8);

        //dodanie 9 zip code
        String zip9 = "38-937";
        ZipCode z9 = new ZipCode(zip9);
        zips.add(z9);

        //dodanie 10 zip code
        String zip10 = "38637";
        ZipCode z10 = new ZipCode(zip10);
        zips.add(z10);

        //wyświetlenie wszystkich kodów pocztowych
        zips.displayAll();

        //sprawdzanie poprawności kodów pocztowych
        zips.checkZipCodes();

    }
}
