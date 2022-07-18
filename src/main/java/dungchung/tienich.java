/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungchung;

/**
 *
 * @author Toanne
 */
public class tienich {
    public static boolean isNumeric(String so){
        try{
            double d = Double.parseDouble(so);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
