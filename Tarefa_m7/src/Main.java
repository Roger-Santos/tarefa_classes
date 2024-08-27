/**
 * @author Roger Santos
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeronave kc = new Aeronave("Embraer", "KC390", 2024);
		
		System.out.print(kc.toString());	
		
		kc.ligarAeronave();
		kc.acelerar(200);
		kc.decolar();
		kc.acelerar(400);
		
		System.out.print(kc.toString());	
	}
}
