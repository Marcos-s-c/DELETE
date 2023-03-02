package logica;

public class ControladorAritmetico implements IControlador {

	@Override
	public String funcionesDisponibles() {
		String funciones =  "Obtener seno de un angulo";
		funciones +=  "\nObtener coseno de un angulo";
		funciones +=  "\nObtener tangente de un angulo";
		return funciones;
	}

	@Override
	public String tipoDeOperacion() {
		return "Operaciones aritmeticas";
	}

}
