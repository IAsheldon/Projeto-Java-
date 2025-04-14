import java.util.Objects;

public class Produto {
    private final String nome;
    private final double preco;
    private final int codigo;

    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }
}
