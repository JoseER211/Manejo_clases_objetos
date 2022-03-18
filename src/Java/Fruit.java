package Java;

import java.util.ArrayList;

public class Fruit {

    public String name;
    private Float averageWeight;
    public ArrayList<String> colors = new ArrayList<String>();

    public Fruit(String name, float averageWeight){
        this.name = name;
        this.averageWeight = averageWeight;

    }

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

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}
