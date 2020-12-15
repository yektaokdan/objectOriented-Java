package ndp10uyg;

import java.util.ArrayList;


public class Ndp10uyg {

    public static class Kullanici{
        String kulAdi="Tanımsız";
        String Sifre="Tanımsız";
        String rumuz="Tanımsız";
        ArrayList<Kullanici> arkadaslar=new ArrayList();
        ArrayList<metinMesaj> mesajlarim =new ArrayList();
        
        public Kullanici(String r){this.rumuz=r;}
        public void degisKulAd(String s){this.kulAdi=s;}
        public String getirKulAd(){return this.kulAdi;} 
        public void arkadasEkle(Kullanici k){if(!arkadaslar.contains(k))arkadaslar.add(k);}
        public void mesajGonder(Kullanici k, metinMesaj m){
            m.gonderici=this;
            m.alici=k;
            mesajAl(m);
            k.mesajAl(m);
        }
        
        public void mesajAl(metinMesaj m){mesajlarim.add(m);}
        
        public void mesajGoster(){
            System.out.println(this.rumuz+"'ın etkileşimi: ");
        for(metinMesaj m: mesajlarim)
            System.out.println(m.gonderici.rumuz+" gonderdi, "+m.alici.rumuz+" aldi: "+m.yazi);
        }
            
      }
    
        public static class Mesaj{
        Kullanici alici,gonderici;
        String zaman="00:00";
        byte durum=0;//1:iletildi 0:gönderilmedi 4:görüldü 2:zaman aşımına uğradı 3:kayboldu..
        
        public Mesaj(){}//eklenecek
              
        }
        
        public static class metinMesaj extends Mesaj{
            String yazi="";
            
            public metinMesaj(String m){this.yazi=m;}
        }
        
        public static class sesliMesaj extends Mesaj{
            String baglanti="";
            int sure=0;
            
            public sesliMesaj(){} //eklenecek
        }
        
        public static class Grup{
            ArrayList<Kullanici> uyeler = new ArrayList();
            ArrayList<metinMesaj> mesajlar = new ArrayList();
            
            public Grup(){//yeni baştan oluşunca yapılan işlemler\\constructor.
                uyeler.clear();
                mesajlar.clear();
            }
            
        public void uyeEkle(Kullanici k){uyeler.add(k);}
        public void uyeCikar(Kullanici k){uyeler.remove(k);}
        public int kacUye(){return uyeler.size();}
        public int kacMesaj(){return mesajlar.size();}
        public void mesajEkle(metinMesaj m){mesajlar.add(m);}
        }
    
    public static void main(String[] args) {
        
        metinMesaj dogumGunu=new metinMesaj("Nice mutlu yıllara");
        metinMesaj nasilsin=new metinMesaj("Naber bro?");
        metinMesaj uyudunMu=new metinMesaj("Nabız var mı?");
        metinMesaj sorunYok=new metinMesaj("Sıkıntı yok");
        metinMesaj gulus=new metinMesaj("JKSDGHKASJDGHJKASDG");
        
        Kullanici yekta=new Kullanici("ahmed");
        Kullanici yusuf=new Kullanici("yusufCimbom1905");
        Kullanici enes=new Kullanici("maviSu64");
        Kullanici ayşe=new Kullanici("vatanCaddesi");
        yekta.mesajGonder(yusuf, dogumGunu);
        yusuf.mesajGonder(ayşe, uyudunMu);
        enes.mesajGonder(yekta, sorunYok);
        yekta.mesajGonder(enes, nasilsin);
        yusuf.mesajGonder(ayşe,nasilsin);
        
        
        yekta.mesajGoster();
        
    }
    
}
