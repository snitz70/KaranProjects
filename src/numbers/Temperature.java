/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

/**
 *
 * @author Brian Snyder
 */
public class Temperature {
    String unit;
    double temp;
    double newTemp;
    
    public Temperature(String unit, double temp){
        this.unit = unit;
        this.temp = temp;
    }

    public Temperature toCelsius(){
        if (this.unit == "fahrenheit"){
            newTemp = (this.temp - 32) * 5 / 9;
        }
        return new Temperature("celsius" , newTemp);
    }
    
    public Temperature toKelvin(){
        if (this.unit == "fahrenheit"){
            newTemp = (this.temp + 459.67) * 5 / 9;
        }
        return new Temperature("kelvin", newTemp);
    }
    
}
