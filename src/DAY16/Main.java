/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY16;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        QuanLyMonAn ql = new QuanLyMonAn();
        int ct;
        do {
            System.out.println("====MENU====");
            System.out.println("1.Nhập danh sách món ăn");
            System.out.println("2. Xuất danh sách món ăn");
            System.out.println("3. Xuất tổng tiền phải trả cho tất cả món ăn đã chọn ");
            System.out.println("4. Tìm món ăn có tổng tiền phải trả lớn nhất");
            System.out.println("Nhap chuong trinh can chay:");
            ct = Integer.parseInt(sc.nextLine());
            switch (ct) {
                case 1 -> {
                    ql.bai1();
                    break;
                }
                case 2 -> {
                    ql.bai2();
                    break;
                }
                case 3 -> {
                    ql.bai3();
                    break;
                }
                case 4 -> {
                    ql.bai4();
                    break;
                }
                case 5 -> {
                    ql.bai5();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        } while (ct != 0);
    }
}
