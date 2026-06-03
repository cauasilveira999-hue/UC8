import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author CAUASILVEIRAMORALES
 */
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
}

