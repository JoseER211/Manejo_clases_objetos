package Java;

/**
 * Representa características de un anime y su duración.
 * @author Jose David Echavarria Ruiz
 */

public class Anime {
 protected String creator;
 private String name;
 public String gender;
 public Integer numberChapters;
 public Integer numberSeasons;

    /**
     * Crea una instancia de Anime
     * @param creator propiedad de la clase
     * @param name propiedad de la clase
     * @param gender propiedad de la clase
     * @param numberChapters propiedad de la clase
     * @param numberSeasons propiedad de la clase
     */

    public Anime(String creator, String name, String gender, Integer numberChapters, Integer numberSeasons) {
        this.creator = creator;
        this.name = name;
        this.gender = gender;
        this.numberChapters = numberChapters;
        this.numberSeasons = numberSeasons;
    }

    /**
     * Manda un mensaje respecto a la duración del anime
     */
    public void animeDuration(){
        if (numberChapters == 12 && numberSeasons == 1){
            System.out.println("Este anime lo terminas en un día!");
        }
        else {
            System.out.println("Necesitarás varios días para terminar este anime");
        }
    }

    /**
     * getters y setters para acceder a las propiedades
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Muestra las propiedades de la clase Anime
     * @return Los valores de las propiedades
     */

    @Override
    public String toString() {
        return "Anime{" +
                "creator='" + creator + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", numberChapters=" + numberChapters +
                ", numberSeasons=" + numberSeasons +
                '}';
    }

    public static void main(String[] args) {
        /**
         * Prueba del método animeDuration
         */
        Anime akameGaKill = new Anime("Takahiro","Akame Ga Kill!","Acción",
                12,1);
        System.out.println(akameGaKill.toString());
        akameGaKill.animeDuration();
    }
}
