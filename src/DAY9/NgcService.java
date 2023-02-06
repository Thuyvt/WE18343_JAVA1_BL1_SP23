/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY9;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class NgcService {
    // Tạo đối tượng
    NguoiYeuCu mangNgy[] = new NguoiYeuCu[4];
    Scanner sc = new Scanner(System.in);
    
    public NgcService() {
    }
    
    public void nhap() {
        for (int i = 0; i < mangNgy.length; i++) {
            System.out.println("Nhập vào tên:");
            String name = sc.nextLine();
            System.out.println("Nhập vào tuổi:");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số điện thoại:");
            String sdt = sc.nextLine();
            mangNgy[i] = new NguoiYeuCu(name, tuoi , sdt);
        }
    }
    
    public void tuoiMin() {
        NguoiYeuCu min = mangNgy[0];
        for (int i = 1; i < mangNgy.length; i++) {
            if (mangNgy[i].getTuoi() < min.getTuoi()) {
                min = mangNgy[i];
            }
        }
        // in thông tin
        min.inThongTin();
    }
    
}
