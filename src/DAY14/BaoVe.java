/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

/**
 *
 * @author ThuyVT
 */
public class BaoVe extends NhanVien {
    private int ca;

    public BaoVe() {
    }

    public BaoVe(int ca, String ten, String ma, int luong) {
        super(ten, ma, luong);
        // lien ket toi contructor cua class cha 
        this.ca = ca;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }
    
    @Override
    public int tinhLuong() {
        return super.tinhLuong() / 2;
    }
    
}
