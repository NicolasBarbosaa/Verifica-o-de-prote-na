public class Dna {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna1;

        int ATG = dna.indexOf("ATG");
        String TGAString = dna.substring(dna.length() - 3, dna.length());
        int TGA;
        if (TGAString.equals("TGA")) {
            TGA = dna.length() - 3;
        } else {
            TGA = 1;
        }
        
        if (dna.length() % 3 == 0) {
            if (ATG >= 0 && (dna.length() - TGA) == 3) {
                System.out.println("É uma proteína");
            } else {
                System.out.println("Não é uma proteína");
            }
        } else {
            System.out.println("Não é uma proteína");
        }
    }
}