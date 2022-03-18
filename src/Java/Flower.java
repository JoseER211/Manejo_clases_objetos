package Java;

import java.util.Scanner;

public class Flower {
    protected Integer id;
    private String name;
    private String color;
    private Double size;
    private Integer numberPetals;

    public Flower(Integer id, String name, String color, Double size, Integer numberPetals) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
        this.numberPetals = numberPetals;
    }

    protected Double increaseSize() {

        Scanner data = new Scanner(System.in);
        System.out.println("Digite el tamaño a modificar");
        Integer increaseSize = data.nextInt();

        this.size = this.size + increaseSize;
        return this.size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getNumberPetals() {
        return numberPetals;
    }

    public void setNumberPetals(Integer numberPetals) {
        this.numberPetals = numberPetals;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", numeroPetalos=" + numberPetals +
                '}';
    }

    public static void main(String[] args) {

        Flower rosa = new Flower(1, "rosa", "rojo", 304.08, 5);
        rosa.increaseSize();
        System.out.println(rosa.toString());

    }

}
