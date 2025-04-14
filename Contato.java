import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Contato {
    private final String nome;
    private final String telefone;
    private final String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public static void ordenarContatosPorNome(List<Contato> contatos) {
        contatos.sort(Comparator.comparing(contato -> contato.nome));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contato contato = (Contato) obj;
        return Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
