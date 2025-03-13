package new_abstract;
import java.util.Scanner;
public class hinhvuong extends hinhchunhat{
Scanner scan=new Scanner(System.in);
    public hinhvuong(float pi, float dientich, String ten, float chuvi, float thetich, Float dai, Float rong) {
        super(pi, dientich, ten, chuvi, thetich, dai, rong);
    }
    public float nhapcanh(){
        System.out.println("nhap vao canh");
        dai=rong;
        float dai= scan.nextFloat();
        return dai;
    }
}
