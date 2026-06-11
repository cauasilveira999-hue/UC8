
package banco;


import java.util.ArrayList;
import modelo.Produto;


public class bancoSimulado {
    
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

bancoSimulado.produtos.add(c1);

bancoSimulado.produtos.add(c2);
    }
}
