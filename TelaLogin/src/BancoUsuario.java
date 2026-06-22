import modelo.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class BancoUsuario {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    
     public static boolean ValidarLogin(String email, String senha) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        
        return false;
    };
     
    
    public static ArrayList<Produto> produtos =
            new ArrayList<>();



    public static int idProduto = 1;

    
    static {
        
        Produto c1 = new Produto(
        1,
        "Carro Semi-Usado",
        25000,
        1
);

        Produto c2 = new Produto(
        2,
        "Iphone 17, 512 gb, 12 gb RAM",
        10000,
        127
);

BancoUsuario.produtos.add(c1);

BancoUsuario.produtos.add(c2);
    }
}


