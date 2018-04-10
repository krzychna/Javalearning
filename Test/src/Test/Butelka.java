package Test;
public class Butelka{
    private static int pojemnosc = 10;
    private double ilelitrow;
    Butelka(double ilelitrow){
        this.ilelitrow = ilelitrow;
    }
    double getIlelitrow(){
        return this.ilelitrow;
    }
    void wlej (double ilosc){
        if (this.getIlelitrow()+ilosc>pojemnosc)
        {
            System.out.println("przeleje sie");
            return;
        }
        else
        {
            this.ilelitrow +=ilosc;
        }

    }

    void wylej (double ilosc){
        if (ilosc > this.getIlelitrow()){
            System.out.println("nie mozna wylac wiecej niz jest");
            return;
        }
        else {
            this.ilelitrow -=ilosc;
        }
    }
    void przelej (double ilosc, Butelka gdzie){
        this.wylej(ilosc);
        gdzie.wlej(ilosc);

    }



    public static void main (String[] args){
        final int rozmiar =50;
        Butelka[] butelka = new Butelka[rozmiar];
        for (int i =0;i<rozmiar;i++){
            butelka[i] = new Butelka((i+1)*Math.sin((i+1)/50.0));
            if (i>20&&i<45){
                butelka[i].przelej(Math.sin((i+1)/50.0),butelka[11]);
            }
        }
        for (int i =0;i<rozmiar;i++) {
            System.out.println(butelka[i].getIlelitrow());
        }
    }
}
