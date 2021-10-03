public class Box 
{
    int inaltime;
    int latime;
    int adincime;

    public Box()
    {
        inaltime = 1;
        latime = 1;
        adincime = 1;
    }
    public Box(int value)
    {
        inaltime = value;
        latime = value;
        adincime = value;
    }
    public Box(int inaltime, int latime, int adincime)
    {
        this.inaltime = inaltime;
        this.latime = latime;
        this.adincime = adincime;
    }
    double suprafata(){return (2*adincime*latime + 2*adincime*inaltime + 2*inaltime*latime);}
    double volum(){return (inaltime*latime*adincime);}
    public String rezultat(){return ("\nInaltime: " + inaltime+"\nLatime: " + latime + "\nAdincime: " + adincime);}
}
