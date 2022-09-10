package desafio;

public class Growdever {

    private String nome;
    private String area;

    public Growdever() {
    }

    public Growdever(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "\nGrowdever" +
                "\nNome: " + nome +
                "\nArea: " + area;

    }
}
