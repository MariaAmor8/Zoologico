package presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FPrincipal extends JFrame{
	JTextField txtAnimal;
	JTextField txtEdad;
	JComboBox CBhabitat;
	
	public void ejecutar() {
		this.setPreferredSize(new Dimension(350,250));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(4,2));
		this.add(new JLabel("Nombre del animal"));
		this.txtAnimal= new JTextField();
		this.add(txtAnimal);
		
		this.add(new JLabel("Edad del animal"));
		this.txtEdad= new JTextField();
		this.add(txtEdad);
		
		this.add(new JLabel("Habitad del animal"));
		String[] habitats = {"desierto", "selva", "polo norte"};
		this.CBhabitat = new JComboBox(habitats);
		this.CBhabitat.setBackground(Color.white);
		this.add(this.CBhabitat);
		
		JButton bEnviar = new JButton("Registrar animal");
		this.add(bEnviar);
		this.pack();
	}
	
	public static void main(String[] args) {
		FPrincipal principal = new FPrincipal();
		principal.ejecutar();
	}
	

}
