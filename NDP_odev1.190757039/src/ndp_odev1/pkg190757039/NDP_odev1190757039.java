package ndp_odev1.pkg190757039;


public class NDP_odev1190757039 {
    public static class Insan{
        //Ozellikler
        private String ad;
        private int yas;
        private int para;
        
        //Yapılandirici metod, constructor.
        public Insan(){           
        ad="isimsiz";
        yas=0;
        para=0;        
    }
        public void adinBuOlsun(String x){this.ad=x;}//Nesnelerin adini degistirdigimiz metod.
        public String adiniSoyle(){return ad;}//Nesnenin degisen adini soylemesini sagladigimiz metod.
        public void paraKazan(int p){this.para=p;}//Nesneye para kazandirdigimiz metod.
        public void paraHarca(int pk){this.para=para-pk;
        boolean b1=true;
        boolean b2=false;
            if (pk>=para) {
                b1=false;
                System.out.println("Para yetersiz, işlem yapılamıyor.");               
            }
            else{
                b2=true;
            System.out.println("Para yeterli, işlem yapılıyor.");
            }
        }//Nesneye verdiğimiz parayı harcattığımız metod.
        
        public int paraniSoyle() {return para;}//Parayı verip veremediğimi kontrol etmek için oluşturduğum metod.
        public void birYasBuyu(int y){this.yas=y+1;}//Nesneyi bir yaş büyüten metod.
        public int yasiniSoyle(){return yas;}//Nesnenin yaşının büyüyüp büyümediğini kontrol ettiğim metod.
        
        
    }
    
    

    
    public static void main(String[] args) {
        Insan cocuk1=new Insan();//Cocuk 1 nesnesi.
        Insan cocuk2=new Insan();//Cocuk 2 nesnesi.
        cocuk1.adinBuOlsun("Emre"); //1. Cocugun adini degistirdigimiz komut.
        cocuk2.adinBuOlsun("Mehmet");//2. Cocugun adini degistirdigimiz komut.
        cocuk1.paraKazan(100);//cocuk1 isimli nesneye para eklediğimiz komut.
        cocuk2.paraKazan(350);//cocuk2 isimli nesneye para eklediğimiz komut.
        
        cocuk1.paraHarca(49);//cocuk1 nesnesine sahip olduğundan fazla para harcatıp hatayı aldığım satır.
        
        cocuk1.birYasBuyu(0);//Yası bir arttıran metod.
        
        System.out.println("Yaşı="+cocuk1.yasiniSoyle());//Kontrol amaçlı yazdığım metodu çalıştırdığım satır-1.
        System.out.println("1. Cocugun Parası= "+cocuk1.paraniSoyle());//Kontrol amaçlı yazdığım metodu çalıştırdığım satır-2.
        System.out.println("2. Cocugun Parası= "+cocuk2.paraniSoyle());//Kontrol amaçlı yazdığım metodu çalıştırdığım satır-3.
        System.out.println("1. Cocugun Adi = "+cocuk1.adiniSoyle());//1. Cocugun adini ekrana bastirdigimiz komut.
        System.out.println("2. Cocugun Adi = "+cocuk2.adiniSoyle());//2. Cocugun adini ekrana bastirdigimiz komut.
    }
    
}
