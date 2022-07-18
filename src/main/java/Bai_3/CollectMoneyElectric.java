/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_3;

/**
 *
 * @author Toanne
 */
public class CollectMoneyElectric extends CollectMoney{
    int chisodau;
    int chisocuoi;
    final int dongia=2500;

    public CollectMoneyElectric() {
    }

    public CollectMoneyElectric(int chisodau, int chisocuoi) {
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
    }

    public int getChisodau() {
        return chisodau;
    }

    public void setChisodau(int chisodau) {
        this.chisodau = chisodau;
    }

    public int getChisocuoi() {
        return chisocuoi;
    }

    public void setChisocuoi(int chisocuoi) {
        this.chisocuoi = chisocuoi;
    }
    
    @Override
    public double calculateMoney() {
        int sotieuthu = chisocuoi-chisodau;
        double thanhtien=0;
        if (sotieuthu>0 && sotieuthu<100){
            thanhtien=sotieuthu*dongia;
        }
        else if (sotieuthu>=100 && sotieuthu<300){
            thanhtien=sotieuthu*dongia*1.05;
        }
        else {
            thanhtien=sotieuthu*dongia*1.1;
        }
        return thanhtien;
    }
    
}
