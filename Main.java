import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exercício 1: Livro
        HashSet<Livro> livros = new HashSet<>();
        livros.add(new Livro("Livro A", "Autor A", "123"));
        livros.add(new Livro("Livro B", "Autor B", "456"));
        livros.add(new Livro("Livro A", "Autor A", "123")); // Duplicado
        System.out.println("HashSet de Livros: " + livros);

        // Exercício 2: Produto
        HashMap<Integer, Produto> produtos = new HashMap<>();
        produtos.put(1, new Produto("Produto A", 10.5, 1));
        produtos.put(2, new Produto("Produto B", 20.0, 2));
        produtos.put(3, new Produto("Produto C", 30.0, 3));
        System.out.println("HashMap de Produtos: " + produtos);

        // Exercício 3: Ponto
        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(3, 4);
        System.out.println("Distância entre p1 e p2: " + Ponto.calcularDistancia(p1, p2));

        // Exercício 4: Funcionario
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Funcionario A", 5000, 1),
                new Funcionario("Funcionario B", 7000, 2),
                new Funcionario("Funcionario C", 6000, 3)
        );
        System.out.println("Funcionário com maior salário: " + Funcionario.encontrarMaiorSalario(funcionarios));

        // Exercício 5: Contato
        List<Contato> contatos = Arrays.asList(
                new Contato("Ana", "1111-1111", "ana@email.com"),
                new Contato("Carlos", "2222-2222", "carlos@email.com"),
                new Contato("Bruna", "3333-3333", "bruna@email.com")
        );
        Contato.ordenarContatosPorNome(contatos);
        System.out.println("Contatos ordenados por nome: " + contatos);
    }
}
