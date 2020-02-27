package Bai3_4;

import Bai2.SinhVienPoly;

public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale){
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this. diemSale = diemSale;
    }

    @Override
    public double getDiem(){
        return this.diem = (2 * diemMarketing + diemSale) / 3;
    }

    @Override 
    public void getThongTin(){
        super.getThongTin();
        System.out.println("Diem marketing: "+diemMarketing);
        System.out.println("Diem sales: "+diemSale);
    }
}