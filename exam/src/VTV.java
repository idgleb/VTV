import javax.swing.*;
import java.time.LocalDate;

public class VTV {
    private String placa;
    private boolean isMotorBien;
    private boolean isFrenosBien;
    private boolean isMSuspencionBien;
    private boolean isVTV;
    private LocalDate fechaDeVigenciaVTV;

    public VTV(String placa) {
        this.placa = placa;
    }

    public void revisarVehiculo(){
        int siNO = JOptionPane.showConfirmDialog (null, "Motor OK?", null, JOptionPane.YES_NO_OPTION);
        if (siNO == 1){
            this.isMotorBien = false;
        }else this.isMotorBien = true;

        siNO = JOptionPane.showConfirmDialog (null, "Frenos OK?", null, JOptionPane.YES_NO_OPTION);
        if (siNO == 1){
            this.isFrenosBien = false;
        }else this.isFrenosBien = true;

        siNO = JOptionPane.showConfirmDialog (null, "Suspencion OK?", null, JOptionPane.YES_NO_OPTION);
        if (siNO == 1){
            this.isMSuspencionBien = false;
        }else this.isMSuspencionBien = true;

        if (isMotorBien && isFrenosBien && isMSuspencionBien){
            this.fechaDeVigenciaVTV = LocalDate.now().plusYears(1);
        }
    }

    public void getReporte() {
        String motor = "";
        String frenos = "";
        String Suspencion = "";
        String VTV = "";
        String fecha = "";

        if (isMotorBien){
            motor = " Motor bien, ";
        }else motor = " Motor mal, ";

        if (isFrenosBien){
            frenos = " Frenos bien, ";
        }else frenos = " Frenos mal, ";

        if (isMSuspencionBien){
            Suspencion = " Suspencion bien, ";
        }else Suspencion = " Suspencion mal, ";

        if (isMotorBien&&isFrenosBien&&isMSuspencionBien){
            isVTV = true;
            VTV = "VTV Aprobado asta: ";
        }else VTV = "VTV No aprobado ";

        if (fechaDeVigenciaVTV!=null) fecha = fechaDeVigenciaVTV.toString();

        String reporte = placa + " - " + motor + frenos + Suspencion + VTV + fecha;

        JOptionPane.showMessageDialog(null,reporte);
    }

}
