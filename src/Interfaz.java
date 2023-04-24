import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JTabbedPane Ventana;
    private JPanel Principal;
    private JTextField IDtextField1;
    private JTextField prioridadtextField2;
    private JTextField NombretextField4;
    private JButton crearPacienteButton;
    private JTextArea busquedaPacientestextArea;
    private JButton buscarIDButton;
    private JButton buscarPrioridad50Button;
    private JTextField busquedaIDtextField;
    private JTextArea datosPredeterminadostextArea;
    private JButton agregarDatosPredefinidosButton;
    private JButton activarSiguienteButton;
    private JButton activarTodosButton;
    private JButton eliminarCabezaButton;
    private JButton eliminarTodosButton;
    private JTextArea pacientesActivostextArea;
    private JButton button9;
    private JButton restaurarÚltimoButton;
    private JButton restaurarTodosButton;
    private JTextField AmigostextField;
    private JComboBox comboBox1;
    private JTextField EdadtextField1;

    public Interfaz() {
        SocialNetwork Social = new SocialNetwork();

        agregarDatosPredefinidosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Social.DatosPredefinidos();
            }
        });
        crearPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Social.AgregarPaicente();
            }
        });
    }

    public JPanel getPrincipal() {
        return Principal;
    }

    public Persona CrearPaciente(){
        int id = Integer.parseInt(IDtextField1.getText());
        String Nombre = NombretextField4.getText();
        int edad = Integer.parseInt(EdadtextField1.getText());
        int prioridad = Integer.parseInt(prioridadtextField2.getText());
        int amigos = Integer.parseInt(AmigostextField.getText());
        Persona p = new Persona( id,  Nombre,  edad,  prioridad,  amigos);
        return p;
    }

    private void ImprimirDatosPref() {
        /*datosPredeterminadostextArea.setText(.toString());
        JOptionPane.showMessageDialog(null, "Datos predefinidos agregados a cola");*/
    }
}
