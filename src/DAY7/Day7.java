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
public class Day7 {
    public static void main(String[] args) {
        int mangSo[] = new int[5];
        Scanner sc = new Scanner(System.in);
        // Nhập giá trị cho mảng
        for(int index = 0; index < mangSo.length; index++) {
            System.out.printf("Nhap phan tu tu %d:", (index+1));
            mangSo[index] = sc.nextInt();
        }
        // Hiển thị giá trị của mảng
        System.out.println("Phan tu mang: " + Arrays.toString(mangSo));
        
        // Sắp xếp tăng
        Arrays.sort(mangSo);
        
        // Hiển thị lại giá trị của mảng sau khi sắp xếp
        System.out.println("Phan tu sau khi sap xep: "+ Arrays.toString(mangSo));
        
        // Tìm giá trị nhỏ nhất trong mảng
        int min = mangSo[0];
        for (int i = 1; i < mangSo.length; i++) {
            // C1
            if(min > mangSo[i]) {
                min = mangSo[i];
            }
            // C2
            min = Math.min(min, mangSo[i]);
        }
        System.out.printf("So nho nhat trong mang la %d\n", min);
        // Tính tổng các số chia hết cho 3
        int sum = 0, count = 0;
        for (int i = 0; i < mangSo.length; i++) {
            if (mangSo[i] % 3 == 0) {
                sum+= mangSo[i];
                count++;
            }
        }
        float avg = (float) sum / count;
        System.out.println("Gia tri trung binh: " + avg);
    }
    
}
