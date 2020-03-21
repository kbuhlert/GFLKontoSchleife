import java.util.Arrays;

public class KontoApp {
    public static void main(String[] args) {
        //Abruf Aufg 1-3
        kontozinsen(2000, 3, 0.015);

        //Abruf Aufg. 4)
        double[]zinsArray = kontozinsenArray(2000,10,0.02);
        System.out.println(Arrays.toString(zinsArray));

    }
    //Methode Auf 1-3) Berechnung Kontozins mit Schleife
    public static void kontozinsen (int einlage, int anlagedauer, double zins){
        double kontostand = einlage;
        System.out.println("Ihr Kontostand ist zu Beginn: " + einlage);
        for (int i=1; i<=anlagedauer; i++){
            kontostand = kontostand + einlage*zins;
            System.out.println("Kontostand = " + kontostand + "€ nach Zinsjahr: " + i);
        }
    }
    //Methode Auf 4), Berechne Zins und gib jedes Jahr in Array
    public static double[] kontozinsenArray (int einlage, int anlagedauer, double zins){
        double kontostand = einlage;
        double[] zinsArray = new double[anlagedauer+1];     //die Arraylänge ist 1 länger als die Anlagedauer, da auf Position 0 der Ausgangsstand gelegt wird.
        // der Array braucht also einen Extraplatz
        zinsArray[0]=einlage;           //Der aktuelle Kontostand wird auf die erste Position im Array gelegt
        for (int index=1; index<anlagedauer+1; index++){    // wenn Arrayv Länge 10 hat, hat der letzte Platz den Index 9, deshalb
            //muss bei der Abbruchbedingung der index kleiner als die Länge sein
            kontostand = kontostand + einlage*zins;
            zinsArray[index] = kontostand;                  // Befüllen des arrays mit dem jeweiligen Kontstand
        }
        return zinsArray;
    }
}
