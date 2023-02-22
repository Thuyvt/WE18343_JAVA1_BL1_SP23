/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyMonAn {

    List<MonAn> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void bai1() {
        int nhapNua = 1;
        do {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap gia:");
            int gia = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap so luong:");
            int soLuong = Integer.parseInt(sc.nextLine());

            MonAn ma = new MonAn(ten, gia, soLuong);
            ds.add(ma);
            System.out.println("Nhap tiep hay khong 1 - co, 0 - dung");
            nhapNua = Integer.parseInt(sc.nextLine());
        } while (nhapNua == 1);
    }

    public void bai2() {
        for (MonAn item : ds) {
            System.out.println(item.toString());
        }
    }

    public void bai3() {
        int tongTien = 0;
        for (MonAn ma : ds) {
            tongTien += ma.tong();
        }
        System.out.println("Tong tien phai tra:" + tongTien);
    }

    public void bai4() {
        // C1:
        MonAn max = ds.get(0);
        for (int i = 1; i < ds.size(); i++) {
            if (max.tong() < ds.get(i).tong()) {
                max = ds.get(i);
            }
        }
        System.out.println("Mon an co tong tien phai tra lon nhat la:" + max.toString());
        // C2
        ds.sort((o1, o2) -> o2.tong() - o1.tong());// sap xep tong tien giam dan
//      // sap xep tang ds.sort((o1, o2) -> o1.tong() - o2.tong());
//        ds.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
        System.out.println("Mon an co tong tien phai tra lon nhat la:" + ds.get(0).toString());
        
    }

    public void bai5() {
        MonAn ts = new TraSua("Tran chau den", "Hong tra sua", 35000, 2);
        System.out.println(ts.toString());
    }
}
