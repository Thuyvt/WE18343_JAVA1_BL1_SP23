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
public class ReNhanhIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình:");
        try {
            double diemTB = sc.nextDouble();
            // C1:
            if (diemTB > 50 && diemTB < 80) {
                System.out.println("Loại trung bình");
            } else if (diemTB >= 80) {
                System.out.println("Loại khá");
            } else if (diemTB >= 90 && diemTB <= 100){
                System.out.println("Loại giỏi");
            }
            // C2:
            if (diemTB >= 90) {
            
            } else if (diemTB >= 80) {
            
            } else if (diemTB >= 50) {
            
            }
        } catch (Exception ex) {
            System.out.println("Nhập sai định dạng");
        }
    }
    
}
