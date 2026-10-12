/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
 * Validator za datum rodjenja.
 * Proverava da li je uneti tekst u validnom formatu (dd.MM.yyyy),
 * da li je datum postojeci (kalendarski tacan) i da nije u buducnosti.
 * 
 * @author student2
 */
public class DateValidator implements MyValidator {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu")
            .withResolverStyle(ResolverStyle.STRICT);

    @Override
    public void validate(Object value) throws Exception {
        if (value == null || value.toString().trim().isEmpty()) {
            throw new Exception("Datum rodjenja je obavezan");
        }

        String text = value.toString().trim();
        // Ukloni tacku na kraju ako je korisnik uneo "dd.MM.yyyy."
        if (text.endsWith(".")) {
            text = text.substring(0, text.length() - 1).trim();
        }

        LocalDate date;
        try {
            date = LocalDate.parse(text, formatter);
        } catch (DateTimeParseException e) {
            throw new Exception("Datum mora biti u formatu dd.MM.yyyy (npr. 15.05.1995)");
        }

        if (date.isAfter(LocalDate.now())) {
            throw new Exception("Datum rodjenja ne moze biti u buducnosti");
        }

        if (date.getYear() < 1900) {
            throw new Exception("Godina rodjenja ne moze biti pre 1900.");
        }
    }
}
