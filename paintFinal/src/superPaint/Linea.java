package superPaint;

import java.awt.Color;
import java.awt.Graphics;

public class Linea extends Figura{

	public Linea() {
		super();
	}
	public Linea(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
		super(x1, y1, x2, y2, color, relleno);
		// TODO Auto-generated constructor stub
	}

	//MÉTODO QUE DIBUJA/PINTA LA LÍNEA
	
    public void paint (Graphics g, boolean relleno){
        
    			//trae el constructor de la clase de java paint
        g.setColor (color);
        g.drawLine (x1, y1, x2, y2);	//Dibuja la línea
	}

	
	
}

