package new_abstract;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc{
    public Float dai,rong;
    Scanner scan=new Scanner(System.in);
    public hinhchunhat(float pi, float dientich, String ten, float chuvi, float thetich, Float dai, Float rong) {
        super(pi, dientich, ten, chuvi, thetich);
        this.dai = dai;
        this.rong = rong;
    }
public float nhapchieudai(){
    System.out.println("nhap chieu dai");
     dai=scan.nextFloat();
     return dai;
    }
public float nhapchieurong(){
    System.out.println("nhap chieu rong");
     rong=scan.nextFloat();
    return rong;
}

    @Override
    public void xuatten() {
        System.out.println("day la hinh chu nhat");
    }

    @Override
    public Float tinhchuvi() {
        return (dai+rong)*2;
    }

    @Override
    public Float tinhdientich() {
        return (dai*rong);
    }

    @Override
    public Float tinhthetich() {
        return 0f;
    }
}
