/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY11;

import DAY10.DienThoai;
import java.util.ArrayList;

/**
 *
 * @author ThuyVT
 */
public class Day11 {
    public static void main(String[] args) {
        // Array khong khai bao kieu
        ArrayList honHop = new ArrayList();
        // them phan tu lan luot vao cuoi arr
        honHop.add(1);// index = 0
        honHop.add(7.5);// index = 1
        honHop.add("Thuy"); // index = 2
        honHop.add(true);// index = 3       
        // Hien thi arr
        System.out.println(honHop.toString());
        // Them phan tu theo index chi dinh
        honHop.add(4, "vt66");
        honHop.add(1, 9.5);
         // Hien thi arr
        System.out.println(honHop.toString());
        // Thay the gia tri cua phan tu da ton tai
        honHop.set(1, false);
        System.out.println(honHop.toString());
        // Xoa phan tu trong mang
        // Xoa = index
        honHop.remove(1);
        System.out.println(honHop.toString());
        // Xoa = gia tri
        honHop.remove("vt66");
        System.out.println(honHop.toString());
        // Luu y voi index khong ton tai trong mang, khi xoa se gap loi
        honHop.remove(5);
        System.out.println(honHop.toString());
        
        // Kieu 2: ArrayList co dinh dang kieu du lieu
        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("abc");
        arrString.add("xyz");
        // Khong the them 1 vao arrString vi 1 la int
//        arrString.add(1);
        // Hien thi gia tri cua mang co dinh dang
        // C1: dung toString()
        System.out.println(arrString.toString());
        // C2: duyet tung phan tu cua mang = vong lap for
        // arrString.size(): lay ra kich thuoc cua arr
        // arrString.get(index): Lay gia tri phan tu trong arr
        for (int i = 0; i < arrString.size(); i++) {
            String st = arrString.get(i);
            System.out.printf("Phan tu thu %d la %s", (i+1), st);
        }
        for (String item : arrString) {
            System.out.println(item);
        }
        
        // Tao array chua doi tuong dien thoai
        ArrayList<DienThoai> arrDt = new ArrayList<>();
        DienThoai dt1 = new DienThoai("1","a", "bc", 89);
        arrDt.add(dt1);
        
    }
}
