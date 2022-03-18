package Java;

/**
 * Representa características de un videojuego y decide si es de buena o mala calidad.
 * @author Jose David Echavarria Ruiz
 */

public class Videogame {
    protected String developer;
    protected String publisher;
    private String name;
    private Integer copyNumber;
    public Integer weight;
    public Integer quality;
    public String platforms;

    /**
     * Crea una instancia de Videogame
     * @param developer propiedad de la clase
     * @param publisher propiedad de la clase
     * @param name propiedad de la clase
     * @param copyNumber propiedad de la clase
     * @param weight propiedad de la clase
     * @param quality propiedad de la clase
     * @param platforms propiedad de la clase
     */

    public Videogame(String developer, String publisher, String name, Integer copyNumber, Integer weight,
                     Integer quality, String platforms) {
        this.developer = developer;
        this.publisher = publisher;
        this.name = name;
        this.copyNumber = copyNumber;
        this.weight = weight;
        this.quality = quality;
        this.platforms = platforms;
    }

    /**
     * Manda un mensaje respecto a la calidad del videojuego
     */
    private void checkQuality() {
        if (quality <= 5) {
            System.out.println("Este juego es de Mala calidad");
        }

        if (quality > 5) {
            System.out.println("Este juego es de Buena calidad");
        }
    }

    /**
     *getters y setter para acceder a las propiedades
     */

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(Integer copyNumber) {
        this.copyNumber = copyNumber;
    }


    /**
     * Muestra las propiedades de la clase Videogame
     * @return Los valores de las propiedades
     */
    @Override
    public String toString() {
        return "Videogame{" +
                "developer='" + developer + '\'' +
                ", publisher='" + publisher + '\'' +
                ", name='" + name + '\'' +
                ", copyNumber=" + copyNumber +
                ", weight=" + weight + "gb" +
                ", quality='" + quality + '\'' +
                ", platforms='" + platforms + '\'' +
                '}';
    }

    public static void main(String[] args) {
        /**
         * prueba del método checkQuality
         */
        Videogame kingdomHearts = new Videogame("Square Enix", "Disney Interactive Studios",
                "Kingdom Hearts", 1, 12, 6, "ps2, ps3, ps4, pc");
        System.out.println(kingdomHearts.toString());
        kingdomHearts.checkQuality();
    }
}
