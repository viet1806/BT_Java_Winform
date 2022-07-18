/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_3;

/**
 *
 * @author Toanne
 */
public class CollectMoneyInternet extends CollectMoney{
    int sothang;
    final int dongia=285000;

    public CollectMoneyInternet() {
    }

    public CollectMoneyInternet(int sothang) {
        this.sothang = sothang;
    }

    public int getSothang() {
        return sothang;
    }

    public void setSothang(int sothang) {
        this.sothang = sothang;
    }
    
    @Override
    public double calculateMoney() {
        double thanhtien=0;
        if (sothang<3){
            thanhtien=sothang*dongia;
        }
        else if (sothang>=3 && sothang<6){
            thanhtien=sothang*dongia*0.95;
        }
        else {
            thanhtien=sothang*dongia*0.9;
        }
        return thanhtien;
    }
    
}
