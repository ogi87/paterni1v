/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package component;

/**
 * Zajednicki interfejs za sve UI panele za unos podataka na formi.
 * Omogucava polimorfni pristup prikupljanju i validaciji vrednosti.
 * 
 * @author student2
 */
public interface FormInputPanel {
    
    /**
     * Vraca unetu i validiranu vrednost sa panela.
     * U slucaju neispravnog unosa prikazuje gresku na panelu i baca izuzetak.
     * 
     * @return uneta vrednost
     * @throws Exception ako vrednost nije validna
     */
    Object getValue() throws Exception;
    
    /**
     * Brise poruku o gresci sa panela.
     */
    void clearError();
    
    /**
     * Resetuje panel na pocetno stanje (brise unos i gresku).
     */
    void reset();
}
