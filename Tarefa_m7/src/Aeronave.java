/**
 * @author Roger Santos
 */
public class Aeronave {
	private String fabricante;
	private String modelo;
	private int anoFabricacao;
	private boolean ligado;
	private boolean emVoo;
	private int velocidade;

	/**
	 * 
	 * @return Retorna fabricante da aeronave
	 * @
	 */
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isEmVoo() {
		return emVoo;
	}

	public void setEmVoo(boolean emVoo) {
		this.emVoo = emVoo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar(int velocidade) {
		int velocidadeAtual = getVelocidade();
		setVelocidade(velocidadeAtual + velocidade);
	}
	
	public void ligarAeronave() {
		setLigado(true);
	}
	
	/**
	 * Define verdadeiro para a condição de estar em voo
	 */
	public void decolar() {
		setEmVoo(true);
	}
	
	@Override
	  public String toString() {
	    return getModelo() + " " + getAnoFabricacao() + " (" + getFabricante() + ")\n" 
	    		+ "Ligado: " + isLigado() + "\nEm voo: " + isEmVoo() 
	    		+ "\nVelocidade: " + getVelocidade() + "\n\n";
	  }

	public Aeronave(String fabricante, String modelo, int anoFabricacao) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.ligado = false;
		this.emVoo = false;
		this.velocidade = 0;
	}
	

	
	

}
