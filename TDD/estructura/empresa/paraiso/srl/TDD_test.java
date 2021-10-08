package estructura.empresa.paraiso.srl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TDD_test {

	@Test
	public void SeCreaUnaClaseEmpleadoConElConstructor() {
		
		Empleado empleado1= new Empleado("Luis", "Gonzalez", 29394676, 39, "activo", "operario", 1956, 10, 25);
		assertNotNull(empleado1);
	}

}
