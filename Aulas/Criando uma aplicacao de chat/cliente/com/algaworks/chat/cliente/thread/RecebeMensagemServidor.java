package com.algaworks.chat.cliente.thread;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

import com.algaworks.chat.cliente.gui.JanelaGui;

public class RecebeMensagemServidor implements Runnable {

	private Socket socket;
	private JanelaGui janela;

	public RecebeMensagemServidor(Socket socket, JanelaGui janela) {
		this.socket = socket;
		this.janela = janela;
	}

	@Override
	public void run() {
		while (true) {
			try {
				InputStream is = this.socket.getInputStream();
				DataInput dis = new DataInputStream(is);
				String msgRecebida = dis.readUTF();
				
				janela.adicionaMensagem(msgRecebida);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
