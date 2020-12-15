package pazaruyg;

import java.util.ArrayList;

public class PazarUyg {
    
    public class Besin{
    int fiyat;//Birim fiyat
    int miktar;//Kullanılan miktar
    int kalori;//Birim miktar başına kalori
    int protein;
    int yag;
    
        public static Besin(){
        fiyat=0;
        miktar=1;
        kalori=0;
        protein=0;
        yag=0;  
        }

        public static Besin( int f, int k, int y){
        fiyat=0;
        kalori=0;
        protein=0;
        yag=0;  

        }

        public int getFiyat() {
            return fiyat;
        }

        public void setFiyat(int fiyat) {
            this.fiyat = fiyat;
        }

        public int getMiktar() {
            return miktar;
        }

        public void setMiktar(int miktar) {
            this.miktar = miktar;
        }

        public int getKalori() {
            return kalori;
        }

        public void setKalori(int kalori) {
            this.kalori = kalori;
        }

        public int getProtein() {
            return protein;
        }

        public void setProtein(int protein) {
            this.protein = protein;
        }

        public int getYag() {
            return yag;
        }

        public void setYag(int yag) {
            this.yag = yag;
        }
        
        //Kullanılan miktara göre özellik getterları
        public int mikKalori(){return miktar*getKalori();}
        public int mikProtein(){return miktar*getProtein();}
        public int mikYag(){return miktar*getYag();}
        public int mikFiyat(){return miktar*getFiyat();}
    }
    
    public class Yemek{
     ArrayList<Besin> malzeme = new ArrayList();
     int miktar;
     
     public  Yemek(){
        sifirla();
     }

        public int getMiktar() {return miktar;}
        public void setMiktar(int miktar) {this.miktar = miktar;}
    
        public void sifirla(){
        malzeme.clear();
        miktar=1;
        }
    
        public void malzemeEkle(Besin b, int m){ 
            b.setMiktar(m);
            malzeme.add(b);
        }
        
        public int kacKalori(){
            
        }
    }

    public static void main(String[] args) {
        Besin sarimsak=new Besin(1,2,3,5);
    }
    
}
