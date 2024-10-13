package proyectoConsecionaria.main;

public class MotoFactory implements AbstracFactory{

	@Override
	public Motor crearMotor() {
		return new MotorMotoimpl();
	}

	@Override
	public Ruedas crearRuedas() {
		return new RuedasMotoimpl();
	}

	@Override
	public Carroceria crearCarroceria() {
		return new CarroceriaMotoimpl();
	}

}
