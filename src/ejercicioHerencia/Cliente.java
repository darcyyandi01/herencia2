
package ejercicioHerencia;

import javax.swing.JOptionPane;

public class Cliente extends Persona {
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public Cliente(String direccion, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.direccion = direccion;
    }
    public void mostrarCliente (){
        JOptionPane.showMessageDialog(null, "el nombre es: "+getNombre()+
                " \n la edad es: "+getEdad()+
                "\n su dereccion es: "+getDireccion());
    }
}
