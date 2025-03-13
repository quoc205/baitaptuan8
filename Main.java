package new_abstract;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("bk cua hinh tron : ");
        float bk = scan.nextFloat();


        hinhtron ht = new hinhtron(3.14f, 0f, "Hình tròn", 0f, 0f, bk);

        ht.xuatten();
        System.out.println("chu vi cua hinh tron: " + ht.tinhchuvi());
        System.out.println("dien tich cua hinh tron: " + ht.tinhdientich());
        ht.tinhthetich();


        hinhchunhat hcn = new hinhchunhat(3.14f, 0f, "Hình chữ nhật", 0f, 0f, 0f, 0f);


        hcn.nhapchieudai();
        hcn.nhapchieurong();


        hcn.xuatten();
        System.out.println("chu vi cua hcn: " + hcn.tinhchuvi());
        System.out.println("dien tich cua hcn: " + hcn.tinhdientich());
        hcn.tinhthetich();
        hinhvuong hv = new hinhvuong(3.14f, 0f, "Hình vuông", 0f, 0f, 0f, 0f);


        hv.nhapcanh();


        hv.xuatten();
        System.out.println("Chu vi của hình vuông: " + hv.tinhchuvi());
        System.out.println("Diện tích của hình vuông: " + hv.tinhdientich());
        hv.tinhthetich();  // Thể tích của hình vuông là 0 vì là hình phẳng

        hinhtru htr = new hinhtru(3.14f, 0f, "Hình trụ", 0f, 0f, 0f, 0f);


        ht.bk();
        htr.nhapchieucao();

        // Gọi các phương thức của đối tượng hinhtru
        htr.xuatten();
        System.out.println("Chu vi của hình trụ: " + ht.tinhchuvi());
        System.out.println("Diện tích của hình trụ: " + ht.tinhdientich());
        System.out.println("Thể tích của hình trụ: " + ht.tinhthetich());


    }




}