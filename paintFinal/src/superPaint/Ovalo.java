package superPaint;

import java.awt.Color;
import java.awt.Graphics;

public class Ovalo extends Figura {

	public Ovalo() {
		super();
	}

	public Ovalo(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
		super(x1, y1, x2, y2, color, relleno);
		// TODO Auto-generated constructor stub
	}

	// MÉTODO QUE DIBUJA/PINTA EL ÓVALO

	public void paint(Graphics g, boolean relleno) {

		// trae el constructor de la clase de java paint
		g.setColor(color);

		if (relleno) {
			g.fillOval(inicioFiguraX(x1, x2), inicioFiguraY(y1, y2), anchura(x1, x2), altura(y1, y2)); // Dibuja el óvalo
																										

		} else {
			g.drawOval(inicioFiguraX(x1, x2), inicioFiguraY(y1, y2), anchura(x1, x2), altura(y1, y2)); // Dibuja el óvalo
																										
		}

	}
}
