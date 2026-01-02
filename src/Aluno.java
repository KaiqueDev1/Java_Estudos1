public class Aluno extends  Pessoa {

    public String nome = "kaique";

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void emocao() {
        System.out.println(
               "sou " + nome + " e estou com medo"
        );
    }
}
