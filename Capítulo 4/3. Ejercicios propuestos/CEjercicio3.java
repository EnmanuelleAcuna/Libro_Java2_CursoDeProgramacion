class CEjercicio3 {
	
	public static void main(String args[]) {
		int a = 5;
		double b = -1.7;
		int c = 2;
		double x = 10.5;
			
		double monomio1 = (a * (Math.pow(x, 3)));
		
		double monomio2 = (b * (Math.pow(x, 2)));
				
		double monomio3 = (c * x);
		
		int monomio4 = 3;
		
		double resultado =  monomio1 + monomio2 - monomio3 + monomio4;
		
		System.out.println("Resultado = " + resultado);		
	}
}