import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Es1 es1 = new Es1();
        int result = es1.moltiplicazione(3,2);
        System.out.println("il risultato della moltiplicazione è " + result );
        String risultatoConc = es1.concatena("Rick",56);
        System.out.println("Risultato concatenazione è " + risultatoConc );
        String[] arrayOG = {"1","2","3","4","5"};
        String[] arrayMappato = es1.inseriscilnArray(arrayOG,"-");
        System.out.println(arrayMappato[0]);
        System.out.println(arrayMappato[1]);
        System.out.println(arrayMappato[2]);
        System.out.println(arrayMappato[3]);
        System.out.println(arrayMappato[4]);
        System.out.println(arrayMappato[5]);
        Es2 es2 = new Es2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima Stringa");
        String st1 = scanner.nextLine();
        System.out.println("Inserisci la seconda Stringa");
        String st2 = scanner.nextLine();
        System.out.println("Inserisci la terza Stringa");
        String st3 = scanner.nextLine();
        String concatenazione = es2.conc(st1,st2,st3);
        String inversione = es2.inverti(st1,st2,st3);
        System.out.println(concatenazione);
        System.out.println(inversione);
        Es3 es3 = new Es3();
        System.out.println("Inserisci L1 del Rettangolo");
        int l1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci L2 del Rettangolo");
        int l2 = Integer.parseInt(scanner.nextLine());
        int risultatoPerimetro =  es3.perimetroRettangolo(l1,l2);
        System.out.println("il risultato del perimetro è: "+ risultatoPerimetro);
        System.out.println("Inserisci il numero per controllare se è pari o dispari, se esce 0 è pari se 1 è dispari");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println(es3.pariDispari(n1));
        System.out.println("Calcolo Area Triangolo");
        System.out.println("inserisci lunghezza del lato a del triangolo");
        double a = scanner.nextDouble();
        System.out.println("inserisci lunghezza del lato b del triangolo");
        double b = scanner.nextDouble();
        System.out.println("inserisci lunghezza del lato c del triangolo");
        double c = scanner.nextDouble();
        double area = es3.areaTriangolo(a,b,c);
        System.out.println("L'area del Triangolo è: " + area);


    }
}
