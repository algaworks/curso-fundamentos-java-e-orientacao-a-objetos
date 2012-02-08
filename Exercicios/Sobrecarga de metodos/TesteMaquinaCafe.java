class TesteMaquinaCafe {
	
	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
		
		maquina.fazerCafe(10);
		maquina.fazerCafe(15);
		
		// faz cafe com a quantidade de açúcar padrão
		// não será possível fazer esse cafezinho, pois a máquina
		// só tinha 30gr de açúcar disponível
		maquina.fazerCafe();
	}
	
}