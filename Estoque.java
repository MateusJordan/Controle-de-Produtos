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

    public boolean atualizarquantidade (String codigo, int novaquantidade)
    {
        produto p = produtos.get (codigo);

        if (p == null)
        {
            return false;
        }

        p.setquantidade (novaquantidade)
        return true;
    }

    public void listarprodutos ()
    {
        if (produtos.isEmpty())
        {
            System.out.println ("nenhum produto cadastrado.");
        }
        else
        {
            for (Produto p : produtos values())
        }
        System.out.println(p);
    }

    public boolean salvarEstoque (String nomearquivo)
    {
        File arquivo = new File (nomearquivo)

        if (arquivo.exists())
        {
            System.out.println ("arquivo ja existentes.");
            return false
        }
        
        try (BufferWrirter wirter = new BufferWrirter (new FileWirter(arquivo)))
        {
            for (produto p : produto.values())
            {
                wirter.wirte(p.toFileString());
                wirte.newLine();
            }
            return false;
        }
        catch (IOExeption e)
        {
            System.out.println ("erro ao salvar o arquivo: " + e.getMessage);
            return false;
        }

    }

        public boolean carregarEstoque (String nomearquivo)
        {
            File arquivo = new File (nomearquivo);

            if (!arquivo.exists())
            {
                System.out.println ("arquivo nao encontrado.");
                return false;
            }

            try (BufferedReader reader = new BufferedReader (new FileReader(arquivo)))
        {
            String linha;
            while((linha = reader.readLine()) != null)
        }
         produto p = Produto.fromFileString (linha);

         if (p != null)
         {
            produtos.put (p.getcodigo(), p);
         }
         return true;

        catch (IOExeption e)
        {
            System.out.println ("erro ao carregar o arquivo: " + e.getMessage);
            return false;
        }

}