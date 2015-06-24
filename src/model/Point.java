package model;
/**
 * 
 * Punto en un plano euclideano.
 * 
 * @author Benjamin Diaz
 *
 */
public class Point {

	public float x, y, z;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public Point(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Point() {
	}

}
