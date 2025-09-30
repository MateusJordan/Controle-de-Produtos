import java.io.*;
import java.util.*;


public class Estoque
{
    private HashMap <String, Produto> produtos;

    public Estoque()
    {
        produtos = new HashMap<>();
    }

    public boolean cadastrarproduto (String codigo, String nome, int quantidade)
    {
        if (produtos.containsKey(codigo))
        {
            return false;
        }

        produtos.put(codigo, new Produto(codigo, nome,quantidade))
        return true;
    }

}