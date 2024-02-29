package esempi.lezione_10.compar;

public class Dipendenti implements Comparable<Dipendenti>{
    private int ID;
    private String nome;
    private int eta;
    private double salario;

    public Dipendenti(int id, String nome, int eta, double salario){
        this.ID = id;
        this.nome = nome;
        this.eta = eta;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public int compareTo(Dipendenti dipe){
        //return this.ID-dipe.ID;
        return this.nome.compareTo(dipe.nome);
    }
    @Override
    public String toString(){
        return "Dipendente ID= "+ID+", nome="+nome+", eta="+eta+", salario="+salario;
    }
}
