package superPaint;

import java.awt.Color;
import java.awt.Graphics;

abstract public class Figura{
	int x1,y1,x2,y2;
	Color color;
	boolean relleno;
	
	//CONSTRUCTOR CON LOS ATRIBUTOS DE LAS FIGURAS
	public Figura(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color=color;
		this.relleno=relleno;
	}
	public Figura() {}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}
 
	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Boolean getRelleno() {
		return relleno;
	}
	public void setRelleno(Boolean relleno) {
		this.relleno = relleno;
	}
	
	//MÉTODOS PARA CREAR LAS FIGURAS
	
	abstract public void paint(Graphics g, boolean relleno);
	
	public int inicioFiguraX(int x1, int x2) {
		int x=Math.min(x1, x2);
		return(x);
	}
	public int inicioFiguraY(int y1, int y2) {
		int y=Math.min(y1, y2);
		return(y);
	}
	
	public int anchura(int x1, int x2) {
		int x=Math.abs(x1-x2);
		return x;
	}
	public int altura(int y1, int y2) {
		int y=Math.abs(y1-y2);
		return y;
	}
	
	
	
}