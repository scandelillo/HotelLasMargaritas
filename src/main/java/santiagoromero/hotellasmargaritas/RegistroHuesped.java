
package santiagoromero.hotellasmargaritas;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Usuario
 */

public class RegistroHuesped extends JFrame {
    
    
   public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        new RegistroHuesped().setVisible(true);
    });
}

    
    
    
    private final ArrayList<Huesped> listaHuespedes = new ArrayList<>();
    
    
    public RegistroHuesped(){
       
        setTitle("Registro de Huespedes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initUI();
          
    } 
    
    private void initUI(){
        
        JLabel lblNombre  = new JLabel("Nombre");
        JLabel lbldni = new JLabel("Documento");
        JLabel lblTelefono = new JLabel("Telefono"); 
        
        
        JTextField txtNombre = new JTextField(30);
        JTextField txtdni = new JTextField(30);
        JTextField txtTelefono = new JTextField(30);
        
        JButton btnGuardar = new JButton("guardar");
     
        btnGuardar.addActionListener((ActionEvent e) -> {
            String nombre = txtNombre.getText();
            String dni = txtdni.getText();
            String telefono = txtTelefono.getText();
            
            Huesped huesped = new Huesped(nombre, dni, telefono); // Creamos un objeto Huesped y lo añadimos a la lista
            listaHuespedes.add(huesped);
            
            JOptionPane.showMessageDialog(null, "Huésped guardado:\n" + huesped);// Mostramos un mensaje de confirmación
            
            txtNombre.setText(null);
            txtdni.setText(null);
            txtTelefono.setText(null);
        });
            
           

        

}
 
    
}//FinClase



