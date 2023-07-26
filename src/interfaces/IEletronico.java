package interfaces;

/*
  Uma interface pode conter:
  - Constantes;
  - Métodos abstratos
 
 Interface para servir de contrato  para produtos eletrônicos. Todo produto eletrônico que
implementar esta interface OBRIGATORIAMENTE implementar os métodos abstratos;

 As constantes costumam ser definidas com todas as letras em maiúsculas;
*/
public interface IEletronico {
	
	public String MARCA = "Oliv"; // Constante
	
	public void ligar ();
	
	public void desligar ();
	 
}
