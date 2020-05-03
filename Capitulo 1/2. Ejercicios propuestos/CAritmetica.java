class COperacionesAritmeticas {	
	//Función sumar:
	//Parametros: a, b y c de tipo double.
	//Devuelve la suma de los tres parámetros.
	public static double sumar(double a, double b, double c) {
		double resultado = 0;
		resultado = a + b + c;
		return resultado;
	}
	
	//Función restar:
	//Parametros: a, b y c de tipo double.
	//Devuelve la resta de los tres parámetros.
	public static double restar(double a, double b, double c) {
		double resultado = 0;
		resultado = a - b - c;
		return resultado;
	}
	
	//Función producto(multiplicar):
	//Parametros: a, b y c de tipo double.
	//Devuelve el producto de los tres parámetros.
	public static double producto(double a, double b, double c) {
		double resultado = 0;
		resultado = a * b * c;
		return resultado;
	}
	
	//Función cociente(dividir):
	//Parametros: a, b y c de tipo double.
	//Devuelve el cociente de los tres parámetros.
	public static double cociente(double a, double b, double c) {
		double resultado = 0;
		resultado = a / b / c;
		return resultado;
	}
}

public class CAritmetica {
	public static void main (String[] args) {
		COperacionesAritmeticas oa = new COperacionesAritmeticas();
		double dato1, dato2, dato3, resultado;

		dato1 = 10;
		dato2 = 20;
		dato3 = 30;

		//Suma
		resultado = oa.sumar(dato1, dato2, dato3);
		System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);

		//Resta
		resultado = oa.restar(dato1, dato2, dato3);
		System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);

		//Producto
		resultado = oa.producto(dato1, dato2, dato3);
		System.out.println(dato1 + " * " + dato2 + " + " + dato3 + " = " + resultado);

		//Cociente
		resultado = oa.cociente(dato1, dato2, dato3);
		System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
	}
}
