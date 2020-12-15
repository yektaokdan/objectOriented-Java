
package araba2;

import java.util.ArrayList;


public class Araba2 {
    //Özelikler
    public static class Araba{
    String plaka="Geçici";
    String renk="Beyaz";
    int km=0;
    String marka="Volvo";
    String model="2020";
    int fiyat=0;
    
    //overloading bir metodun farklı formlarda yeniden uyarlanması.
    //Yapılandırıcılar.
    public Araba(){}
    public Araba(String plk){this.plaka=plk;}
    public Araba(String p, int f){this.plaka=p; this.fiyat=f;}
    public void plakaDegis(String p){this.plaka=p;}

    
    //Standart getter/setterlar.
    //Varlığa sağ tıklanıp Insert Code dedikten sonra istediğimiz getter-setter vb. işlemleri otomatik yapar.
        public void plkBuOlsun(String plaka) {
            this.plaka = plaka;
        }

        public void renginBuOlsun(String renk) {
            this.renk = renk;
        }

        public void kmBuOlsun(int km) {
            this.km = km;
        }

        public void markanBuOlsun(String marka) {
            this.marka = marka;
        }

        public void modelinBuOlsun(String model) {
            this.model = model;
        }
        public void fiyatinBuOlsun(int fiyat) {
            this.fiyat = fiyat;
        }
        public String plakanNe() {
            return plaka;
        }
        public String renginNe() {
            return renk;
        }
        public int kmDegerinNe() {
            return km;
        }
        public String markanNe() {
            return marka;
        }
        public String modelinNe() {
            return model;
        }
        public int fiyatinNe() {
            return fiyat;
        }           
        public void soyle(String x){System.out.println(x);}
        public void soyle(int x){System.out.println(x);}
        public void soyle(boolean x){System.out.println(x);}    
    }
    
    public static class Insan{
     int para;
     int yas;
     Araba tasit;
     int vergi=5000;
     int servisUcret=7500;
            
        public int neKadarParanVar() {
            return para;
        }
        public void paranBuOlsun(int para) {
            this.para = para;
        }
        public int yasinKac() {
            return yas;
        }
        public void yasinBuOlsun(int yas) {
            this.yas = yas;
        }
        public Araba arabanNe() {
            return tasit;
        }
        public void arabanBuOlsun(Araba tasit) {
            this.tasit = tasit;
        }
        public Insan(int para, int yas) {
            this.para = para;
            this.yas = yas;
        }
        public void soyle(String x){System.out.println(x);}
        public void soyle(int x){System.out.println(x);}
        public void soyle(Araba x){System.out.println(x);}
        public void arabaSat(Insan i,Araba a){ 
            if (i.para<a.fiyat) {
                System.out.println("Para yetersiz");
            }
            else{
                i.arabanBuOlsun(a);
                i.para=i.para-a.fiyat;
                this.para+=a.fiyat;
            }            
        }
        public void arabaAl(Insan i,Araba a){
            if (this.para<a.fiyat) {
                System.out.println("Para yetersiz");
            }
            else{           
                this.tasit.plaka=null;
                i.para=i.para+a.fiyat;
                this.para-=a.fiyat;
            }    
        }
        
        public void vergiOde(){this.para=para-vergi;}
        public void serviseGit(){this.para=para-servisUcret;}
        public void pert(Araba a){
            if (this.para<a.fiyat) {
                System.out.println("Pert için yeterli paranız yok");
            }
            else{
            this.para=para-a.fiyat;}
        }
        public void neKadarParanVar2(){
            System.out.println(this.para+" param var");
        }         
    }
    

    public static void main(String[] args) {
        Araba arac1=new Araba("34 ee 234",50000);
        Araba arac2=new Araba("34 KK 666",40000);
        Araba arac3=new Araba("17 GG 356",(int)(Math.random()*100)*1000);
               
       Insan yekta=new Insan(80000,60);
       Insan yusuf=new Insan(90000,50);
       
       arac1.fiyatinBuOlsun(60000); //Araca fiyat belirlediğimiz metod.
       arac2.fiyatinBuOlsun(52500);
             
       yekta.arabanBuOlsun(arac1);
       yusuf.arabanBuOlsun(arac2);
       
       
       
      
        
        
    }
    
}
