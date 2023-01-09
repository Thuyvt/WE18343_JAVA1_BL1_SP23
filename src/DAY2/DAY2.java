/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY2;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class DAY2 {
    public static void main(String[] args) {
        // Khai báo biến chứa họ tên
        String hoTen = "Vu Thi Thuy";
        int namSinh = 1993;
        String soDienThoai = "0886341201"; 
        double diemTb = 9.5;
        float soFloat = 7.4F;
        System.out.printf("Ten toi la %s, toi sinh nam %d, diem trung bin cua toi la %.3f\n", hoTen, namSinh, diemTb);
        System.out.println("Ten toi la " + hoTen + ", toi sinh nam " + namSinh);
        
        // Nhập họ và tên, tuổi, số đo 3 vòng của người yêu cũ
        String tenNgyC;
        int tuoi;
        double vong1, vong2, vong3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên người yêu cũ: ");
        // nextLine() lấy giá trị 1 dòng dữ liệu nhập vào
        tenNgyC = sc.nextLine();
        System.out.print("Nhập tuổi người yêu cũ: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập vòng 1: ");
        vong1 = sc.nextDouble();
        System.out.print("Nhập vòng 2: ");
        vong2 = sc.nextDouble();
        System.out.print("Nhập vòng 3: ");
        vong3 = sc.nextDouble();
        System.out.printf("Ten nguoi yêu cũ là %s \n", tenNgyC);
        System.out.printf("Tuổi người yêu cũ là %d \n", tuoi);
        System.out.printf("Số do 3 vòng là %f %.2f %.3f\n", vong1, vong2, vong3);
    }   
}
