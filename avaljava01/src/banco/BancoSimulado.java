package banco;
import banco.Aluno;
import java.util.ArrayList;

public class BancoSimulado {
     public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static int idProduto = 1;
    
    static {

        alunos.add(new Aluno(
                1,
                "José Rodrigo",
                "122",
                "rodrigojose9@gmail.com"
            )
        );
        
        alunos.add(new Aluno(
                 2,
                "Maria Ortiz",
                "127",
                "mariaortt@gmail.com"
            )
        );
        alunos.add(new Aluno(
                 1,
                "Junior Pereira",
                "132",
                "jpereira1344@gmail.com"
            )
        );       
    }
}
