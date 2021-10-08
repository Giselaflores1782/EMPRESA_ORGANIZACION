package estructura.empresa.paraiso.srl;

public class Empleado {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer edad;
	private String estado;
	private String categoria;
	private Integer agno;
	private Integer mes;
	private Integer dia;
	private Integer id;
	
	
	public Empleado(String nombre, String apellido, Integer dni, Integer edad, String estado, String categoria, Integer agno, Integer mes, Integer dia) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.edad=edad;
		this.estado=estado;
		this.categoria=categoria;
		this.agno=agno;
		this.mes=mes;
		this.dia=dia;
		
		
	}

}
