import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventana {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Ventana con Botones");

        // Configurar el cierre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer el tamaño de la ventana
        ventana.setSize(300, 200);

        // Crear los botones
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");

        // Establecer la posición y tamaño de los botones
        boton1.setBounds(50, 50, 100, 30);
        boton2.setBounds(50, 90, 100, 30);
        boton3.setBounds(50, 130, 100, 30);

        // Crear las etiquetas
        JLabel etiqueta1 = new JLabel("Texto 1");
        JLabel etiqueta2 = new JLabel("Texto 2");

        // Establecer la posición y tamaño de las etiquetas
        etiqueta1.setBounds(160, 50, 100, 30);
        etiqueta2.setBounds(160, 90, 100, 30);

        // Agregar los botones y etiquetas a la ventana
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(etiqueta1);
        ventana.add(etiqueta2);

        // Configurar la ventana para utilizar un layout nulo
        ventana.setLayout(null);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}