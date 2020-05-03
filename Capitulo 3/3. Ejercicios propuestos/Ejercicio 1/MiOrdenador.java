public class MiOrdenador {
	public static void main(String[] args) {
		COrdenador MiOrdenador = new COrdenador();
		MiOrdenador.EstablecerMarca("Toshiba");
		MiOrdenador.EstablecerProcesador("Intel");
		MiOrdenador.EstablecerPeso(5);
		MiOrdenador.EncenderOrdenador();
		MiOrdenador.ApagarPantalla();
		MiOrdenador.CargarAplicacion();
		MiOrdenador.ApagarOrdenador();
		MiOrdenador.Estado();
	}
}
