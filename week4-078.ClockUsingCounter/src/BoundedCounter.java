/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cihan
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        value ++;
        if (value > upperLimit)
            value = 0;
    }
    
    public String toString() {
        if (value < 10)
            return "0"+value;
        return ""+value;

    }
    public void setValue(int val) {
        if(0 <= val && val <= this.upperLimit)
            value = val;
        
    }
    public int getValue() {
        return value;
    }
    

}
