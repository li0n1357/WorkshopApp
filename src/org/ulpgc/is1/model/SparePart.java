package org.ulpgc.is1.model;

public class SparePart {

    private final String name;
    private final Integer price;

    public SparePart(String name, Integer price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }

        if (price == null || price < 0) {
            throw new IllegalArgumentException("El precio debe ser un valor no negativo");
        }

        this.name = name;
        this.price = price;
    }

    public static SparePart createSparePart(String name, Integer price) {
        return new SparePart(name, price);
    }

    @Override
    public String toString() {
        return "SparePart{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
