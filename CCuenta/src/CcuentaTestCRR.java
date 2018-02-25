import static org.junit.Assert.*;

import org.junit.Test;

public class CcuentaTestCRR {
		
		Ccuenta miCuenta=new Ccuenta("Ana","L�pez",3200,1);

		//1
		@Test
		public void CrearCuentaCRR(){
			assertNotNull(miCuenta);
		}
		
		//2
		@Test
		public void testSaldoCRR() {
			assertEquals(3200, Ccuenta.getSaldo(),0);
		}	
		
		//3
		@Test
		public void testIngresarPositivoCRR() throws Exception{
			miCuenta.ingresar(1000);
			assertEquals(4200,Ccuenta.getSaldo(),0);
			}
		//4
				@Test
				(expected=Exception.class)
				public void testIngresarCRR() throws Exception{
					miCuenta.ingresar(-600);
					assertEquals(3200, Ccuenta.getSaldo(),0);
					}
		//5
		@Test
		public void testRetirarCRR() throws Exception{
			miCuenta.retirar(1000);
			assertEquals(2200, Ccuenta.getSaldo(),0);
			}
		
		//6
		@Test
		(expected=Exception.class)
		public void testRetirarDemasidoCRR() throws Exception{
			miCuenta.retirar(4000);
			assertEquals(3200, Ccuenta.getSaldo(),0);
		}
	}

