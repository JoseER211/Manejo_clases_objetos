package Java;
import java.util.Scanner;

/**
 * Representa características de una flor y aumenta el tamaño de las flores.
 * @author Jose David Echavarria Ruiz
 */

public class Flower {
    protected Integer id;
    private String name;
    private String color;
    private Double size;
    private Integer numberPetals;

    /**
     * Crea una instancia de Flower
     * @param id  propiedad de la clase
     * @param name propiedad de la clase
     * @param color propiedad de la clase
     * @param size propiedad de la clase
     * @param numberPetals propiedad de la clase
     */
    public Flower(Integer id, String name, String color, Double size, Integer numberPetals) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
        this.numberPetals = numberPetals;
    }

    /**
     * Incrementa el tamaño de la flor
     * @return El nuevo tamaño de la flor
     */
    protected Double increaseSize() {

        Scanner data = new Scanner(System.in);
        System.out.println("Digite el tamaño a modificar");
        Integer increaseSize = data.nextInt();

        this.size = this.size + increaseSize;
        return this.size;
    }

    /**
     * getters y setters para acceder a las propiedades
     */

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

    /**
     * Muestra las propiedades de la clase Flower
     * @return Los valores de las propiedades
     */
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
        /**
         * Prueba del método increaseSize
         */
        Flower rosa = new Flower(1, "rosa", "rojo", 304.08, 5);
        rosa.increaseSize();
        System.out.println(rosa.toString());

    }

}
