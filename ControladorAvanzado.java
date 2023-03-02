package logica;

public class ControladorAvanzado implements IControlador {

	@Override
	public String funcionesDisponibles() {
		String funciones =  "Obtener potencia";
		funciones +=  "\nObtener raiz cuadrada";
		return funciones;
	}

	@Override
	public String tipoDeOperacion() {
		return "Operaciones avanzadas";
	}

}
