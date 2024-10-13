package proyectoConsecionaria.main;

public class CarroceriaMotoimpl implements Carroceria{

	@Override
	public String colorCarroceria() {
		System.out.print("\nEL COLOR DE LA CARROCERIA ES:");
		return "azul";
	}

	@Override
	public boolean tienePuertas() {
		System.out.println("\nTIENE PUERTAS? :");
		return false;
	}

}
