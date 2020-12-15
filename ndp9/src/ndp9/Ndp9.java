package ndp9;

import java.util.ArrayList;

public class Ndp9 {

    public class Tahta{
       DenizTasit[][]tahta=new DenizTasit[10][10];
       public Tahta(){}
       
       public void yerlestir(DenizTasit d,int x, int y){
           this.tahta[x][y]=d;
       }
       
       public boolean doluMu(int x,int y){return(tahta[x][y]!=null)?true:false;}
       
       public void yerlestirRastgele(DenizTasit d){
           tahta[(int)(Math.random()*10)][(int)(Math.random()*10)]=d;
       }
       
       public boolean Vur(Oyuncu o,int x,int y){
           if (doluMu(x,y))o.puan+=tahta[x][y].puan; {
               tahta[x][y]=null;
           }
           return false;
       }
       
       public class Oyuncu{
           ArrayList<DenizTasit> donanma=new ArrayList();
           int puan;
           public Oyuncu(int a){
           puan=0;
               for (int x = 0; x < a; x++) {
                   donanma.add(new ucakGemisi());
               }
           }
       }
    }
   
    
    public class DenizTasit{    
        int beygirGucu;
        int agirlik;
        int boy;
        int puan;
        
        public DenizTasit(int b,int a){
            this.beygirGucu=b;
            this.agirlik=a;
        }        
    }
    public class Kayik extends DenizTasit{    
        int kurekSayisi;
        
        public Kayik(int bey, int ag, int ks){
            super(ag,bey);
            this.kurekSayisi=ks;           
        }        
    }
    
    public class ucakGemisi extends DenizTasit{
        int ucakSayisi;
        
        public ucakGemisi(){
            super(0,0);
        }
    }
    
    public static void main(String[] args) {
       
    }
    
}
