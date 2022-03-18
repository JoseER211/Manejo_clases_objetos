package Java;

import java.util.Date;

/**
 * Representa características de una persona.
 * @author Jose David Echavarria Ruiz
 */

public class Person {

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public Float height;

    /**
     * Crea una instancia de Person
     * @param name propiedad de la clase
     * @param lastName1 propiedad de la clase
     * @param lastName2 propiedad de la clase
     * @param dateBirth propiedad de la clase
     * @param height propiedad de la clase
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;

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

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * Muestra las propiedades de la clase Person
     * @return Los valores de las propiedades
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}

