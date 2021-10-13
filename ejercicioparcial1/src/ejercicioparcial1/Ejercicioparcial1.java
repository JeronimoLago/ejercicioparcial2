package ejercicioparcial1;

import javax.swing.*;

class Ejercicioparcial1 {

	public static void main(String[] args) {
        String mes;
		int dia;

		mes = (String)JOptionPane.showInputDialog(null,"Ingresa tu mes de nacimiento \nPor ejemplo: Abril","Juego signos",JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicioparcial1.class.getResource("/img/unnamed.jpg")),null,null);
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu dia de nacimiento"));

		if (mes.equalsIgnoreCase("enero")) {
			if (dia >= 21) {
				JOptionPane.showMessageDialog(null, "Tu signo es acuario");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es capricornio");
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al ingresar tus datos");
		}
		if (mes.equalsIgnoreCase("febrero")) {
			if (dia >= 19) {
				JOptionPane.showMessageDialog(null, "Tu signo es piscis");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es acuario");
			}
			
		}
		if (mes.equalsIgnoreCase("marzo")) {
			if (dia >= 21) {
				JOptionPane.showMessageDialog(null, "Tu signo es aries");
			} else{
				JOptionPane.showMessageDialog(null, "Tu signo es piscis");
			}
			
		}
		if (mes.equalsIgnoreCase("abril")) {
			if (dia >= 21) {
				JOptionPane.showMessageDialog(null, "Tu signo es tauro");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es aries");
			}
			
		}
		if (mes.equalsIgnoreCase("mayo")) {
			if (dia >= 22) {
				JOptionPane.showMessageDialog(null, "Tu signo es Geminis");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es tauro");
			}
			
		}
		if (mes.equalsIgnoreCase("junio")) {
			if (dia >= 22) {
				JOptionPane.showMessageDialog(null, "Tu signo es Cancer ");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Geminis");
			}
			
		}
		if (mes.equalsIgnoreCase("julio")) {
			if (dia >= 23) {
				JOptionPane.showMessageDialog(null, "Tu signo es Leo");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Cancer");
			}
			
		}
		if (mes.equalsIgnoreCase("agosto")) {
			if (dia >= 24) {
				JOptionPane.showMessageDialog(null, "Tu signo es Virgo");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Leo");
			}
			
		}
		if (mes.equalsIgnoreCase("septiembre")) {
			if (dia >= 24) {
				JOptionPane.showMessageDialog(null, "Tu signo es Libra");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Virgo");
			}
			
		}
		if (mes.equalsIgnoreCase("octubre")) {
			if (dia >= 24) {
				JOptionPane.showMessageDialog(null, "Tu signo es Escorpio");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Libra");
			}
			
		}
		if (mes.equalsIgnoreCase("noviembre")) {
			if (dia >= 23) {
				JOptionPane.showMessageDialog(null, "Tu signo es Sagitario");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Escorpio");
			}
			
		}
		if (mes.equalsIgnoreCase("diciembre")) {
			if (dia >= 22) {
				JOptionPane.showMessageDialog(null, "Tu signo es Capricornio");
			} else {
				JOptionPane.showMessageDialog(null, "Tu signo es Sagitario");
			}
			
		}
		
	}

}
