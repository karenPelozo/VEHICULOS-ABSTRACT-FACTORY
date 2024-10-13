package proyectoConsecionaria.main;

public class CarroceriaAutoimpl implements Carroceria{

	@Override
	public String colorCarroceria() {
		System.out.print("\nEL COLOR DE LA CARROCERIA ES:");
		return "rojo";
	}

	@Override
	public boolean tienePuertas() {
		System.out.print("\nTIENE PUERTAS? :");
		return true;
	}

}
