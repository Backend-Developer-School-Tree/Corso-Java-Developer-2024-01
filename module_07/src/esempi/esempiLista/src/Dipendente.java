import java.util.Objects;

public class Dipendente implements Comparable<Dipendente>{
    private int ID;
    private String nome;
    private int eta;
    private double salario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dipendente that = (Dipendente) o;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public Dipendente(int ID, String nome, int eta, double salario){
        this.ID = ID;
        this.nome = nome;
        this.eta = eta;
        this.salario = salario;
    }
    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    public int compareTo(Dipendente d){
        return this.ID - d.ID;
    }

    public String toString(){
        return "Dipendente ID="+ID+", NOME=" + nome + ", ETA="+ eta + ", SALARIO=" + salario;
    }
}
