package Test;
public class Butelka{

    private double ilelitrow;
    Butelka(double ilelitrow){
        this.ilelitrow = ilelitrow;
    }
    double getIlelitrow(){
        return this.ilelitrow;
    }
    void wlej (double ilosc){
        this.ilelitrow +=ilosc;
    }
    void wylej (double ilosc){
        this.ilelitrow -=ilosc;
    }
    void przelej (double ilosc, Butelka gdzie){
        gdzie.wlej(ilosc);
        this.wylej(ilosc);
    }



    public static void main (String[] args){
        final int rozmiar =50;
        Butelka[] butelka = new Butelka[rozmiar];
        for (int i =0;i<rozmiar;i++){
            butelka[i] = new Butelka((i+1)*Math.sin((i+1)/50.0));
        }
        for (int i =0; i<rozmiar;i++) {
            System.out.println(butelka[i].getIlelitrow());
        }
    }
}
