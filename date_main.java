public class date_main {
    public static void main(String[] args) {

        date d1 = new date(15, 3, 2024);
        System.out.println("Date d1: " + d1);

        System.out.println(d1.an + " bissex? " + d1.bissex());

        System.out.println("jours ecoule: " + d1.nbJoursEcoules());

        System.out.println("jours restants: " + d1.nbJoursRestants());

        System.out.println("\n\n");

        date d2 = new date(25, 4, 2024);
        System.out.println("Date d2: " + d2);
        System.out.println("jours entre d1 et d2 (meme annee): " + d1.nbJoursEntre(d1, d2));

        System.out.println("\n\n");

        date d3 = new date(10, 12, 2024);
        date d4 = new date(15, 1, 2025);

        System.out.println("Date d3: " + d3);
        System.out.println("Date d4: " + d4);
        System.out.println("jours entre d3 et d4 (annees consecutives): " + d3.nbJoursEntre(d3, d4));

        System.out.println("\n\n");


        date d5 = new date(1, 1, 2020);
        date d6 = new date(1, 1, 2023);

        System.out.println("Date d5: " + d5);
        System.out.println("Date d6: " + d6);
        System.out.println("jours entre d5 et d6 (annees non consecutives): " + d5.nbJoursEntre(d5, d6));
    }
}
