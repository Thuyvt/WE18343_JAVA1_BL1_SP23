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
public class BTVN {
    public static void main(String[] args) {
        // Khai báo biến
        String ten, phuong, duong, thanhPho;
        int soNha;
        // Nhập dữ liệu cho biến
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên:");
        ten = sc.nextLine();
//        System.out.println("Nhập số nhà:");
//        soNha = sc.nextInt();
//        //C1:  Xóa giá trị trong bộ nhớ đệm
//        sc.nextLine();
        //C2: Chuyển đổi kiểu dữ liệu
        System.out.println("Nhập số nhà:");
        try {
            soNha = Integer.parseInt(sc.nextLine());
        } catch (Exception ex) {
            System.out.println("Sai định dạng số nhà");
            soNha = 12;
        }
        
        System.out.println("Nhập tên phường:");
        phuong = sc.nextLine();
        System.out.println("Nhập tên đường:");
        duong = sc.nextLine();
        System.out.println("Nhập tên thành phố:");
        thanhPho = sc.nextLine();
        System.out.printf("Tên tôi là %s, địa chỉ của tôi là : %d, %s, %s, %s", ten, soNha, duong, phuong, thanhPho);
    }
}
