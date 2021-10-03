public class Main 
{
    /*
    1. Nivel de bază_ (marca 5 || 6):
Creați un program, unde ar trebui să instanțiați 3 obiecte de tip Box
(care ar trebui să aibă următoarele variabile de instanță -> înălțime, lățime și adâncime),
prin intermediul constructorului său în 3 moduri diferite:
1. Fără parametri (toate variabilele de instanță ar trebui să aibă valoarea implicită 1)
2. Cu 1 parametru (toate variabilele de instanță ar trebui să aibă aceeași valoare)
3. Cu 3 parametri (pentru fiecare variabilă de instanță)
2. Nivel mediu_ (marca 7 || 8):
Creați o coadă de clasă și creați 2 obiecte de acest tip. Fiecare coadă ar trebui să aibă ca stare
numărul de elemente din acesta și poate fi creat prin constructori cu și fără parametru.
Dacă este creat cu parametru, atunci ar trebui să aibă valoarea parametrului dimensiunea maximă, altfel
nu ar trebui să aibă această limitare.
Ar trebui să puteți adăuga la coadă printr-o metodă `queue.push (Type value);`. De asemenea, ar trebui să puteți
pentru a extrage articolele din coadă prin metoda `queue.pop ();`.
Regula pentru push și pop la coadă ar trebui să o luați în considerare de la cursul Structuri de date 
sau să o găsiți undeva în web, regula `FIFO`.
În program după ce creați cozile (cu param și fără), adăugați cu 3 valori la coadă și apoi
extrageți ultima valoare din fiecare dintre ele și imprimați în consolă.
3. Nivel avansat_ (marca 9 || 10):
Implementați două metode pentru calculul suprafeței și volumului unei cutii și utilizați-o pe o cutie creată
cu 3 variabile de instanță diferite. Imprimați rezultatele în consolă.
În clasa Queue adăugați o metodă pentru a verifica dacă obiectul este gol și una care verifică dacă obiectul
este plin (în cazul în care coada nu are parametri, ar trebui să spună că nu este niciodată plină, altfel 
ar trebui să verifice numărul de elemente comparativ cu dimensiunea cozii). De asemenea, utilizați aceste 
metode într-un program și imprimați rezultatele în consolă.
    */
    public static void main(String[] args)
    {
        System.out.println("Nivel mic:");

        Box b1 = new Box();
        Box b2 = new Box(15);
        Box b3 = new Box(25,6,98);

        System.out.println("Boxa 1:");
        System.out.println("Dimensiunea: "+ b1.rezultat());
        System.out.println("Suprafata: " + b1.suprafata() + "cm2");
        System.out.println("Volumul: " + b1.volum() + "cm3");
        
        System.out.println("Boxa 2:");
        System.out.println("Dimensiunea: "+ b2.rezultat());
        System.out.println("Suprafata: " + b2.suprafata() + "cm2");
        System.out.println("Volumul: " + b2.volum() + "cm3");
        
        System.out.println("Boxa 3:");
        System.out.println("Dimensiunea: "+ b3.rezultat());
        System.out.println("Suprafata: " + b3.suprafata() + "cm2");
        System.out.println("Volumul: " + b3.volum() + "cm3");

        System.out.println("\nNivel avansat:");

        Coada q1 = new Coada(5);
        Coada q2 = new Coada();

        System.out.println("\nPrima coadă:");
        q1.push(12);
        q1.push(20);
        q1.push(65);

        q1.pop();
        q1.esteGol();
        q1.estePlin();

        System.out.println("Coada are " + q1.size() + " elemente.");

        System.out.println("\nA doua coadă:");
        q2.push(43);
        q2.push(21);
        q2.push(37);

        q2.pop();
        q2.esteGol();
        q2.estePlin();

        System.out.println("Coada are " + q2.size() + " elemente.");
    }
}
