import java.util.*;

public class TexteCoreen {

    String texteCoreen;

    public ArrayList<ArrayList<Integer>> hangeulList = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<String>> hangeulListString = new ArrayList<ArrayList<String>>();

    public TexteCoreen( String texte ) {
        texteCoreen = texte;
    }

    public void conversionNumeroToUnicodeConsonneInitiale() {
        for (int i = 0; i < hangeulListString.size(); i++) {
            if (hangeulListString.get(i).get(0).equals("1")) {
                hangeulListString.get(i).set(0, "\u006B");
            }
            else if (hangeulListString.get(i).get(0).equals("2")) {
                hangeulListString.get(i).set(0, "\u006B\u0324");
            }
            else if (hangeulListString.get(i).get(0).equals("3")) {
                hangeulListString.get(i).set(0, "\u006E");
            }
            else if (hangeulListString.get(i).get(0).equals("4")) {
                hangeulListString.get(i).set(0, "\u0074");
            }
            else if (hangeulListString.get(i).get(0).equals("5")) {
                hangeulListString.get(i).set(0, "\u0074\u0324");
            }
            else if (hangeulListString.get(i).get(0).equals("6")) {
                hangeulListString.get(i).set(0, "\u027E");
            }
            else if (hangeulListString.get(i).get(0).equals("7")) {
                hangeulListString.get(i).set(0, "\u006D");
            }
            else if (hangeulListString.get(i).get(0).equals("8")) {
                hangeulListString.get(i).set(0, "\u0070");
            }
            else if (hangeulListString.get(i).get(0).equals("9")) {
                hangeulListString.get(i).set(0, "\u0070\u0324");
            }
            else if (hangeulListString.get(i).get(0).equals("10")) {
                hangeulListString.get(i).set(0, "\u0073");
            }
            else if (hangeulListString.get(i).get(0).equals("11")) {
                hangeulListString.get(i).set(0, "\u0073\u0324");
            }
            else if (hangeulListString.get(i).get(0).equals("12")) {
                hangeulListString.get(i).remove(0);
            }
            else if (hangeulListString.get(i).get(0).equals("13")) {
                hangeulListString.get(i).set(0, "\u0074\u0255");
            }
            else if (hangeulListString.get(i).get(0).equals("14")) {
                hangeulListString.get(i).set(0, "\u0074\u0324\u0255");
            }
            else if (hangeulListString.get(i).get(0).equals("15")) {
                hangeulListString.get(i).set(0, "\u0074\u0255\u02B0");
            }
            else if (hangeulListString.get(i).get(0).equals("16")) {
                hangeulListString.get(i).set(0, "\u006B\u02B0");
            }
            else if (hangeulListString.get(i).get(0).equals("17")) {
                hangeulListString.get(i).set(0, "\u0074\u02B0");
            }
            else if (hangeulListString.get(i).get(0).equals("18")) {
                hangeulListString.get(i).set(0, "\u0070\u02B0");
            }
            else if (hangeulListString.get(i).get(0).equals("19")) {
                hangeulListString.get(i).set(0, "\u0068");
            }
            else if (hangeulListString.get(i).get(0).equals("20")) {
                hangeulListString.get(i).set(0, "\u006B\u031A");
            }
            else if (hangeulListString.get(i).get(0).equals("21")) {
                hangeulListString.get(i).set(0, "\u006C");
            }
            else if (hangeulListString.get(i).get(0).equals("22")) {
                hangeulListString.get(i).set(0, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(0).equals("23")) {
                hangeulListString.get(i).set(0, "\u0070\u031A");
            }
        }
    }

    public void conversionNumeroToUnicodeVoyelle() {
        for (int i = 0; i < hangeulListString.size(); i++) {
            if (hangeulListString.get(i).get(1).equals("1")) {
                hangeulListString.get(i).set(1, "\u0061");
            }
            else if (hangeulListString.get(i).get(1).equals("2")) {
                hangeulListString.get(i).set(1, "\u025B");
            }
            else if (hangeulListString.get(i).get(1).equals("3")) {
                hangeulListString.get(i).set(1, "\u006A\u0061");
            }
            else if (hangeulListString.get(i).get(1).equals("4")) {
                hangeulListString.get(i).set(1, "\u006A\u025B");
            }
            else if (hangeulListString.get(i).get(1).equals("5")) {
                hangeulListString.get(i).set(1, "\u028C");
            }
            else if (hangeulListString.get(i).get(1).equals("6")) {
                hangeulListString.get(i).set(1, "\u0065");
            }
            else if (hangeulListString.get(i).get(1).equals("7")) {
                hangeulListString.get(i).set(1, "\u006A\u028C");
            }
            else if (hangeulListString.get(i).get(1).equals("8")) {
                hangeulListString.get(i).set(1, "\u006A\u0065");
            }
            else if (hangeulListString.get(i).get(1).equals("9")) {
                hangeulListString.get(i).set(1, "\u006F");
            }
            else if (hangeulListString.get(i).get(1).equals("10")) {
                hangeulListString.get(i).set(1, "\u0077\u0061");
            }
            else if (hangeulListString.get(i).get(1).equals("11")) {
                hangeulListString.get(i).set(1, "\u0077\u025B");
            }
            else if (hangeulListString.get(i).get(1).equals("12")) {
                hangeulListString.get(i).set(1, "\u00F8");
            }
            else if (hangeulListString.get(i).get(1).equals("13")) {
                hangeulListString.get(i).set(1, "\u006A\u006F");
            }
            else if (hangeulListString.get(i).get(1).equals("14")) {
                hangeulListString.get(i).set(1, "\u0075");
            }
            else if (hangeulListString.get(i).get(1).equals("15")) {
                hangeulListString.get(i).set(1, "\u0077\u028C");
            }
            else if (hangeulListString.get(i).get(1).equals("16")) {
                hangeulListString.get(i).set(1, "\u0077\u0065");
            }
            else if (hangeulListString.get(i).get(1).equals("17")) {
                hangeulListString.get(i).set(1, "\u0079");
            }
            else if (hangeulListString.get(i).get(1).equals("18")) {
                hangeulListString.get(i).set(1, "\u006A\u0075");
            }
            else if (hangeulListString.get(i).get(1).equals("19")) {
                hangeulListString.get(i).set(1, "\u026F");
            }
            else if (hangeulListString.get(i).get(1).equals("20")) {
                hangeulListString.get(i).set(1, "\u0270\u0069");
            }
            else if (hangeulListString.get(i).get(1).equals("21")) {
                hangeulListString.get(i).set(1, "\u0069");
            }
        }
    }

    public void conversionNumeroToUnicodeConsonneFinal() {
        for (int i = 0; i < hangeulListString.size(); i++) {
            if (hangeulListString.get(i).get(2).equals("1")) {
                hangeulListString.get(i).set(2, "\u006B\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("2")) {
                hangeulListString.get(i).set(2, "\u006B\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("3")) {
                hangeulListString.get(i).set(2, "\u006B");
            }
            else if (hangeulListString.get(i).get(2).equals("4")) {
                hangeulListString.get(i).set(2, "\u006E");
            }
            else if (hangeulListString.get(i).get(2).equals("5")) {
                hangeulListString.get(i).set(2, "\u006E\u0074\u0255");
            }
            else if (hangeulListString.get(i).get(2).equals("6")) {
                hangeulListString.get(i).set(2, "\u006E\u0068");
            }
            else if (hangeulListString.get(i).get(2).equals("7")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("8")) {
                hangeulListString.get(i).set(2, "\u006C");
            }
            else if (hangeulListString.get(i).get(2).equals("9")) {
                hangeulListString.get(i).set(2, "\u006B");
            }
            else if (hangeulListString.get(i).get(2).equals("10")) {
                hangeulListString.get(i).set(2, "\u006D");
            }
            else if (hangeulListString.get(i).get(2).equals("11")) {
                hangeulListString.get(i).set(2, "\u0070");
            }
            else if (hangeulListString.get(i).get(2).equals("12")) {
                hangeulListString.get(i).set(2, "\u0073");
            }
            else if (hangeulListString.get(i).get(2).equals("13")) {
                hangeulListString.get(i).set(2, "\u0074\u02B0");
            }
            else if (hangeulListString.get(i).get(2).equals("14")) {
                hangeulListString.get(i).set(2, "\u0070\u02B0");
            }
            else if (hangeulListString.get(i).get(2).equals("15")) {
                hangeulListString.get(i).set(2, "\u0068");
            }
            else if (hangeulListString.get(i).get(2).equals("16")) {
                hangeulListString.get(i).set(2, "\u006D");
            }
            else if (hangeulListString.get(i).get(2).equals("17")) {
                hangeulListString.get(i).set(2, "\u0070\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("18")) {
                hangeulListString.get(i).set(2, "\u0070\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("19")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("20")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("21")) {
                hangeulListString.get(i).set(2, "\u014B");
            }
            else if (hangeulListString.get(i).get(2).equals("22")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("23")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("24")) {
                hangeulListString.get(i).set(2, "\u006B\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("25")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("26")) {
                hangeulListString.get(i).set(2, "\u0070\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("27")) {
                hangeulListString.get(i).set(2, "\u0074\u031A");
            }
            else if (hangeulListString.get(i).get(2).equals("28")) {
                hangeulListString.get(i).set(2, "\u027E");
            }
            else if (hangeulListString.get(i).get(2).equals("29")) {
                hangeulListString.get(i).set(2, "\u0073\u0324");
            }
        }
    }

    public void conversionIntegerToString() {
        for (int i = 0; i < hangeulList.size(); i++) {
            ArrayList<String> jamosListString = new ArrayList<String>();
            for (Integer x : hangeulList.get(i)) {
                jamosListString.add(String.valueOf(x));
            }
            hangeulListString.add(jamosListString);
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls() {
        correctionLiaisonEntreDeuxHangeuls1();
        correctionLiaisonEntreDeuxHangeuls2();
        correctionLiaisonEntreDeuxHangeuls3();
        correctionLiaisonEntreDeuxHangeuls4();
        correctionLiaisonEntreDeuxHangeuls5();
        correctionLiaisonEntreDeuxHangeuls6();
        correctionLiaisonEntreDeuxHangeuls7();
        correctionLiaisonEntreDeuxHangeuls8();

        correctionLiaisonEntreDeuxHangeuls9();
        correctionLiaisonEntreDeuxHangeuls10();
        correctionLiaisonEntreDeuxHangeuls11();
        correctionLiaisonEntreDeuxHangeuls12();
        correctionLiaisonEntreDeuxHangeuls13();
        correctionLiaisonEntreDeuxHangeuls14();
        correctionLiaisonEntreDeuxHangeuls15();
        correctionLiaisonEntreDeuxHangeuls16();
        correctionLiaisonEntreDeuxHangeuls17();
        correctionLiaisonEntreDeuxHangeuls18();

        correctionLiaisonEntreDeuxHangeuls19();
        correctionLiaisonEntreDeuxHangeuls20();
    }

    // 1er tableau de liaison

    public void correctionLiaisonEntreDeuxHangeuls1() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 2 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 7 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 28);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 16);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 12);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls2() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 1);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 2 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 7 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 28);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 16);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 12);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls3() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 1);
                hangeulList.get(i+1).set(0, 20);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 7 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 16);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 11);
                hangeulList.get(i+1).set(0, 1);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls4() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 21);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 16);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 16);
                hangeulList.get(i+1).set(0, 3);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls5() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 1);
                hangeulList.get(i+1).set(0, 5);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 7 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 16);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 4);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls6() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 21);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 21);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 10);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 10);
                hangeulList.get(i+1).set(0, 3);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls7() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 4 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 7 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 8 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 16 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 10);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 10);
                hangeulList.get(i+1).set(0, 7);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls8() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 1 && hangeulList.get(i+1).get(0) == 8) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 8);
            }
            else if (hangeulList.get(i).get(2) == 17 && hangeulList.get(i+1).get(0) == 8) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 23);
            }
        }
    }

    //2e tableau de liaison (probleme voir reponse du prof) (avec un symbole du tableau (d))

    public void correctionLiaisonEntreDeuxHangeuls9() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 12);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 20 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 29);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 22 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 15);
            }
            else if (hangeulList.get(i).get(2) == 23 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 15);
            }
            else if (hangeulList.get(i).get(2) == 24 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 2);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 25 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 15);
            }
            else if (hangeulList.get(i).get(2) == 26 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 27 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 15);
                hangeulList.get(i+1).set(0, 12);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls10() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 22 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 15);
            }
            else if (hangeulList.get(i).get(2) == 23 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 15);
            }
            else if (hangeulList.get(i).get(2) == 24 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 2);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 25 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 26 && hangeulList.get(i+1).get(0) == 19) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 12);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls11() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 22 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 23 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 25 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 26 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 27 && hangeulList.get(i+1).get(0) == 1) {
                hangeulList.get(i).set(2, 15);
                hangeulList.get(i+1).set(0, 20);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls12() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 20 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 22 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 23 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 25 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 26 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 3);
            }
            else if (hangeulList.get(i).get(2) == 27 && hangeulList.get(i+1).get(0) == 3) {
                hangeulList.get(i).set(2, 15);
                hangeulList.get(i+1).set(0, 3);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls13() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 20 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 22 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 23 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 24 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 2);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 25 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 26 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 27 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 15);
                hangeulList.get(i+1).set(0, 22);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls14() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 12);
            }
            else if (hangeulList.get(i).get(2) == 27 && hangeulList.get(i+1).get(0) == 6) {
                hangeulList.get(i).set(2, 28);
                hangeulList.get(i+1).set(0, 12);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls15() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 21 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 21);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 22 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 23 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 24 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 2);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 25 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 26 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 27 && hangeulList.get(i+1).get(0) == 7) {
                hangeulList.get(i).set(2, 15);
                hangeulList.get(i+1).set(0, 7);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls16() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 19 && hangeulList.get(i+1).get(0) == 8) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 8);
            }
        }
    }

    // ICI L<ERREUR POTENTIEL (VOIR COURRIEL PROF) SYMBOLE INTROUVABLE DANS LA LISTE DE (d)

    public void correctionLiaisonEntreDeuxHangeuls17() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 20 && hangeulList.get(i+1).get(0) == 10) {
                hangeulList.get(i).set(2, 29);
                hangeulList.get(i+1).set(0, 10);
            }
