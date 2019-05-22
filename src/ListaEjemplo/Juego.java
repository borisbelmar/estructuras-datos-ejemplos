package ListaEjemplo;

public class Juego {

    private int id;
    private String name;
    private int year;
    private String company;

    // Constructores

    public Juego(int id, String name) {
        this.id = id;
        this.name = name;
        this.year = 0;
        this.company = "undefined";
    }

    public Juego(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.company = "undefined";
    }

    public Juego(int id, String name, int year, String company) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.company = company;
    }

    // Getters & Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
