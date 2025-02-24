package org.example;

/**
 *  Verifica di informatica 4ei
 *  @author prof. Zanzottera Fabio
 *  @version 1.0-3di, 19/11/24
 */
public class Main {
    /**
     * default constructor no usages
     */
    public Main() {};

    static final String cognome="Mauro";// assegnare alla variabile il proprio cognome
    static final String nome="Simone"; // assegnare alla variabile il proprio nome
    static final String currentDate="13/01/25";
    static final String classe="4EI";

    /**
     * Programma principale modificare solo dove indicato nei commenti
     * @param args non modificare questo parametro
     */
    public static void main(String[] args) {
        System.out.println(getIntestazione(cognome,nome)+"\n--------------------------");
        System.out.println("ESERCIZIO 1");
        System.out.println(somma(5,3));
        System.out.println("ESERCIZIO 2");
        System.out.println(isMaggiorenne(32));
        System.out.println("ESERCIZIO 3");
        System.out.println(isVocale('a'));
        System.out.println("ESERCIZIO 4");
        System.out.println(tipoTriangolo(3,3,3));
        System.out.println("ESERCIZIO 5");
        System.out.println(giornoSettimana(300));
        System.out.println("ESERCIZIO 6");
        System.out.println(ordineDecrescente(50,35));
        System.out.println("ESERCIZIO 7");
        System.out.println(giorniLumaca(5,2,15));
        System.out.println("ESERCIZIO 8");
        System.out.println(coordinatePunto(0,0,0,1,1,0));



    }

    /**
     * non modificare questo metodo
     * @param nome nome dello studente
     * @param cognome cognome dello studente
     * @return stringa  intestazione
     */
    public static String getIntestazione(String nome, String cognome) {
        return "interrogazione Informatica "+classe+" parte scritta di "+cognome+" "+nome+" data: "+currentDate;
    }

    /**
     * Esercizio 1
     * sviluppare il metodo che restituisce la somma dei due parametri in ingresso
     * @param a addendo 1
     * @param b addendo 2
     * @return somma dei due addendi
     */
    public static int somma(int a,int b) {
        int risposta=a + b;
        return risposta;
    }

    /**
     * Esercizio 2
     * scrivere il codice che restituisca la stringa "maggiorenne" se il parametro età (age) indica che la persona ha compiuto i 18 anni,
     * altrimenti restituisca la stringa "minorenne"
     * @param age età della persona
     * @return "maggiorenne" o "minorenne"
     */
    public static String isMaggiorenne(int age) {
        String risposta;
        if (age>=18) {
            risposta="maggiorenne";
            return risposta;

        } else{
            risposta="minorenne";
            return risposta;
        }
    }

    /**
     * ESERCIZIO 3
     * Scrivi un programma Java che verifica se un carattere è una vocale o una consonante.
     * @param carattere da controllare
     * @return vero se è una vocale, falso negli altri casi
     */
    public static boolean isVocale(char carattere) {
        boolean risposta=false;
        carattere = Character.toLowerCase(carattere);

        if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
            risposta = true; 
        }
        return risposta;
    }
    

    /**
     * ESERCIZIO 4
     * Scrivi un programma che data la lunghezza dei tre lati di un triangolo restituisca se questo è equilatero, isoscele o scaleno
     * @param lato1 lato triangolo
     * @param lato2 lato triangolo
     * @param lato3 lato triangolo
     * @return tipo triangolo
     */
    public static String tipoTriangolo(float lato1, float lato2, float lato3) {
        String risposta="equilatero,isoscele,scaleno";
        if (lato1 <= 0 || lato2 <= 0 || lato3 <= 0 || 
            lato1 + lato2 <= lato3 || lato1 + lato3 <= lato2 || lato2 + lato3 <= lato1) {
            risposta = "I lati non formano un triangolo valido";
        } else if (lato1 == lato2 && lato2 == lato3) {
            risposta = "equilatero";
        } else if (lato1 == lato2 || lato1 == lato3 || lato2 == lato3) {
            risposta = "isoscele";
        } else {
            risposta = "scaleno";
        }
        return risposta;
    }

    /**
     * ESERCIZIO  5
     * Scrivi un programma che restituisca il giorno della settimana dato il giorno dall'inizio dell'anno sapendo che il primo gennaio era lunedì
     * es. giorno=324 => martedì
     * @param giorno (int) giorno dell'anno
     * @return (String) nome del giorno della settimana
     */
    public static String giornoSettimana(int giorno) {
        String[] risposta = {"lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato", "domenica"};
        return risposta[(giorno - 1) % 7];
    }

    /**
     * ESERCIZIO 6
     * Scrivi un programma che dati due valori fine e inizio tali che fine>inizio
     * restituisca una stringa contenente in ordine decrescente tutti i numeri tra fine e inizio (compresi) separati da una virgola
     * es. ordineDecrescente(100,98) => "100,99,98"
     * @param fine primo numero da stampare (più grande)
     * @param inizio ultimo numero da stampare (più piccolo)
     * @return stringa di numeri separati da una virgola
     */
    public static String ordineDecrescente(int fine, int inizio) {
        StringBuilder risposta = new StringBuilder();
        for (int i = fine; i >= inizio; i--) {
            risposta.append(i);
            if (i > inizio) {
                risposta.append(",");
            }
        }
        return risposta.toString();
    }

    /**
     * ESERCIZIO 7
     * Una lumaca si trova alla base di un muro alto (float muro) metri.
     * Ogni giorno sale di (float sale) metri ma, durante la notte, scivola in giù di (float scende).
     * In quanti giorni la lumaca raggiungerà la cima del muro?
     * es: giorniLumaca(5,4,10) => 2
     * @param sale metri percorsi in salita di giorno dalla lumaca
     * @param scende metri persi in discesa durante la notte dalla lumaca
     * @param muro altezza del muro
     * @return giorni impiegati dalla lumaca a salire il muro
     */
    public static int giorniLumaca(float sale, float scende, float muro) {
        if (sale >= muro) {
            return 1;
        }
        int risposta = 0;
        float posizione = 0;
        while (posizione < muro) {
            risposta++;
            posizione += sale;
            if (posizione >= muro) {
                break;
            }
            posizione -= scende;
        }
        return risposta;
    }

    /**
     * ESERCIZIO 8
     * In un diagramma cartesiano, dati i vertici P1 P2 e P3 di un rettangolo con i lati paralleli/perpendicolari agli assi
     * calcolare le coordinate del punto P4 e stamparlo come stringa separando l'ascissa e l'ordinata con una virgola
     * es. P1(0,0), P2(0,1), P3(1,0) => coordinatePunto(0,0,0,1,1,0) => 1,1
     * @param x1 ascissa P1
     * @param y1 ordinata P1
     * @param x2 ascissa P2
     * @param y2 ordinata P2
     * @param x3 ascissa P3
     * @param y3 ordinata P3
     * @return ascissaP4,ordinataP4
     */

    public static String coordinatePunto(int x1, int y1, int x2, int y2,int x3,int y3) {
        int risposta1 = x1 ^ x2 ^ x3;
        int risposta2 = y1 ^ y2 ^ y3;
        return risposta1 + "," + risposta2;
    }
}