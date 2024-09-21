package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author charls
 */
public class Controlador implements ActionListener{
    //Importamos la vista que se controla desde aqui
    private Vista vista;
    private Modelo modelo;
    
    //Constructor de controlador

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.botonSumar.addActionListener(this);
    }

    
    public void iniciar(){
    vista.setTitle("MVC sumar");
    vista.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
        modelo.sumar();
        vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
 }
    
}