import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadoraBasica  extends  JFrame{
    private JPanel panel1;
    private JButton suma;
    private JButton restaButton;
    private JButton multiplicacionButton;
    private JButton divisionButton;
    private JButton raizButton;
    private JButton potenciaButton;
    private JButton porcentajeButton;
    private JButton senoButton;
    private JButton cosenoButton;
    private JButton tangenteButton;
    private JButton arcotangenteButton;
    private JButton secanteButton;
    private JButton cosecanteButton;
    private JButton cButton;
    private JButton cambioDeSignoButton;
    private JTextField val1;
    private JTextField val2;
    private JTextField Resultado;
    private JLabel d;

    public calculadoraBasica(){

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                val2.getText();
                double numero1=Integer.parseInt(val1.getText());
                double numero2=Integer.parseInt(val2.getText());
                double suma=numero1+numero2;
                Resultado.setText(String.valueOf(suma));
            }

        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                val2.getText();
                double numero1=Integer.parseInt(val1.getText());
                double numero2=Integer.parseInt(val2.getText());
                double resta=numero1-numero2;
                Resultado.setText(String.valueOf(resta));
            }
        });

        cambioDeSignoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                double numero1=Integer.parseInt(val1.getText());
                double cambio=numero1*(-1);
                Resultado.setText(String.valueOf(cambio));
            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                val2.getText();
                double numero1=Integer.parseInt(val1.getText());
                double numero2=Integer.parseInt(val2.getText());
                double multiplicacion=numero1*numero2;
                Resultado.setText(String.valueOf(multiplicacion));

            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                val2.getText();
                double numero1=Integer.parseInt(val1.getText());
                double numero2=Integer.parseInt(val2.getText());
                double division=numero1/numero2;
                Resultado.setText(String.valueOf(division));
            }
        });
        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                double numero1=Integer.parseInt(val1.getText());
                double raiz=Math.sqrt(numero1);
                Resultado.setText(String.valueOf(raiz));
            }
        });
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                val2.getText();
                double numero1=Integer.parseInt(val1.getText());
                double numero2=Integer.parseInt(val2.getText());
                double potencia=Math.pow(numero1,numero2);
                Resultado.setText(String.valueOf(potencia));
            }
        });
        porcentajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        senoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();

                double numero1=Integer.parseInt(val1.getText());

                double seno=Math.sin(numero1);
                Resultado.setText(String.valueOf(seno));
            }
        });
        cosenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();
                double numero1=Integer.parseInt(val1.getText());
                double coseno=Math.cos(numero1);
                Resultado.setText(String.valueOf(coseno));
            }
        });
        tangenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();

                double numero1=Integer.parseInt(val1.getText());

                double tangente=Math.tan(numero1);
                Resultado.setText(String.valueOf(tangente));
            }
        });
        arcotangenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();

                double numero1=Integer.parseInt(val1.getText());

                double arcotangente=Math.atan(numero1);
                Resultado.setText(String.valueOf(arcotangente));
            }
        });
        secanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();

                double numero1=Integer.parseInt(val1.getText());

                double secante=Math.asin(numero1);
                Resultado.setText(String.valueOf(secante));

            }
        });
        cosecanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.getText();

                double numero1=Integer.parseInt(val1.getText());

                double cosecante=Math.acos(numero1);
                Resultado.setText(String.valueOf(cosecante));

            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            val1.setText("");
            val2.setText("");
                
            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel1);
    }
}
