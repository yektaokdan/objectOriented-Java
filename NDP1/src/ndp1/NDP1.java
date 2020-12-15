package ndp1;

public class NDP1 {

    public static class Araba{
        
        //Özellikler
        private String vites;
        private int beygirGucu;
        private String renk;
        private String marka;
        private String model;
        private String plaka;
    /*
    .
    .
    .
    
    */
        // yapılandırıcı metod, constructor
        public Araba(){
         vites="Manuel";
         plaka="Geçici Plaka";
         marka="Opel";
         model="Astra";
    }
        
        public Araba(String m,String p, int b){
            this.marka=m;
            this.plaka=p;
            //this.beygirGucu=b;//Basit kullanım.
            this.beygirDegis(b);//Profesyonel kullanım.
        }
        
        public void plakaDegis(String x){this.plaka=x;}//Setter geri dönüş değeri yok.
        public String plakanNe(){return plaka;}//Getter geri dönüş değeri vardır.
        
        public void beygirDegis(int beygirGucu){this.beygirGucu=beygirGucu;}//Setter tipinde beygir gücünü değiştiren metod.
        public int kacBeygir(){return this.beygirGucu;}
   }
    public static void main(String[] args) {
        
        Araba oto1=new Araba();
        Araba oto2=new Araba("Bmw","42RE38",40);//Oluşan ikinic araba metoduna verdiğimiz parametler değerlerini değiştirdiğimiz yer.
        System.out.println(oto2.plakanNe());//2. Araba metodu ile değişen bilgileri ekrana basan komut.
        System.out.println("Plaka= "+oto1.plakanNe()); //İlk verdiğimiz string veri.
        oto1.plakaDegis("34BN2489"); //Plakayı değiştiren metod.
        oto2.beygirDegis(1000);//Beygiri değistirme metodu.
        System.out.println("Beygir = "+oto2.kacBeygir());//Degisen metodu ekrana basar.
        System.out.println("Plaka= "+oto1.plakanNe()); //36. satırda verdiğim değeri verecek.
        
        
    }
    
}
