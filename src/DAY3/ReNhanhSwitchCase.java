/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ReNhanhSwitchCase {
    public static void main(String[] args) {
        System.out.println("====MENU=====");
        System.out.println("1. Tính tổng");
        System.out.println("2. Điếm số lẻ");
        System.out.println("3. Tính trung bình cộng các số chẵn");
        System.out.println("Nhập chương trình cần chạy:");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                // Tính tổng từ 1 đến số nhập vào
                tinhTong();
                break;
            case 2:
                // đếm số lẻ tư 1 đến số nhập vào
                demSo();
                break;
            case 3:
                // tính tbc các số chẵn từ 1 đến số nhập vào
                tbCong();
                break;
            default:
                System.out.println("Nhập sai!");
        }
    }
    
    // Tính tổng 
    public static void tinhTong() {
        int so = 10;
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            tong = tong + i;
            // tong += i
        }
        System.out.println("Tổng từ 1 đến 10 là:" + tong);
    }
    // Đếm số lẻ
    public static void demSo() {}
    // Tính tbc
    public static void tbCong() {}
    
}
