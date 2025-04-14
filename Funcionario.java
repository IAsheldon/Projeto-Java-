import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Funcionario {
    private final String nome;
    private final double salario;
    private final int id;

    public Funcionario(String nome, double salario, int id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public static Funcionario encontrarMaiorSalario(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .max(Comparator.comparingDouble(func -> func.salario))
                .orElse(null);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario that = (Funcionario) obj;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }
}
