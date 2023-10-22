package org.ulpgc.is1.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        // Agrega una lógica real de validación de números de teléfono aquí.
        // Por ejemplo, puedes verificar la longitud o el formato.
        return true; // Devuelve true o false según la validación.
    }
}
