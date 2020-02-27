package Bai3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Bai2.SinhVienPoly;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVienPoly> ds = new ArrayList<SinhVienPoly>();

        int opt = 0;
        do{
            opt = ShowMenu(sc);

            switch(opt){
                case 1: ThemDanhSach(sc, ds);
                        break;
                case 2: XuatDanhSach(ds);
                        break;
                case 3: XuatDanhSachSVGioi(ds);
                        break;
                case 4: SapXepDanhSach(ds);
                        break;
                default: break;
            }
        }while(opt != 5);
    }

    public static int ShowMenu(Scanner sc){
        System.out.println("------Menu------");
        System.out.println("1.Nhap danh sach sinh vien");
        System.out.println("2.Xuat danh sach sinh vien");
        System.out.println("3.Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4.Sap xep danh sach sinh vien theo diem");
        System.out.println("----------------");
        System.out.print("Choose: ");

        return Integer.parseInt(sc.nextLine());
    }

    public static void ThemDanhSach(Scanner sc, ArrayList<SinhVienPoly> ds){
        while(true){
            System.out.print("Nhap ho ten sinh vien: ");
            String hoTen = sc.nextLine();
            System.out.println("Nganh hoc?");
            System.out.println(">>>1.IT");
            System.out.println(">>>2.Biz");
            System.out.print(">>..");
            int nganhHoc = Integer.parseInt(sc.nextLine());

            if(nganhHoc == 1){
                System.out.print("Nhap diem java: ");
                double diemJava = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem html: ");
                double diemHtml = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem css: ");
                double diemCss = Double.parseDouble(sc.nextLine());

                ds.add(new SinhVienIT(hoTen, "IT", diemJava, diemHtml, diemCss));
            }
            else if(nganhHoc == 2){
                System.out.print("Nhap diem marketing: ");
                double diemMarketing = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem sales: ");
                double diemSale = Double.parseDouble(sc.nextLine());

                ds.add(new SinhVienBiz(hoTen, "Biz", diemMarketing, diemSale));
            }
            else System.out.println("Loi");

            System.out.print("Nhap them Y/N? ");
            if(sc.nextLine().equals("N")){
                break;
            }
        }
    }

    public static void XuatDanhSach(ArrayList<SinhVienPoly> ds){
        System.out.println("------Xuat danh sach------");
        for(int i = 0; i < ds.size(); i++){
            ds.get(i).getThongTin();
            System.out.println("Diem: "+ds.get(i).getDiem());
            System.out.println("Hoc luc: "+ds.get(i).getHocLuc());
            System.out.println("---------------");
        }
    }

    public static void XuatDanhSachSVGioi(ArrayList<SinhVienPoly> ds){
        System.out.println("------Xuat danh sach sinh vien gioi-------");
        for(int i = 0; i < ds.size(); i++){
            if(ds.get(i).getHocLuc().equals("Gioi")){
                ds.get(i).getThongTin();
                System.out.println("Hoc luc: "+ds.get(i).getHocLuc());
            }
            System.out.println("----------");
        }
    }

    public static void SapXepDanhSach(ArrayList<SinhVienPoly> ds){
        System.out.println("------Sap xep danh sach------");
        Collections.sort(ds, (sv1, sv2) -> {
            return sv1.getDiem() > sv2.getDiem() ? -1 : 1;
        });
        XuatDanhSach(ds);
    }
}