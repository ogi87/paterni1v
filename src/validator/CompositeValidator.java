/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite validator (Uzor Kompozit / Composite Pattern).
 * Omogucava kombinovanje vise razlicitih validatora u jedan lanac proveravanja.
 * Validatori se izvrsavaju redom onako kako su dodati.
 * 
 * @author student2
 */
public class CompositeValidator implements MyValidator {

    private final List<MyValidator> validators = new ArrayList<>();

    public CompositeValidator() {
    }

    public CompositeValidator(MyValidator... initialValidators) {
        for (MyValidator v : initialValidators) {
            addValidator(v);
        }
    }

    public CompositeValidator addValidator(MyValidator validator) {
        if (validator != null) {
            validators.add(validator);
        }
        return this;
    }

    @Override
    public void validate(Object value) throws Exception {
        for (MyValidator validator : validators) {
            validator.validate(value);
        }
    }
}
