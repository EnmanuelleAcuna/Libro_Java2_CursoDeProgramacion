public class MiOrdenador {
	public static void main(String[] args) {
		COrdenador.EstablecerGarantia((byte)3);
		COrdenador MiOrdenador = new COrdenador();
		MiOrdenador.EstablecerMarca("Toshiba");
		MiOrdenador.EncenderOrdenador();
		MiOrdenador.Estado();
	}
}