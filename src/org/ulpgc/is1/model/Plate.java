package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        if (number == null || number.isEmpty()) {
            return false;
        }

        for (char character : number.toCharArray()) {
            if (!Character.isLetterOrDigit(character)) {
                return false;
            }
        }

        return true;
    }
}
