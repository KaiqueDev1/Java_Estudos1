

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Pessoa pessoa = new Pessoa("Kaique");
        Animal cachorro  = new Cachorro(pessoa);

        cachorro.anda();

        if(cachorro instanceof Cachorro){
            Cachorro c = (Cachorro) cachorro;
            c.corre();
        }


    }
}