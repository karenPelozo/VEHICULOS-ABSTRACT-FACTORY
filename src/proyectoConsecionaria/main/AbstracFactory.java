package proyectoConsecionaria.main;

public interface AbstracFactory {
	public Motor crearMotor();
	public Ruedas crearRuedas();
	public Carroceria crearCarroceria();
}
