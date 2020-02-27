package Bai3_4;

import Bai2.SinhVienPoly;

public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    
    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss){
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return this.diem = (2 * diemJava + diemHtml + diemCss) / 4;
    }

    @Override
    public void getThongTin(){
        super.getThongTin();
        System.out.println("Diem java: "+diemJava);
        System.out.println("Diem html: "+diemHtml);
        System.out.println("Diem css: "+diemCss);
    }
}