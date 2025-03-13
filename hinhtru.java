package new_abstract;
import java.util.Scanner;
public class hinhtru extends hinhtron{
    public float chieucao;
    Scanner scan=new Scanner(System.in);
    public hinhtru(float pi, float dientich, String ten, float chuvi, float thetich, float bk, float chieucao) {
        super(pi, dientich, ten, chuvi, thetich, bk);
        this.chieucao = chieucao;
    }

    public void nhapchieucao(){
        System.out.println("nhap chieu cao");
        Float chieucao=scan.nextFloat();
    }
    public float getChieucao() {
        return chieucao;
    }

    @Override
    public void xuatten() {
        System.out.println("day la hinh tru");
    }

    @Override
    public Float tinhchuvi() {
        return 2*pi*bk*chieucao;
    }

    @Override
    public Float tinhthetich() {
        return pi*bk*bk*chieucao;
    }

    @Override
    public Float tinhdientich() {
        return 2*pi*bk*chieucao;
    }



}
