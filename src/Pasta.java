public class Pasta {
    String type;
    boolean aldente;
    int tpsCuisson;

    public Pasta(String type, boolean aldente, int tpsCuisson) {
        this.type = type;
        this.aldente = aldente;
        this.tpsCuisson = tpsCuisson;
    }

    @Override
    public String toString() {
        return "Pasta: \n\t" +
                type +
                ", Al dente :" + aldente +
                ", Temps de cuisson: " + tpsCuisson +
                " min";
    }
}
