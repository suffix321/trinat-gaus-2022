import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;

public class Person {
    private String name;
    private String vorname;
    private GregorianCalendar geburtsdatum = new GregorianCalendar();
    private String strasse;
    private int hausnummer;
    private int postleitzahl;
    private String wohnort;

    public Person(String name, String vorname, GregorianCalendar geburtsdatum, String strasse, int hausnummer, int postleitzahl, String wohnort) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.wohnort = wohnort;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public void print() {
        SimpleDateFormat df = new SimpleDateFormat("dd. MMMMMM yyyy");
        String gebDat = df.format(geburtsdatum.getTime());
        System.out.println(gebDat);
        System.out.println(this.vorname +" "+ this.name +" "+ this.alter() +" "+ this.strasse +" "+ this.hausnummer +" "+ this.postleitzahl +" "+ this.wohnort);
    }
    public int alter() {
        GregorianCalendar heute = new GregorianCalendar();
        int alter = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);
        if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)){
            alter--;
        }
        return (alter);
    }
}
