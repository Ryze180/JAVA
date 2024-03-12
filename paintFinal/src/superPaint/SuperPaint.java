package superPaint;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import superPaint.SuperPaint.TipoFigura;

public class SuperPaint extends JFrame {

	static enum TipoFigura{LINEA, RECTANGULO, OVALO}
	static enum Color{BLACK, GREEN, RED, CYAN, PURPLE}
	
    

    
 
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperPaint frame = new SuperPaint();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public SuperPaint() {
		getContentPane().setBackground(new java.awt.Color(192, 192, 192));
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 852, 602);
        getContentPane().setLayout(null);
     
        
        JLabel lblX = new JLabel("X: ");
        lblX.setBounds(154, 543, 70, 15);
        getContentPane().add(lblX);
        
        JLabel lblY = new JLabel("Y:");
        lblY.setBounds(226, 543, 70, 15);
        getContentPane().add(lblY);
        
        JPanel panelLienzo = new JPanel();
        panelLienzo.setBounds(10, 52, 816, 480);
        getContentPane().add(panelLienzo);
        
        JComboBox comboBoxTipoColor = new JComboBox();
        comboBoxTipoColor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        comboBoxTipoColor.setModel(new DefaultComboBoxModel(SuperPaint.Color.values()));
        comboBoxTipoColor.setBounds(556, 11, 123, 22);
        getContentPane().add(comboBoxTipoColor);
        
        JComboBox comboBoxTipoFigura = new JComboBox();
        comboBoxTipoFigura.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        comboBoxTipoFigura.setModel(new DefaultComboBoxModel(TipoFigura.values()));
        comboBoxTipoFigura.setBounds(371, 11, 123, 22);
        getContentPane().add(comboBoxTipoFigura);
        
        JCheckBox chckbxRelleno = new JCheckBox("Rellenado");
        chckbxRelleno.setFont(new Font("Tahoma", Font.BOLD, 14));
        chckbxRelleno.setBounds(696, 11, 97, 21);
        getContentPane().add(chckbxRelleno);
        
        //PARA CUANDO ME DIBUJE CON EL MOUSE EN DRAGGED Y HAGA COSAS RARAS COMO LE HACÍAN A DANI
        //paint.superComponent(g);
        
        
        
        panelLienzo.addMouseMotionListener(new MouseMotionAdapter() {
        	
        	
        	
        	@Override
        	public void mouseMoved(MouseEvent e) {
        	 	lblX.setText(String.valueOf("X: "+e.getX()));
            	lblY.setText(String.valueOf("Y: "+e.getY()));
        	
        	}
        });
        panelLienzo.addMouseListener(new MouseAdapter() {
        Figura f;
        
        	
        	
        	
        	@Override
        	public void mousePressed(MouseEvent e) {
        		
        		switch(comboBoxTipoFigura.getSelectedItem().toString()) {
        	case "LINEA":
        		f=new Linea();
        		break;
        	case "RECTANGULO":
        		f=new Rectangulo();
        		break;
        	case "OVALO":
        		f=new Ovalo();
        
        }
        		
        		
        		
        		
        		
            	f.setX1(e.getX());
            	f.setY1(e.getY());
        	}
        	@Override
        	public void mouseReleased(MouseEvent e) {
        		
            	f.setX2(e.getX());
            	f.setY2(e.getY());
            	f.paint(panelLienzo.getGraphics(), chckbxRelleno.isSelected() );
            	
        	}
        });
        
        
        panelLienzo.setBorder(new EmptyBorder(5, 5, 5, 5));
        
       
        
        JLabel lblTipoColor = new JLabel("Color: ");
        lblTipoColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTipoColor.setBounds(503, 15, 53, 18);
        getContentPane().add(lblTipoColor);
        
        JLabel lblTipoFigura = new JLabel("Figura: ");
        lblTipoFigura.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTipoFigura.setBounds(311, 13, 60, 22);
        getContentPane().add(lblTipoFigura);
        
       
        
        JButton btnDeshacer = new JButton("Deshacer");
        btnDeshacer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnDeshacer.setBounds(10, 11, 89, 23);
        getContentPane().add(btnDeshacer);
        
        JButton btnRehacer = new JButton("Rehacer");
        btnRehacer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        btnRehacer.setBounds(109, 11, 89, 23);
        getContentPane().add(btnRehacer);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnLimpiar.setBounds(207, 11, 89, 23);
        getContentPane().add(btnLimpiar);
        
        JLabel lblCoordenadas = new JLabel("COORDENADAS: ");
        lblCoordenadas.setFont(new Font("Tahoma", Font.ITALIC, 11));
        lblCoordenadas.setBounds(55, 543, 89, 14);
        getContentPane().add(lblCoordenadas);
        //setContentPane(panelLienzo);
	}
	}
    

