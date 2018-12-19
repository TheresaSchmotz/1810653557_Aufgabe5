package Aufgabe1;

public class Mensch extends Saeugetier {

//Konstruktor
    public Mensch(String name, int alter, String geschlecht)
    {
        super(name, alter, geschlecht);
    }

    /*der Compiler soll schauen, ob die Oberklasse wirklich diese Methode enthält.
    Wenn dies nicht der Fall ist, benachrichtigt dich der Compiler.*/

    @Override
    public String printAll()
    {
        return String.format(getName()+"#"+getAlter()+"#"+getGeschlecht());
    }

    public static void main(String[] args)
    {
        Mensch thesi = new Mensch("Theresa", 19, "female");
        System.out.println(thesi.printAll());
    }
}

