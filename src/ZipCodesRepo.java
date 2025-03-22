public class ZipCodesRepo {
    ZipCode[] zips;
    int iterator = 0;
    ZipCode[] badZips = new ZipCode[10];

    ZipCodesRepo(int size){
        zips = new ZipCode[size];
    }

    void add(ZipCode zip){
        zips[iterator] = zip;
        iterator++;
    }

    void displayAll() {
        System.out.println("****** all unchecked zip codes ******");
        for (int i = 0; i < zips.length && zips[i] != null ; i++) {
            zips[i].display();
        }
    }

    void checkZipCodes(){
        ZipCode[] badZipCodes = new ZipCode[10];
        int iterator = 0;
        System.out.println("****** poprawne zip codes: ");
        for (int i = 0; i < zips.length && zips[i] != null; i++) {
            if((zips[i].zip.charAt(2)) == '-' && zips[i].zip.length() == 6) {
                zips[i].display();
            } else {
                badZips[iterator] = zips[i];
                iterator++;
            }
        }
        System.out.println("***** Bad zip codes ******");
        for (int i = 0; i < badZips.length && badZips[i] != null ; i++) {
            badZips[i].display();
        }
    }

    void displayAll(ZipCode[] badZips) {
        System.out.println("***** Bad zip codes ******");
        for (int i = 0; i < badZips.length ; i++) {
            badZips[i].display();
        }
    }
}
