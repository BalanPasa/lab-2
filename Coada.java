
public class Coada
{
    int capacitatea;
    int[] coada;
    int cap;
    int sfirsit;
    int count;
    public Coada(int size) 
    {
        capacitatea = size;
        coada = new int[capacitatea];
        cap = 0;
        sfirsit = -1;
        count = 0;
    }
    public Coada()
    {
        capacitatea = 50;
        coada = new int[50];
        cap = 0;
        sfirsit = 0;
        count = 0;

    }
    public void push(int addElement) 
    {
        System.out.println("Introdu: " + addElement);
        if (sfirsit == capacitatea - 1) sfirsit = -1;
        coada[++sfirsit] = addElement;
        count++;
    }
    public int pop() 
    {
        int temp = coada[cap++];
        if (cap == capacitatea) cap = 0;
        count--;
        return temp;
    }
    public void esteGol() 
    {
        if (count == 0) System.out.println("Coada este gola.");
    }
    public void estePlin() {
        if (capacitatea == size()) System.out.println("Coada este plina");
        else  System.out.println("Coada are elemente, dar nu este plină");
    }
    public int size() {return count;}
}