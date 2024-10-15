package proyectoConsecionaria.main;
/* PRODUCCION DE AUTOMOBILES Y MOTOS
 * 	situacion : una aplicacion para una fabrica que produce coches y motos.
 * cada tipo de vehiculo (coches y motos) tiene digerentes configuraciones, como el 
 * motor las ruedas y la carroceria 
 * ¿Como agregar un nuevo tipo de vehiculo?  */
public class Main {

	public static void main(String[] args) {
	
		AbstracFactory fabricaAutos = new AutosFactory();
		Motor motorAuto =  fabricaAutos.crearMotor();
		Ruedas ruedasAuto=  fabricaAutos.crearRuedas();
		Carroceria carroceriaAuto = fabricaAutos.crearCarroceria();
		System.out.println("-----AUTOS DATOS CONSECIONARIA---------");
		//motorAuto.tamanioMotor();
		System.out.print(motorAuto.tamanioMotor());
		System.out.print(ruedasAuto.cantidadRuedas());
		System.out.print(carroceriaAuto.colorCarroceria());
		
		AbstracFactory fabricaMotos = new MotoFactory();
		Motor motorMoto = fabricaMotos.crearMotor();
		Ruedas ruedasMoto=    fabricaMotos.crearRuedas();
		Carroceria carroceriaMoto =   fabricaMotos.crearCarroceria();
		System.out.println("\n------MOTOS DATOS CONSECIONARIA-----");
		System.out.print(motorMoto.tamanioMotor());
		System.out.print(ruedasMoto.cantidadRuedas());
		System.out.print(carroceriaMoto.colorCarroceria());
		
	}

}
