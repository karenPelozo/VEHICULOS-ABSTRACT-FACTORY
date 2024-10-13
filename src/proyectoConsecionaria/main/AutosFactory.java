package proyectoConsecionaria.main;

public class AutosFactory implements AbstracFactory{

	@Override
	public Motor crearMotor() {
		return new MotorAutoimpl();
	}

	@Override
	public Ruedas crearRuedas() {
		return new RuedasAutoimpl();
	}

	@Override
	public Carroceria crearCarroceria() {
		return new CarroceriaAutoimpl();
	}

}
