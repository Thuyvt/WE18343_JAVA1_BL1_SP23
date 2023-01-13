/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY4;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class LAB1_2 {
    public static Scanner sc = new Scanner(System.in);
    // Main
    public static void main(String[] args) {
       int chuongTrinh;
       while(true) {
           System.out.println("===MENU====");
           System.out.println("1. Kiểm tra số");
           System.out.println("2. Tính tổng");
           System.out.println("3. Số chính phương");
           System.out.println("4. Toán tử");
           System.out.println("Nhập vào chương trình cần chạy");
           chuongTrinh = sc.nextInt();
           switch(chuongTrinh) {
               case 1 -> {
                   kiemTraSo();
                   break;
               }
               case 2 -> {
                   tinhTong();
                   break;
               }
               case 3 -> {
                   soChinhPhuong();
                   break;
               }
               case 4 -> {
                   toanTu();
                   break;
               }
               case 0 -> {
                   
               }
               default -> {
                   System.out.println("Nhập sai yêu cầu nhập lại");
               }
           }
       }
    }
    // Kiểm tra số
    public static void kiemTraSo() {
        System.out.println("Nhập số");
        int so = sc.nextInt();
        // Kiểm tra số lẻ
        if (so%2==1) {
            System.out.println("Đây là số lẻ");
        } else {
            System.out.println("Đây là số chẵn");
        }
        // Kiểm tra số chia hết cho 3
        if(so%3==0) {
            System.out.println("đây là số chia hết cho 3");
        } else {
            System.out.println("Đây là số không chia hết cho 3");
        }
        
        // C2
        if (so%2==1 && so%3!=0) {
            System.out.println("Đây là số lẻ và không chia hết cho 3");
        } else if (so%2==1 && so%3==0) {
            System.out.println("Đây là số lẻ và có chia hết cho 3");
        } 
        
    }
    // Tính tổng
    public static void tinhTong() {
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        if (so>=0) {
            System.out.println("Nhập dữ liệu sai");
        } else {
            System.out.println("Đây là số âm");
            int tong = 0;
            for (int i = so; i <= 0 ; i++) {
                tong = tong + i;
                // tong += i;
            }
            System.out.printf("Tổng từ %d đến 0 là %d\n", so, tong);
            tong = 0;
            for (int i = 0; i >= so; i--) {
                tong = tong + i;
            }
            System.out.printf("Tổng từ %d đến 0 là %d\n", so, tong);

        }
    }
    // Số chính phương
    public static void soChinhPhuong() {
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        for (int i = 2; i < so; i++) {
            if(i*i==so) {
                System.out.println("Đây là số chính phương");
            }
        }
        
        int can2 = (int) Math.sqrt(so);
        if (Math.pow(can2,2) == so) {
            System.out.println("Đây là số chính phương");
        } else {
            System.out.println("Đây không phải là số chính phương");
        }
    }
    // Toán tử
    public static void toanTu() {
        System.out.println("Nhập số a:");
        int a = sc.nextInt();
        System.out.println("Nhập số b:");
        int b = sc.nextInt();
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        float chia = (float) a/b;
        System.out.printf("a / b = " + chia);
    }
}