/**
 else if (hangeulList.get(i).get(2) == ?? && hangeulList.get(i+1).get(0) == 10) {
 hangeulList.get(i).set(2, 7);
 hangeulList.get(i+1).set(0, 15);
 }
 */
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls18() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 20 && hangeulList.get(i+1).get(0) == 13) {
                hangeulList.get(i).set(2, 7);
                hangeulList.get(i+1).set(0, 15);
            }
        }
    }

    //3e tableau de liaison

     public void correctionLiaisonEntreDeuxHangeuls19() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 3 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 10);
            }
            else if (hangeulList.get(i).get(2) == 5 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 13);
            }
            else if (hangeulList.get(i).get(2) == 6 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 9 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 1);
            }
            else if (hangeulList.get(i).get(2) == 10 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 7);
            }
            else if (hangeulList.get(i).get(2) == 11 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 8);
            }
            else if (hangeulList.get(i).get(2) == 12 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 10);
            }
            else if (hangeulList.get(i).get(2) == 13 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 17);
            }
            else if (hangeulList.get(i).get(2) == 14 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 18);
            }
            else if (hangeulList.get(i).get(2) == 15 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 19);
            }
            else if (hangeulList.get(i).get(2) == 18 && hangeulList.get(i+1).get(0) == 12) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 10);
            }
        }
    }

    public void correctionLiaisonEntreDeuxHangeuls20() {
        for (int i = 0; i < hangeulList.size(); i++) {
            if (hangeulList.get(i).get(2) == 3 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 5 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 5);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 6 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 4);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 9 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 3);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 10 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 10);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 11 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 11);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 12 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 13 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 17);
            }
            else if (hangeulList.get(i).get(2) == 14 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 14);
                hangeulList.get(i+1).set(0, 4);
            }
            else if (hangeulList.get(i).get(2) == 15 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 8);
                hangeulList.get(i+1).set(0, 22);
            }
            else if (hangeulList.get(i).get(2) == 18 && hangeulList.get(i+1).get(0) == 4) {
                hangeulList.get(i).set(2, 17);
                hangeulList.get(i+1).set(0, 12);
            }
        }
    }
    
    public int noHangeul( int codesPoint ) {
        int hangeul;
        hangeul = codesPoint - 44032;
        return hangeul;
    }

    public int noConsonneInitiale( int codesPoint) {
        int consonneInitiale;
        consonneInitiale = 1 + (noHangeul(codesPoint) / 588);
        return consonneInitiale;
    }

    public int noVoyelle( int codesPoint ) {
        int voyelle;
        voyelle = 1 + (((noHangeul(codesPoint)-noConsonneFinale(codesPoint))%588)/28);
        return voyelle;
    }

    public int noConsonneFinale( int codesPoint ) {
        int consonneFinale;
        consonneFinale = noHangeul(codesPoint)%28;
        return consonneFinale;
    }

    public String traduire() {
        for (int i = 0; i <= texteCoreen.length(); i++) {
            ArrayList<Integer> jamosList = new ArrayList<Integer>();
            jamosList.add(noConsonneInitiale(texteCoreen.codePointAt(i)));
            jamosList.add(noVoyelle(texteCoreen.codePointAt(i)));
            jamosList.add(noConsonneFinale(texteCoreen.codePointAt(i)));
            hangeulList.add(jamosList);
        }

        correctionLiaisonEntreDeuxHangeuls();

        conversionIntegerToString();

        conversionNumeroToUnicodeConsonneFinal();
        conversionNumeroToUnicodeVoyelle();
        conversionNumeroToUnicodeConsonneInitiale();

        String texteTraduit = "";

        for (int i = 0; i < hangeulListString.size(); i++) {
            for (int j = 0; j < hangeulListString.get(i).size(); j++) {
                texteTraduit = texteTraduit + hangeulListString.get(i).get(j);
            }
        }

        return texteTraduit;
    }

}
