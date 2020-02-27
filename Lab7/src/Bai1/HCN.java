package Bai1;

public class HCN{
    private double cd;
    private double cr;

    public HCN(double cd, double cr){
        this.cd = cd;
        this.cr = cr;
    }

    public HCN(double canh){
        this.cd = canh;
        this.cr = canh;
    }
    public double getChuVi(){
        return (this.cd + this.cr)*2;
    }
    public double getDienTich(){
        return this.cd * this.cr;
    }

    public void XuatThongTin(){
        System.out.println("chu vi: "+getChuVi()+", dien tich: " + getDienTich());
    }
}