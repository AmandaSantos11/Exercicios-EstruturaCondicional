package ExUm;

public class Media {
    public static void main(String[] args) {
        int n1=5, n2=6, n3=8, n4=10;
        int media;

        media = (n1+n2+n3+n4) / 4;

        if (media >=7){
            System.out.print("Aluno aprovado!");
        }
        else {
            System.out.print("Aluno reprovado");
        }
    }
}
