import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
		
		JOptionPane.showMessageDialog(null, "Atenção - e-mail não informado.", "Atenção"
				, JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro"
				, JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
		
		URL url = ExemploJOptionPane2.class.getResource("algaworks.png");
		Icon icone = new ImageIcon(url);
		
		JOptionPane.showMessageDialog(null, "Obrigado por escolher a AlgaWokrs", "AlgaWorks"
				, JOptionPane.INFORMATION_MESSAGE, icone);
		
	}
	
}
