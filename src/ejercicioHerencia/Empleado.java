
package ejercicioHerencia;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private double Salario;

    public Empleado(double Salario, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }
     public void mostrarEmpleado (){
        JOptionPane.showMessageDialog(null, "el nombre es: "+getNombre()+
                " \n la edad es: "+getEdad()+
                "\n su salario es: "+getSalario());
    }
}
