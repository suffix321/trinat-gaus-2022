import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;

public class Hauptprogram {
    public static void main(String[] args) {

        int count = 0;
        Person[] adressbuch = new Person[30];

        try{
            //file auslesen, in string speichern und string in array splitten
            FileReader f = new FileReader("personen.txt");
            char[] c = new char[1300];
            f.read(c);
            String s = new String(c);
            String [] result = s.split(";|\\.|\r");

            for (int i = 0; i<result.length-1 ; i+=9){
                //Personenn in adressbuch speichern
                GregorianCalendar datum1 = new GregorianCalendar(Integer.parseInt(result[i+8].trim()),Integer.parseInt(String.valueOf(result[i+7].trim()))-1,Integer.parseInt(String.valueOf(result[i+6].trim()))+0);

                Person temp  = new Person(result[i], result[i+1],datum1, result[i+2], Integer.parseInt(result[i+3]), Integer.parseInt(result[i+4]), result[i+5]);
                adressbuch[count++] = temp;

            }
        //Fehler finden
        }catch(IOException e){

            System.out.println("Fehler beim einlesen der Datei");
            System.out.println(e.getMessage());

        }
        //adressbuch printen
        for (int i = 0 ; i < count ; i++) {
            adressbuch[i].print();
            System.out.println("");

        }
    }
}
