public class Cachorro extends Animal{

    private boolean bravo;
    private Pessoa alvo;

    public Cachorro(Pessoa alvo){
        this.alvo = alvo;
        this.bravo = true;
    }
    public void corre() {
        System.out.println(
                "Sou um cachorro e estou correndo " + (bravo? "bravo" : "calmo") + " atras do " + alvo.getNome()

                + "."
        );
    }

    @Override
    public void anda() {
        System.out.println("Sou um cachorro e estou andando ");
    }

}
