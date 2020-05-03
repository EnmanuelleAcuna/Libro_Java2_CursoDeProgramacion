public class Test {
	public static void main(String[] args) {
		CCuenta cuenta01 = new CCuenta();
		CCuenta cuenta02 = new CCuenta("Nombre cuenta02.", "Cuenta cuenta02.", 6000, 3.5);

		cuenta01.AsignarNombre("Nombre cuenta01.");
		cuenta01.AsignarCuenta("Cuenta cuenta01.");
		cuenta01.AsignarTipoDeInteres(2.5);

		cuenta01.Ingreso(12000);
		cuenta01.Reintegro(3000);

		System.out.println(cuenta01.ObtenerNombre());
		System.out.println(cuenta01.ObtenerCuenta());
		System.out.println(cuenta01.Estado());
		System.out.println(cuenta01.ObtenerTipoDeInteres());
		System.out.println();
		System.out.println(cuenta02.ObtenerNombre());
		System.out.println(cuenta02.ObtenerCuenta());
		System.out.println(cuenta02.Estado());
		System.out.println(cuenta02.ObtenerTipoDeInteres());

		CCuentaAhorro cuentaAhorro01 = new CCuentaAhorro();
		cuentaAhorro01.AsignarNombre("Nombre cuentaAhorro01.");
		cuentaAhorro01.AsignarCuenta("Cuenta cuentaAhorro01.");
		cuentaAhorro01.AsignarTipoDeInteres(2.5);

		cuentaAhorro01.Ingreso(12000);
		cuentaAhorro01.Reintegro(3000);

		System.out.println(cuentaAhorro01.ObtenerNombre());
		System.out.println(cuentaAhorro01.ObtenerCuenta());
		System.out.println(cuentaAhorro01.Estado());
		System.out.println(cuentaAhorro01.ObtenerTipoDeInteres());

		CCuentaAhorro cuentaAhorro02 = new CCuentaAhorro("Nombre cuentaAhorro02.", "Cuenta cuentaAhorro02.", 6000, 3.5, 0.80);
		cuentaAhorro02.Reintegro(cuentaAhorro02.ObtenerCuotaMant()); //Cobrar cuota de mantenimiento
		cuentaAhorro02.Ingreso(6000); //Ingreso
		cuentaAhorro02.Reintegro(10000); //Reintegro

		System.out.println(cuentaAhorro02.ObtenerNombre());
		System.out.println(cuentaAhorro02.ObtenerCuenta());
		System.out.println(cuentaAhorro02.Estado());
		System.out.println(cuentaAhorro02.ObtenerTipoDeInteres());	
	}
}
