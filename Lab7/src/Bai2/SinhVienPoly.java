package Bai2;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    protected double diem;

    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();

    public String getHocLuc(){
        double diem = this.getDiem();
        String hocLuc = "";

        if(diem >= 9){
            hocLuc = "Xuat Sac";
        }
        else if(diem >= 7.5){
            hocLuc = "Gioi";
        }
        else if(diem >= 6.5){
            hocLuc = "Kha";
        }
        else if(diem >= 5){
            hocLuc = "Trung binh";
        }
        else{
            hocLuc = "Yeu";
        }

        return hocLuc;
    }

    public void getThongTin(){
        System.out.println("Ho ten: "+this.hoTen);
        System.out.println("Nganh hoc: "+this.nganh);
    }
}