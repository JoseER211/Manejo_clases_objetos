package Java;

import java.util.Scanner;

public class Videogame {
    protected String developer;
    protected String publisher;
    private String name;
    private Integer copyNumber;
    public Integer weight;
    public Integer quality;
    public String platforms;

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

    private void checkQuality() {
        if (quality <= 5) {
            System.out.println("Este juego es de Mala calidad");
        }

        if (quality > 5) {
            System.out.println("Este juego es de Buena calidad");
        }
    }

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
        Videogame kingdomHearts = new Videogame("Square Enix", "Disney Interactive Studios",
                "Kingdom Hearts", 1, 12, 6, "ps2, ps3, ps4, pc");
        System.out.println(kingdomHearts.toString());
        kingdomHearts.checkQuality();
    }
}
