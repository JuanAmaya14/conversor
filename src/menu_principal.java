import javax.swing.*;

import static java.lang.System.exit;

public class menu_principal {

    public static void main(String[] args) {

        Object[] possibleValues = {"Conversor de monedas", "Conversor de temperatura"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleccione una opcion de conversion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        if (selectedValue != null) {

            System.out.println("no es null");

            if (selectedValue.equals("Conversor de monedas")) {

                System.out.println("primero");

            }

        } else {

            exit(0);

        }

    }

}
