/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

/**
 *
 * @author ThuyVT
 */
public class Day8 {
    public static void main(String[] args) {
//        Student sv1 = new Student();
//        sv1.name = "Thuy";
//        System.out.println("Tên sinh viên:" + sv1.name);
//        System.out.println("Mã sinh viên:" + sv1.account);
//        
//        Student sv2 = new Student();
//        sv2.name = "Luong";
//        sv2.account = "luongnv8";
//        sv2.number = 20.5F;
//        System.out.println("Tên sv2: " + sv2.name);
//        System.out.println("Mã sv2:" + sv2.account);
//        System.out.println("Điểm sv2:" + sv2.number);

          Student sv1 = new Student();
          sv1.setName("Thuy");
          sv1.setNumber(10);
          
          Student sv2 = new Student();
          sv2.setName("Luong");
          sv2.setNumber(9);
          
          System.out.println("Tên sinh vien 1: " + sv1.getName());
          System.out.println("Điểm sinh viên 1: " + sv1.getNumber());
          System.out.println("Tên sinh vien 2: " + sv2.getName());
          System.out.println("Điểm sinh viên 2: " + sv2.getNumber());
          
          Student sv3 = new Student();
          sv3.hello();
          sv3.insert();
          sv3.display();
    }
}
