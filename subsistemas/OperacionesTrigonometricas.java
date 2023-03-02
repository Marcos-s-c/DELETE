package logica.subsistemas;

public class OperacionesTrigonometricas {
	public double seno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double coseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double tangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }
}
