package Aufgabe2;

public class Student extends Mensch
{

    private String martrikelnummer;
    private String studiengang;


    public Student(String vorname, String nachname, int alter, String martrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.martrikelnummer = martrikelnummer;
        this.studiengang = studiengang;
    }

    public Student(String vorname, String nachname, int alter)
    {
        super(vorname, nachname, alter);
    }

    public String getMartrikelnummer()
    {
        return martrikelnummer;
    }

    public void setMartrikelnummer(String martrikelnummer)
    {
        this.martrikelnummer = martrikelnummer;
    }

    public String getStudiengang()
    {
        return studiengang;
    }

    public void setStudiengang(String studiengang)
    {
        this.studiengang = studiengang;
    }




    @Override
    public void Status()
    {
        System.out.println(String.format("Es ist der Mensch "+ getVorname()+ " "+ getNachname()+", "+ getAlter()+ ", "+ getMartrikelnummer()+", "+getStudiengang()));
    }


    public static void main(String[] args)
    {
        Mensch theresa = new Mensch("Theresa", "Schmotz",19);
        theresa.Status();


        theresa = new Student("Theresa", "Schmotz",19, "1810653557", "WEB.vzB.18");
        theresa.Status();
    }
}