/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY16;

/**
 *
 * @author ThuyVT
 */
public class TraSua extends MonAn {
    private String topping;

    public TraSua() {
    }

    public TraSua(String topping, String ten, int gia, int soLuong) {
        super(ten, gia, soLuong);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "TraSua{" + super.toString() + "topping=" + topping + '}';
    }
    
    
}
