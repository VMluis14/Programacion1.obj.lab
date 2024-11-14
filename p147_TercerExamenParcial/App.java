package p147_TercerExamenParcial;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir ,smnAcercade;
    JDialog jdlAcercdade;
    JLabel lblDatos,lblNombre,lblEdad,lblSexo,lblEstadoivil,lblDescripcion,lblSalario;
    JTextField txtNombre,txtEdad,txtSexo,txtEstadoivil,txtDescripcion,txtSalario;
    JTable table;
    JScrollPane spane;
    DefaultTableModel modelo;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JButton btnAgregar, btnGrabar;
    JFileChooser fchArchivo; 

    public App(){
        super("Salarios de Jugadores de un equipo");
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);

        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);

        smnAbrir = new JMenuItem("Abrir");
        mnuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);

        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);

        mnuArchivo.add(new JSeparator());

        smnSalir = new JMenuItem("Salir");
        mnuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);

        smnAcercade = new JMenuItem("Acerca de...");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);

        
        jdlAcercdade = new JDialog(this,"Acerca de ...");
        jdlAcercdade.setSize(600,350);
        jdlAcercdade.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>PROGRAMACION ORIENTADA A OBJETOS 1<br> Carlos Castañeda Ramirez<br>castr@uaz.edu.mx </html>", JLabel.CENTER);
        lblDatos.setFont(new Font ("Times New Roman", Font.BOLD, 18));
        jdlAcercdade.add(lblDatos);

        setLayout(new GridLayout(3,1));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.BLACK);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"Nombre","Edad","Sexo","EstadoCivil","Descripcion","salario"});
        table.setModel(modelo);

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblSexo = new JLabel("Sexo");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        lblEstadoivil = new JLabel("EstadoCivil:");
        lblEstadoivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoivil = new JTextField();
        pnlDatos.add(lblEstadoivil);
        pnlDatos.add(txtEstadoivil);
        lblDescripcion = new JLabel("Descripcion");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblSalario = new JLabel("salario");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);
        

        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);


    }
    public void mostrarDatos(int ren){
        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString((datos.get(ren).getEdad())));
        txtSexo.setText(Character.toString(datos.get(ren).getSexo()));
        txtEstadoivil.setText(datos.get(ren).getEstadoCivil());
        txtDescripcion.setText(datos.get(ren).getDescripcion());
        txtSalario.setText(Double.toString(datos.get(ren).getSalario()));
    }
    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        while(dm.getRowCount()>0) dm.removeRow(0);
        Object[] obj = new Object[6];
        for(int i=0; i<datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getSexo();
            obj[3] = datos.get(i).getEstadoCivil();
            obj[4] = datos.get(i).getDescripcion();
            obj[5] = datos.get(i).getSalario();
            
            modelo.addRow(obj);
        }
    }
    public void activarCampos(Boolean actdes){
        for (Component cp : pnlDatos.getComponents())
        if(cp instanceof JTextField)
        cp.setEnabled(actdes);

    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
        if(cp instanceof JTextField)
        ((JTextField)cp).setText("");
    }
    public void guardarCampos() {
        Jugador est = new Jugador();
        est.setNombre(txtNombre.getText());
        est.setEdad( Integer.parseInt(txtEdad.getText() ));
        est.setSexo(txtSexo.getText().charAt(0));
        est.setEstadoCivil(txtEstadoivil.getText());
        est.setDescripcion(txtDescripcion.getText());
        est.setSalario(Double.parseDouble(txtSalario.getText()));
        datos.add(est);
        cargarDatos();
    }

    public void actionPerformed(ActionEvent e ){
        if(e.getSource() == smnSalir) dispose();
        else if(e.getSource()== smnAcercade) {
            jdlAcercdade.setVisible(true);
        }else if(e.getSource()==btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        }else if(e.getSource()==btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        } else if(e.getSource()== smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.grabarDatos(arch.getName(),datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                    arch.getName(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo",
                    "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                    File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.leerDatos(arch.getName());
                    this.cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(0,0,550,400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);


    }
    
}