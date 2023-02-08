/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY11;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLDT service = new QLDT();
        int chuongTrinh;
        do {
            System.out.println("===========MENU==========");
            System.out.println("1. Hỏi nhập bao nhiêu đối tượng\n" +"Nhập 1 danh sách đối tượng");
            System.out.println("2. Xuất danh sách đối tượng");
            System.out.println("3. Hiển thị thông tin đối tượng có mức giá cao nhất");
            System.out.println("0. Thoát");
            System.out.println("Nhap chuong trinh can chay");
            chuongTrinh = sc.nextInt();
            switch(chuongTrinh) {
                case 1 -> {
                    service.bai1();
                    break;
                }
                case 2 -> {
                    service.bai2();
                    break;
                }
                case 3 -> {
                    service.bai3();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Nhap sai yeu cau nhap lai");
                }
                
            }
        } while (chuongTrinh != 0);
        ///
//        System.exit(0);
    }
}
