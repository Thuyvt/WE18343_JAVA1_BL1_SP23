/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Student {
    private String name;
    private String account;
    private String email;
    private int age;
    private float number;
    
    //Gan gia tri cho thuoc tinh = setter
    public void setName(String name) {
        this.name = name;
    }
    // Lay gia tri 
    public String getName() {
        return this.name;
    }
    
    public void setNumber(float number) {
        if (number < 0 || number > 10) {
            System.out.println("Diem khong hop le");
        } else {
            this.number = number;
        }
    }
    
    public float getNumber() {
        return this.number;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Hàm nhập thông tin sinh viên
    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        // C1
        String name = sc.nextLine();
        this.setName(name);
        // C2
//        this.setName(sc.nextLine());
        System.out.print("Nhập điểm:");
        float number = sc.nextFloat();
        this.setNumber(number);
    }
    // Hàm hiển thị thông tin
    public void display() {
        System.out.printf("Tên sv %s - điểm sv %f", this.getName(), this.getNumber());
    }
    
    void hello() {
        System.out.println("Hello everyone!!!");
    }
    
}
