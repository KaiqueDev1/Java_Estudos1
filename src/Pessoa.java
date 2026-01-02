public class Pessoa {
     protected String nome;

     public Pessoa(String nome){
         this.nome = nome;
     }
     public String getNome() {
         return nome;
     }

    public void emocao(){
        System.out.println("Sou uma pessoa e estou feliz");
    }
}
