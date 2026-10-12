/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

/**
 * Validator obaveznog unosa.
 * Proverava da vrednost nije null niti prazan string.
 * 
 * @author student2
 */
public class RequiredValidator implements MyValidator {

    private final String errorMessage;

    public RequiredValidator() {
        this("Polje je obavezno");
    }

    public RequiredValidator(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public void validate(Object value) throws Exception {
        if (value == null || value.toString().trim().isEmpty()) {
            throw new Exception(errorMessage);
        }
    }
}
