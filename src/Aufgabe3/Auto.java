package Aufgabe3;

public class Auto {

    private boolean klimaanlage,
    private short airbags;


    void klimaanglageAn ()
    {
        klimaanlage = true;
        if (klimaanlage==false)
        {
            System.err.println("Klimaanlage läuft schon!");
        }
    }

    void klimaanlageAus()
    {
        klimaanlage = false;
        if(klimaanlage==true)
        {
            System.err.println("Klimaanlage ist schon aus!");
        }
    }
}
