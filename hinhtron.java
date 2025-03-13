package new_abstract;
import java.util.Scanner;
public class hinhtron extends hinhhoc{
    public float bk;
    Scanner scan=new Scanner(System.in);
    public hinhtron(float pi, float dientich, String ten, float chuvi, float thetich, float bk) {
        super(pi, dientich, ten, chuvi, thetich);
        this.bk = bk;
    }
   public float bk(){
       System.out.println("nhap ban kinh");
        bk= scan.nextFloat();
        return bk;
   }
    @Override
    public void xuatten(){
        System.out.println("day la hinh tron");
    }

    public Float tinhchuvi(){
        return 2*pi*bk;
    }


    public Float tinhdientich() {
        return pi*bk*bk;
    }
    public Float tinhthetich(){
        return 0f;
    }
}
