
package ejercicioHerencia;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       String opciones =JOptionPane.showInputDialog("SELECCIONE UNA OPCIÓN \n"+
                                                     "1. AGREGAR EMPLEADO \n"+
                                                     "2. AGREGAR CLIENTE \n"+
                                                     "3. SALIR DEL PROGRAMA" );
       
       
       int opcion = Integer.parseInt(opciones);
         switch(opcion){
             case 1:
                  String nombre1= JOptionPane.showInputDialog("ingrese su nombre: ");
                  String aux1= JOptionPane.showInputDialog("ingrese su edad: ");
                  int edad1= Integer.parseInt(aux1);
                  String aux2= JOptionPane.showInputDialog("ingrese su salario: ");
                  double salario1 = Double.parseDouble(aux2);
                  Empleado empleado1 = new Empleado(salario1, nombre1, edad1);
                  empleado1.mostrarEmpleado();
                          break;
             case 2:
                  String nombre2= JOptionPane.showInputDialog("ingrese su nombre: ");
                  String aux3= JOptionPane.showInputDialog("ingrese su edad: ");
                  int edad2= Integer.parseInt(aux3);
                  String direccion1= JOptionPane.showInputDialog("ingrese su direccion: ");
                  Cliente cliente1 =new Cliente(direccion1, nombre2, edad2);
                  cliente1.mostrarCliente();
                
             case 3:
                 break;
         }
    }
    
}
