package com.algaworks.chat.cliente.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public abstract class JanelaGui {

	private String nomeAplicacao = "AlgaWorks - Chat";
    private JFrame chatFrame = new JFrame(nomeAplicacao);
    private JButton enviarMensagemButton;
    private JTextField mensagemTextField;
    private JTextArea chatArea;
    private JTextField nomeTextField;
    private JFrame nomeUsuarioFrame;
    private String username;
	
	public JanelaGui() {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}

				solicitarNomeUsuario();
			}
		});
	}
	
	protected void solicitarNomeUsuario() {
		chatFrame.setVisible(false);
        nomeUsuarioFrame = new JFrame(nomeAplicacao);
        nomeUsuarioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nomeTextField = new JTextField(9);
        JLabel escolherNomeLabel = new JLabel("Informe seu nome:");
        JButton acessarServidorButton = new JButton("Entrar no chat");
        acessarServidorButton.addActionListener(new AcessarServidorButtonListener());
        JPanel nomeUsuarioPanel = new JPanel(new GridBagLayout());

        GridBagConstraints preRight = new GridBagConstraints();
        preRight.insets = new Insets(0, 0, 0, 20);
        preRight.anchor = GridBagConstraints.EAST;
        GridBagConstraints preLeft = new GridBagConstraints();
        preLeft.anchor = GridBagConstraints.WEST;
        preLeft.insets = new Insets(0, 10, 0, 10);
        preRight.fill = GridBagConstraints.HORIZONTAL;
        preRight.gridwidth = GridBagConstraints.REMAINDER;

        nomeUsuarioPanel.add(escolherNomeLabel, preLeft);
        nomeUsuarioPanel.add(nomeTextField, preRight);
        nomeUsuarioFrame.add(BorderLayout.CENTER, nomeUsuarioPanel);
        nomeUsuarioFrame.add(BorderLayout.SOUTH, acessarServidorButton);
        nomeUsuarioFrame.setSize(300, 300);
        nomeUsuarioFrame.setVisible(true);
	}
	
    class AcessarServidorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            username = nomeTextField.getText();
            if (username.length() < 1) {
            	JOptionPane.showMessageDialog(null, "Informe um nome de usuário.", "Atenção"
        				, JOptionPane.WARNING_MESSAGE);
            } else {
            	if (conectar()) {
            		nomeUsuarioFrame.setVisible(false);
            		mostrarJanelaChat();
            	} else {
            		JOptionPane.showMessageDialog(null, "Erro conectando ao servidor.", "Erro"
            				, JOptionPane.ERROR_MESSAGE);
            	}
            }
        }
    }
    
    public void mostrarJanelaChat() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.GRAY);
        southPanel.setLayout(new GridBagLayout());

        mensagemTextField = new JTextField(30);
        mensagemTextField.addActionListener(new EnviarMensagemListener());

        enviarMensagemButton = new JButton("Enviar");
        enviarMensagemButton.addActionListener(new EnviarMensagemListener());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Serif", Font.PLAIN, 15));
        chatArea.setLineWrap(true);

        mainPanel.add(new JScrollPane(chatArea), BorderLayout.CENTER);

        GridBagConstraints left = new GridBagConstraints();
        left.anchor = GridBagConstraints.LINE_START;
        left.fill = GridBagConstraints.HORIZONTAL;
        left.weightx = 512.0D;
        left.weighty = 1.0D;

        GridBagConstraints right = new GridBagConstraints();
        right.insets = new Insets(0, 10, 0, 0);
        right.anchor = GridBagConstraints.LINE_END;
        right.fill = GridBagConstraints.NONE;
        right.weightx = 1.0D;
        right.weighty = 1.0D;

        southPanel.add(mensagemTextField, left);
        southPanel.add(enviarMensagemButton, right);

        mainPanel.add(BorderLayout.SOUTH, southPanel);

        chatFrame.add(mainPanel);
        chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatFrame.setSize(470, 300);
        chatFrame.setVisible(true);
        mensagemTextField.requestFocusInWindow();
    }

    class EnviarMensagemListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (mensagemTextField.getText().length() < 1) {
                // não faz nada
            } else {
            	String msg = "<" + username + ">:  " + mensagemTextField.getText() + "\n";
            	sendMessage(msg);
            	
                mensagemTextField.setText("");
            }
            
            mensagemTextField.requestFocusInWindow();
        }
    }
    
    protected String getUsername() {
    	return this.username;
    }
    
    public void adicionaMensagem(String mensagem) {
    	if (chatArea != null) {
    		chatArea.append(mensagem);
    	}
    }
    
    protected abstract boolean conectar();
    
    protected abstract void sendMessage(String mensagem);
	
}
