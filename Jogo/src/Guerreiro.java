public class Guerreiro extends Personagem{
    public Guerreiro(String nome) {
        super(nome, 120, 15, 10);
    }

    public Guerreiro() {
        super();
    }

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }
    public String golpePesado(){
        return "Deu um golpe de 80";
    }

    @Override
    public double atacar() {
        return super.atacar();
    }

    @Override
    public int receberDano() {
        return super.receberDano();
    }

    @Override
    public String mostrarStatus() {
        return super.mostrarStatus();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida);
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque);
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public void setDefesa(int defesa) {
        super.setDefesa(defesa);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
