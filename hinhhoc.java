package new_abstract;

public abstract class hinhhoc {
    public float pi=3.34f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public hinhhoc(float pi, float dientich, String ten, float chuvi, float thetich) {
        this.pi = pi;
        this.dientich = dientich;
        this.ten = ten;
        this.chuvi = chuvi;
        this.thetich = thetich;
    }
    public abstract void xuatten();
    public abstract Float tinhchuvi();
    public abstract Float tinhdientich();
    public abstract Float tinhthetich();

}
