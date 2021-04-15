package com.globant;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class Ejercicio {
    

        /**
         * Rigorous Test xyz :-)
         */

        @BeforeSuite
        public void cuentaEspnCreada() {
            System.out.println("Poseer Cuenta ESPN");
        }

        @BeforeMethod
        public void ingresarUseryPass(){
            System.out.println("Abrir el Navegador: https://www.espn.com/?src=com&adblock=true");
            System.out.println("Ingresar con usuario y contraseña");

        }
        @AfterMethod
        public void finalDePrueba(){
            System.out.println("Cerrar Navegador");
            System.out.println("-------------------------");
        }
        private void clicInciarSesion (){
            System.out.println("clic en iniciar sesion");
        }

        @Test(priority=0)
        public void iniciarSesion()
        {
            clicInciarSesion();
            assertTrue( true );
            System.out.println("Iniciar Sesion");
        }
        @Test (priority=1)
        public void cerrarSesion()
        {
            clicInciarSesion();
            assertTrue( true );
            System.out.println("Cerrar Sesion");
        }
        @Test(priority=2)
        public void desactivarSesion()
        {
            clicInciarSesion();
            assertTrue( true );
            System.out.println("Clic en ESPN Profile");
            System.out.println("Clic en Delete Account");
            System.out.println("Seleccionar YES,delete this account");
        }

    }
}
