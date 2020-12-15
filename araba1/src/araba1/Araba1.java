package araba1;

public class Araba1 {

   //İnsan varlığının sınıfı.
   public static class Insan{
   
       String isim;
       Araba araba;
       
       //parametresiz yapılandırıcı.
       public Insan(){
         isim="isimsiz";
         araba=null;
       }
       
       //parametreli yapılandırıcı.
       public Insan(String isim){
       this.isim=isim;    
       this.araba=null;
       }
       
       public String adinNe(){return this.isim;}//Varliga adini sordugumuz metod.
       public void adinBuOlsun(String isim){this.isim=isim;}//Varliga isim verdigimiz metod.
       public Araba arabanNe(){return this.araba;}//Varliga arabasini sordugumuz metod.
       public void arabaAl(Araba arac){
           this.araba=arac;
           arac.sahipDegis(this);
       }//Varliga üretilen arabayi aldirdigimiz metod.
       public boolean arabanVarmi(){return((this.araba!=null)?true:false);}//Arabasi olup olmadigini sorguladigimiz metod. 
       public void soyle(String s){System.out.println(s);}//String tipinde iç içe metod kullanmak icin olusturdugumuz soyle metodu.
       public void soyle(boolean b){System.out.println((b)?"olumlu":"olumsuz");}//booelan tipinde iç içe metod kullanmak icin olusturdugumuz soyle metodu.
       public void arabaniSat(Insan kime){  
           if (arabanVarmi()){
           kime.arabaAl(araba);
           this.araba=null;}          
       }//Varliktan varliga arabayi aktarmak icin urettigimiz metod.
       
   }
   
   //Araba varlığının sınıfı.
   public static class Araba{
       String plaka;
       Insan sahip;
       public Araba(String plk){this.plaka=plk;}       
       public String plakanNe(){return this.plaka;}
       public void plakaDegis(String plaka){this.plaka=plaka;}
       public void sahipDegis(Insan ins){this.sahip=ins;}
       public Insan sahibinKim(){return this.sahip;}
       public void vergiOde(){this.sahip.isim="asdasd";}
       
       

   }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Insan yek=new Insan("Yekta");
        Insan ahm=new Insan("Ahmet");
        Araba subaru=new Araba("34 YKT 38");
        yek.arabaAl(subaru);
        ahm.soyle(ahm.adinNe());
        yek.soyle(yek.adinNe());
        yek.soyle(yek.arabanVarmi());
        ahm.soyle(ahm.arabanVarmi());
        yek.soyle(yek.arabanNe().plakanNe());
        yek.arabaniSat(ahm);
        ahm.soyle(ahm.arabanVarmi());
        yek.soyle(yek.arabanVarmi());
        
        ahm.soyle(subaru.sahibinKim().adinNe());
        subaru.vergiOde();
         ahm.soyle(subaru.sahibinKim().adinNe());
        
                
    }
    
}
