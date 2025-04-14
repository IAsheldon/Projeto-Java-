import java.util.Objects;

public class Ponto {
    private final double x;
    private final double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double calcularDistancia(Ponto p1, Ponto p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ponto ponto = (Ponto) obj;
        return Double.compare(ponto.x, x) == 0 && Double.compare(ponto.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
