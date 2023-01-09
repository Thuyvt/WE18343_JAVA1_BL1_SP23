/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

/**
 *
 * @author ThuyVT
 */
public class ChuyenDoi {
    public static void main(String[] args) {
        String diemTin = "9.5";
        String diemC = "8.5";
        System.out.println(diemTin + diemC);
        double diemT = Double.parseDouble(diemTin);
        double diemNM = Double.parseDouble(diemC);
        double diemTB = (diemT + diemNM) /2;
        System.out.printf("Điểm trung bình là %.2f \n", diemTB);
        System.out.println("Điểm trung bình là " + ((diemT + diemNM) /2));
        String diemJavaS = "8.6L";
        try {
            float diemJava = Float.parseFloat(diemJavaS);
            System.out.println("Điểm môn java là:" + diemJava);
        } catch (Exception ex) {
            System.out.println("Bạn nhập điểm java không đúng định dạng");
            System.out.println(ex.getMessage());
        }
        System.out.println("Chương trình thành công");
    }
}
