package new_abstract;
import java.util.Scanner;
public abstract class person {
    private String ten,diachi;

    public person(String ten, String diachi) {
        this.ten = ten;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public abstract void display();
    



}
