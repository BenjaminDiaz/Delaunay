package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Point;
import model.Triangle;
import model.Triangulate;

public class TriangulationPanel extends JPanel implements MouseListener {

	private static final long serialVersionUID = 6440260158224459145L;

	ArrayList<Point> points;
	ArrayList<Triangle> triangles;

	public TriangulationPanel() {
		setPreferredSize(new Dimension(600, 600));
		points = new ArrayList<Point>();
		triangles = new ArrayList<Triangle>();
		addMouseListener(this);
	}
	/**
	 * Resetea el panel. Vacia las listas de puntos y triangulos.
	 */
	public void reset() {
		points.clear();
		triangles.clear();
		repaint();
	}

	/**
	 * Dibuja la triangulacion de Delaunay en el panel.
	 * 
	 * @param g
	 *            Contexto grafico
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		for (int i = 0; i < points.size(); i++) {
			g.fillOval((int)points.get(i).x-2, (int)points.get(i).y-2, 4, 4);
		}
		for (int i = 0; i < triangles.size(); i++) {
			Triangle aux = triangles.get(i);
			g.drawLine((int)aux.p1.x, (int)aux.p1.y, (int)aux.p2.x, (int)aux.p2.y);
			g.drawLine((int)aux.p2.x, (int)aux.p2.y, (int)aux.p3.x, (int)aux.p3.y);
			g.drawLine((int)aux.p3.x, (int)aux.p3.y, (int)aux.p1.x, (int)aux.p1.y);
		}
	};

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		points.add(new Point(e.getX(), e.getY()));
		triangulate();
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	private void triangulate() {
		triangles = Triangulate.triangulate(points);
	}
}
