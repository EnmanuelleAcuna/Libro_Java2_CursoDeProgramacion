public class MiCoche {
	public static void main(String[] args) {
		CCoche Coche01 = new CCoche("Mazda", "RX-7", "Rojo");

		//Iniciar el coche, cambiar de velocidad, acelerarlo, cambiar de velocidad y frenarlo
		Coche01.ArrancarMotor();
		Coche01.AcelerarCoche();
		Coche01.AumentarVelocidad();
		Coche01.AcelerarCoche();
		Coche01.AumentarVelocidad();
		Coche01.FrenarCoche();
		Coche01.ApagarMotor();
		Coche01.ObtenerInfoCoche();
	}
}
