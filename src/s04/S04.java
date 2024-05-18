/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04;

/**
 *
 * @author Tam Pham
 */
public class S04 {

    public double CalFuelEconomy(int minutes, int speed, double GasFuel) {
        return ((speed * ((double) minutes / 60)) / GasFuel);
    }

    public double travel(int radiusOfTires, int revolution) {
        return (((radiusOfTires * 2 * Math.PI) * revolution) / 63360);
    }

    public double revisedFuelEconomyCal(int radiusOfTires, int revolution, double GasFuel) {
        return (travel(radiusOfTires, revolution) / GasFuel);
    }
}
