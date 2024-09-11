import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        VTV vtv = null;

        int seleccion = 0;
        do {
            String[] opciones = {"revisarVehiculo", "getReporte", "Salir"};
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Ursol",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            switch (seleccion) {
                case 0:
                    String patente = JOptionPane.showInputDialog("Ingrese un patente");
                    vtv = new VTV(patente);
                    vtv.revisarVehiculo();
                    break;
                case 1:
                    if (vtv!=null){
                        vtv.getReporte();
                    }else JOptionPane.showMessageDialog(null, "No hay vehiculos, de primero pulsa <revisar>");
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }while (seleccion!=2);


    }
}
