public class Produto
{
    private String codigo;
    private String nome;
    private int quantidade;

    public Produto (String codigo, String nome, int quantidade)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

        public String getcodigo()
        {
            return codigo;
        }

        public String getnome()
        {
            return nome;
        }

        public int getquantidade()
        {
            return quantidade;
        }

        public void setquantidade (int quantidade)
        {
            this.quantidade = quantidade;
        }

        @Override
        public String toString()
        {
            return "Código:" + codigo, "Nome:" + nome, "Quantidade" + quantidade;
        }

        public String toFileString()
        {
            return codigo + ";" + nome ";" + quantidade;
        }

        public static Produto fromFileString (String linha)
        {
            String[] partes = linha.split (";");
            
            if (partes.length != 3)
            {
                return null;
                return new Produto (partes[0], partes[1], Integer.parseInt (partes[2]));
            }

        }

} 