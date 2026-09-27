package game ;

public class Banque {
    private int sold ;
    

    Banque(){
        sold = 0 ;
    }

    public void addSold(int add){
        sold += add ;
    }
    public int getSold(){
        return sold ;
    }
}