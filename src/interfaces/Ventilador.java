package interfaces;


/* A sobrescrita (ou override) está diretamente relacionada à orientação a objetos, 
mais especificamente com a herança. Com a sobrescrita, conseguimos especializar os métodos herdados 
das superclasses, 
alterando o seu comportamento nas subclasses por um mais específico.
*/

public class Ventilador implements IEletronico{
	private boolean ligado = false; 

	@Override
	public void ligar() {
		if(!this.ligado) {
			this.ligado = true;
			System.out.println("Liguei o aparelho...");
		}
		
	}
		

	@Override
	public void desligar() {
		if(this.ligado) {
			this.ligado = false;
			System.out.println("Desliguei o aparelho...");
		}
		
	}

}
