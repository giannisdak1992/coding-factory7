package gr.aueb.cf.ch1;

public class MenuApp {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("Επιλέξτε μία απ τις παρακάτω επιλογές: ");
        System.out.printf(  "%d" + "." + " " + "Εισαγωγή\n", num++);
        System.out.printf(  "%d" + "." + " " + "Διαγραφή\n", num++);
        System.out.printf(  "%d" + "." + " " + "Αναζήτηση\n", num++);
        System.out.printf(  "%d" + "." + " " + "Ενημέρωση\n", num++);
        System.out.printf(  "%d" + "." + " " + "Έξοδος\n", num++);

        System.out.println("Δώστε αριθμό επιλογής: ");


    }
}
