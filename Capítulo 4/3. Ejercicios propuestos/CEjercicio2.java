class CEjercicio2 {

	public static void main(String args[]) {
		int a = 10, b = 3, d, e;
		float x, y;
		
		// Se debe inicializar la variable para ser utilizado en la operación posterior
		boolean c = false;
		
		x = a / b;
		
		// C debe ser boolean ya que se está evaluando si [a] es menor que [b]
		c = a < b && c;
		
		d = a + b++;
		e = ++a - b;
		y = (float)a / b;
		
		System.out.println("x = " + x);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("y = " + y);			
	}
}