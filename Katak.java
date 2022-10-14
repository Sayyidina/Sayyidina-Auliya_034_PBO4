package Praktikum4;

/**
 *
 * @author sayyidina auliya
 */
public class Katak {
    int umur;
    String nama;
    public Katak(int umur, String nama){
        this.umur=umur;
        this.nama=nama;
    }
    public String caraBergerak(){
        if(umur>2){
            return "melompat";
        }
        else{
            return "berenang";
        }
    }
}
