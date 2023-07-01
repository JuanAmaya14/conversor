package Paneles;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConvertirMoneda extends JFrame {
    private JButton convertirButton;
    private JTextField inputDinero;

    private JComboBox moneda1;
    private JComboBox moneda2;
    private JButton atrasButton;
    private JTextField outputDinero;
    private JPanel panel;

    public ConvertirMoneda() {


        inputDinero.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                double key = e.getKeyChar();

                boolean numeros = key >= 48 && key <= 57;
                boolean espacio = key == 32;

                if (!(espacio) && !(numeros))
                {
                    e.consume();
                }
            }
        });
    }

    public static void main(String[] args) {
        ConvertirMoneda pantalla = new ConvertirMoneda();

        pantalla.setContentPane(new ConvertirMoneda().panel);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setVisible(true);
        pantalla.pack();

    }

}




