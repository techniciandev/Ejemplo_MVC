package ejemplo_mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author charls
 */
public class Ejemplo_MVC {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
        
        controlador.iniciar();
        vista.setVisible(true);
     
    }
    
} 
/*
MVC, que significa Modelo-Vista-Controlador, es un patrón de diseño de software utilizado 
para estructurar aplicaciones, separando la lógica de negocio de la interfaz de usuario. 
Este patrón se compone de tres componentes principales:
Modelo: Maneja los datos y la lógica de negocio.
Vista: Se encarga de la presentación y la interfaz gráfica.
Controlador: Actúa como intermediario entre el modelo y la vista, gestionando las entradas
del usuario y actualizando el modelo y la vista en consecuencia.
La separación proporcionada por MVC facilita el mantenimiento y 
la escalabilidad de las aplicaciones, permitiendo que los cambios en una 
parte del sistema no afecten directamente a las otras.
*/