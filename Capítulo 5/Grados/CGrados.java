class CGrados {
	private float gradosC; //Grados centígrados
	
	public void CentigradosAsignar(float gC) {
		// Establecer el atributo grados centígrados
		gradosC = gC;
	}
	
	public float FahrenheitObtener() {
		// Retornar los grados fahrenheit equivalentes a gradosC
		return 9F/5F * gradosC + 32;
	}
	
	public float CentigradosObtener() {
		return gradosC; // Retornar los grados centígrados
	}
}