

public class date {

    public int jour;
    public int mois;
    public int an;

    public date(int j, int m, int a){
        this.jour = j;
        this.mois = m;
        this.an = a;
    }

    public String toString() {
        return jour + "/" + mois + "/" + an;
    }

    public boolean bissex(){
        return (an%4 == 0) && (an % 100 != 0 || an % 400 == 0);
    }

    public int nbJoursEcoules() {
        int nbr_jour[] = {31, bissex() ? 29 : 28, 31,30,31,30,31,31,30,31,30,31};
        int nbr = 0;
        for (int i = 0; i < mois-1; i++) {
            nbr += nbr_jour[i];
        }

        return nbr + jour;
    }

    public int nbJoursRestants() {
        return bissex()?366-nbJoursEcoules():365-nbJoursEcoules();
    }

    public static boolean bissex(int annee){
        return (annee%4 == 0) && (annee % 100 != 0 || annee % 400 == 0);    
    }

    public long nbJoursEntre(date d1, date d2){

        if (d1.an == d2.an) {
            return d2.nbJoursEcoules() - d1.nbJoursEcoules();
        }

        long jours = d1.nbJoursRestants() + d2.nbJoursEcoules();
        for (int y = d1.an + 1; y < d2.an; y++) {
            jours += bissex(y) ? 366 : 365;
        }

        return jours;
    }
}