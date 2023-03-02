package logica;

public class ControladorBasico implements IControlador{
	@Override
	public String funcionesDisponibles() {
		String funciones =  "Sumar";
		funciones +=  "\nRestar";
		return funciones;
	}

	@Override
	public String tipoDeOperacion() {
		return "Operaciones basicas";
	}
	
	public double sumar(double pNum1, double pNum2) {
		return pNum1 + pNum2;
	}
	
	public double restar(double pNum1, double pNum2) {
		return pNum1 - pNum2;
	}

}
