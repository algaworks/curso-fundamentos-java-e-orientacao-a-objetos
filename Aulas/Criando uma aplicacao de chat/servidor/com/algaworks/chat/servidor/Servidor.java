package com.algaworks.chat.servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.chat.servidor.thread.Conexao;

public class Servidor {

	private List<Conexao> conexoes = new ArrayList<>();
	
	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		try (ServerSocket server = new ServerSocket(3333)) {
		
			while (true) {
				System.out.println("Aguardando conexões...");
				Socket socket = server.accept();
				
				Conexao conexao = new Conexao(socket, servidor);
				new Thread(conexao).start();
				
				servidor.conexoes.add(conexao);
				System.out.println("Cliente conectado.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enviarMensagensClientes(String msg) {
		for (Conexao conexao : this.conexoes) {
			conexao.enviarMensagem(msg);
		}
	}
	
}
