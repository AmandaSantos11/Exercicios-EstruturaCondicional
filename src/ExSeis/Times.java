package ExSeis;

public class Times {
    public static void main(String[] args){
        int brasil=1, argentina=7;

        if (brasil>argentina){
            System.out.print("O time vencedor foi o Brasil!");
        }
        else if (brasil<argentina){
            System.out.print("O time vencedor foi a Argentina!");
        }
        else {
            System.out.print("Houve um empate");
        }
    }
}
