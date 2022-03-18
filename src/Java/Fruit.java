package Java;
import java.util.ArrayList;

/**
 * Representa características de una fruta.
 * @author Jose David Echavarria Ruiz
 */

public class Fruit {

    public String name;
    private Float averageWeight;
    public ArrayList<String> colors;


    /**
     * Crea una instancia de fruit
     * @param name propiedad de la clase
     * @param averageWeight propiedad de la clase
     */

    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = new ArrayList<String>();

    }


    /**
     * getters y setters para acceder a las propiedades
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Muestra las propiedades de la clase Fruit
     * @return Los valores de las propiedades
     */
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}
