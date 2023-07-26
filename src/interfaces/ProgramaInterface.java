package interfaces;


//Interfaces são conhecidas como 'contratos'
public class ProgramaInterface {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();		
		
		System.out.println("Amarca desse ventilador é: " + vent.MARCA);
		
		vent.desligar(); // Não deve imprimir a mensagem
		
		vent.ligar(); // Deve imprimir a mensagem
		
		vent.desligar(); // Deve imprimir a mensagem

	}

}
