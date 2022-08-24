public class m {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //String ausgeben

        String message = "Hallo Welt!";
        System.out.println(message);
        //varibale ausgeben

        String word1 = "Hallo";
        String word2 = "Welt";
        System.out.println(word1 + word2);
        System.out.println(word1 + " " + word2 + "!!");
        //variablen addieren und ausgeben


        String message2 = word1 + " " + word2 + "!!";
        System.out.println(message2);
        //variablen und strings addieren und ausgeben

        String message3;
        message3 = "Hello";
        System.out.println(message3);
        message3 = message3 + " World";
        System.out.println(message3);
        message3 += "!!";
        message3 = message3 + " World";
        //variablen deklarieren und imme rmehr anfügen und ausgeben


        String str1 = "A";
        char letter1 = 'A';
        System.out.println(str1);
        System.out.println(letter1);
        //erst string und dann char ausgeben


        str1 = "ABC";
        letter1 = 'ABC';
        System.out.println(str1);
        System.out.println(letter1);
        //fehler! variablen bezeichnung fehlt


        System.out.println(17);
        System.out.println(17 + 4);
        System.out.println("17" + "4");
        //erst wird ein ergebnis einer rechnung ausgegeben und dann 2 strings

        int zahl1 = 17;
        System.out.println(zahl1);
        //integer wird ausgegeben

        int zahl2 = 4;
        System.out.println(zahl1 + zahl2);
        System.out.println(zahl1 + " + " + zahl2 + " = " + zahl1 + zahl2);
        //variable wird deklariert und dann wird ein ergebnis ausgegeben und dann eine rechnung

        int ergebnis1 = zahl1 + zahl2;
        System.out.println(ergebnis1);
        int ergebnis2 = zahl1 - zahl2;
        System.out.println(ergebnis2);
        int ergebnis3 = zahl1 * zahl2;
        System.out.println(ergebnis3);
        int ergebnis4 = zahl1 / zahl2;
        System.out.println(ergebnis4);
        int ergebnis5 = zahl1 % zahl2;
        System.out.println(ergebnis5);
        //2 varibalen werden auf jede rechen art verrechnet und dann ausgegeben

        zahl1 = 16;
        zahl2 = 4;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        //2 variablen werden verschieden verrechnet und dann wird eine rechnung ausgegeben

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        //zahl wird + 1 gerechnet und dann wieder verrechnet und die rechnungen werden ausgegeben

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        //zahl wird + 1 gerechnet und dann wieder verrechnet und die rechnungen werden ausgegeben

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        //zahl wird + 1 gerechnet und dann wieder verrechnet und die rechnungen werden ausgegeben

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        //zahl wird + 1 gerechnet und dann wieder verrechnet und die rechnungen werden ausgegeben

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        //zahl wird + 1 gerechnet und dann wieder verrechnet und die rechnungen werden ausgegeben

        double ergebnis = 17 / 4;
        System.out.println(ergebnis);
        //varibale deklariert und ausgegeben

        ergebnis = 17.0 / 4.0;
        System.out.println(ergebnis);
        //variable deklariert und ausgegeben

    }
}
