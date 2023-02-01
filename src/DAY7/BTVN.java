/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class BTVN {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien:");
        int soLuong = sc.nextInt();
        
        if (soLuong > 0) {
            String sv[] = new String[soLuong];
            float diemSv[] = new float[soLuong];
            for (int i = 0; i < soLuong; i++) {
                System.out.printf("Nhap ten sinh vien thu %d", i+ 1);
                sv[i] = sc.nextLine();
                System.out.printf("Nhap diem sinh vien thu %d", i+1);
                diemSv[i] = sc.nextFloat();
                sc.nextLine();
            }
            System.out.println("Mang sinh vien: " + Arrays.toString(sv));
            System.out.println("Mang diem: " + Arrays.toString(diemSv));
            // Sap xep mang
            sortSv(sv, diemSv);
            // Hien thi
            for (int i = 0; i < soLuong; i++) {
                System.out.println("Ho ten: " + sv[i]);
                System.out.println("Diem: " + diemSv[i]);
                if (diemSv[i] >= 9) {
                    System.out.println("Hoc luc : Xuat sac");
                } else if ( diemSv[i] >= 7.5){
                    System.out.println("Gioi");
                } else if (diemSv[i] >= 6.5 ) {
                    System.out.println("Kha");
                } else if (diemSv[i] >= 5) {
                    System.out.println("Trung binh");
                }
                System.out.println("===============");
            }
        } else {
            System.out.println("Nhap sai so luong");
        }
    }
    
    // Sap xep 2 mang
    public static void sortSv(String mangTen[], float mangDiem[]) {
        for (int i = 0; i < mangTen.length; i++) {
            for (int j = i + 1; j < mangTen.length; j++) {
                if (mangDiem[i] > mangDiem[j]) {
                    float diem = mangDiem[i];
                    mangDiem[i] = mangDiem[j];
                    mangDiem[j] = diem;
                    
                    String ten = mangTen[i];
                    mangTen[i] = mangTen[j];
                    mangTen[j] = ten;
                }
            }
        }
    }
    
}
