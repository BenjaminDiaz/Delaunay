package model;

/**
 * 
 * @author Benjamin Diaz
 *
 */
public class Triangle {

	public Point p1, p2, p3;
	
	public Triangle() {
		p1 = new Point();
		p2 = new Point();
		p3 = new Point();
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	/**
	 * Revisa si un triangulo comparte un vertice con otro triangulo
	 * @param t El triangulo a comparar
	 * @return Verdadero si comparten al menos un vertice
	 */
	public boolean sharesVertex(Triangle t) {
		return p1 == t.p1 || p1 == t.p2 || p1 == t.p3 ||
		p2 == t.p1 || p2 == t.p2 || p2 == t.p3 || 
		p3 == t.p1 || p3 == t.p2 || p3 == t.p3;
	}
}
