class CCoche {
	private String Marca, Modelo, Color;
	private boolean Motor = false, Acelerar = false, Frenar = false;
	int Velocidad = 0;

	public CCoche(){} // Constructor sin parametros.

	public CCoche(String mar, String mod, String col) {
		AsignarMarca(mar);
		AsignarModelo(mod);
		AsignarColor(col);
	}

	public void ObtenerInfoCoche() {
		System.out.println("La informacion del coche es la siguiente:");
		System.out.println("Marca: " + ObtenerMarca());
		System.out.println("Modelo: " + ObtenerModelo());
		System.out.println("Color: " + ObtenerColor());
	}

	public void AsignarMarca(String mar) {
		if (mar.length() == 0) {
			System.out.println("Error, no escribio nada en el campo de la marca.");
			return;
		}
		Marca = mar;
	}

	public String ObtenerMarca() {
		return Marca;
	}

	public void AsignarModelo(String mod) {
		if (mod.length() == 0) {
			System.out.println("Error: no escribio nada en el modelo");
			return;
		}
		Modelo = mod;
	}

	public String ObtenerModelo() {
		return Modelo;
	}

	public void AsignarColor(String col) {
		if (col.length() == 0) {
			System.out.println("Error: no escribio nada en el campo del color.");
			return;
		}
		Color = col;
	}

	public String ObtenerColor() {
		return Color;
	}

	public void ArrancarMotor() {
		if (Motor == true) {
			System.out.println("El motor ya esta arrancado.");
		}
		else {
			Motor = true;
			Velocidad = 0;
			System.out.println("El motor del coche ha sido arrancado.");
		}
	}

	public void ApagarMotor() {
		if (Motor == false) {
			System.out.println("El motor ya esta apagado.");
		}
		else {
			FrenarCoche();//Frenar el coche
			Velocidad = 0; //Poner velocidad en 0
			Motor = false; //Apagar el motor
			System.out.println("El motor del coche ha sido apagado.");
		}
	}

	public void AumentarVelocidad()	{
		if (Velocidad == 5)	{
			System.out.println("El motor ya esta en su maxima velocidad.");
		}
		else {
			Velocidad = Velocidad + 1;
			System.out.println("Se ha aumentado una velocidad, esta en: " + Velocidad + " velocidad");
		}
	}

	public void DisminuirVelocidad() {
		if (Velocidad == 0)	{
			System.out.println("El motor esta en neutro");
		}
		else {
			Velocidad = Velocidad - 1;
			System.out.println("Se ha disminuido una velocidad, esta en: " + Velocidad + " velocidad");
		}
	}

	public void AcelerarCoche() {
		if (Motor == false)	{
			System.out.println("No se puede acelerar, el motor esta apagado.");
		}
		else {
			if (Velocidad == 0)	{
				System.out.println("No se puede acelerar el coche, esta en neutro.");
			}
			else {
				if (Acelerar == true) {
					System.out.println("El coche ya esta acelerado.");
				}
				else {
					Acelerar = true;
					System.out.println("Se ha acelerado el coche.");
				}
			}
		}
	}

	public void FrenarCoche() {
		if (Frenar == true) {
			System.out.println("El motor ya esta detenido.");
		}
		else {
			Frenar = true;
			System.out.println("El coche se ha frenado.");
		}
	}
}
