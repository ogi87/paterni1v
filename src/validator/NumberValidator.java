/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

/**
 * Validator celobrojnih vrednosti.
 * Proverava da li je uneta vrednost validan nenegativan ceo broj.
 * 
 * @author student2
 */
public class NumberValidator implements MyValidator {

    @Override
    public void validate(Object value) throws Exception {
        if (value == null || value.toString().trim().isEmpty()) {
            throw new Exception("Vrednost je obavezna");
        }
        int num;
        try {
            num = Integer.parseInt(value.toString().trim());
        } catch (Exception e) {
            throw new Exception("Vrednost mora biti ceo broj");
        }
        if (num < 0) {
            throw new Exception("Broj ne moze biti negativan");
        }
    }
    
}
