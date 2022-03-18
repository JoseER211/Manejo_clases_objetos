package Java;

public class Anime {
 protected String creator;
 private String name;
 public String gender;
 public Integer numberChapters;
 public Integer numberSeasons;

    public Anime(String creator, String name, String gender, Integer numberChapters, Integer numberSeasons) {
        this.creator = creator;
        this.name = name;
        this.gender = gender;
        this.numberChapters = numberChapters;
        this.numberSeasons = numberSeasons;
    }

    public void animeDuration(){
        if (numberChapters == 12 && numberSeasons == 1){
            System.out.println("Este anime lo terminas en un día!");
        }
        else {
            System.out.println("Necesitarás varios días para terminar este anime");
        }
    }

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
        Anime akameGaKill = new Anime("Takahiro","Akame Ga Kill!","Acción",
                12,1);
        System.out.println(akameGaKill.toString());
        akameGaKill.animeDuration();
    }
}
