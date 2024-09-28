import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Posicionamiento5 extends JFrame {
    public static void main(String[] args) {
        new Posicionamiento5();
    }
    public Posicionamiento5(){
        super("Posicionamiento5");
        new FlowLayout();

        /**********************/
        /********Colors********/
        /**********************/

        Color colorVerdeC = new Color(76,235,169);
        Color colorVerdeO = new Color(56,120,0);
        Color colorAzul = new Color(1, 80, 159);
        Color colorMarron = new Color(202, 158, 97);
        Color colorRosa = new Color(240, 0, 255);
        Color colorRojo = new Color(254, 0,0);
        Color colorNaranja = new Color(255,109,0);



        /**********************/
        /********Border********/
        /**********************/

        Border whiteBorderMargin = BorderFactory.createLineBorder(Color.WHITE, 10);
        Border whiteBorderMarginLeftRight = BorderFactory.createMatteBorder(0,10,0,10,Color.WHITE);


        /***********************/
        /********JPanels********/
        /***********************/

        //Layout
        GridBagLayout gblMain = new GridBagLayout();
        GridBagLayout gblIzq = new GridBagLayout();
        GridBagLayout gblDer = new GridBagLayout();
        GridBagLayout gblInf = new GridBagLayout();
        GridBagLayout gblInfIzq = new GridBagLayout();

        //Constraints
        GridBagConstraints gbc = new GridBagConstraints();


        JPanel main = new JPanel(gblMain);

        //1º Level
        JPanel izq = new JPanel(gblIzq);
        JPanel der = new JPanel(gblDer);

        //2º Level
        JPanel inf = new JPanel(gblInf);
        inf.setOpaque(true);
        inf.setBackground(Color.WHITE);

        //3º Nivel
        JPanel infIzq = new JPanel(gblInfIzq);


        //Colores
        JPanel verdeC = new JPanel(gblInfIzq);
        verdeC.setOpaque(true);
        verdeC.setBackground(colorVerdeC);
        verdeC.setBorder(whiteBorderMargin);

        JPanel verdeO = new JPanel(gblInfIzq);
        verdeO.setOpaque(true);
        verdeO.setBackground(colorVerdeO);
        verdeO.setBorder(whiteBorderMargin);

        JPanel azul = new JPanel(gblInfIzq);
        azul.setOpaque(true);
        azul.setBackground(colorAzul);
        azul.setBorder(whiteBorderMargin);

        JPanel marron = new JPanel(gblInfIzq);
        marron.setOpaque(true);
        marron.setBackground(colorMarron);
        marron.setBorder(whiteBorderMargin);

        JPanel rosa = new JPanel(gblInfIzq);
        rosa.setOpaque(true);
        rosa.setBackground(colorRosa);
        rosa.setBorder(whiteBorderMargin);

        JPanel rojo = new JPanel(gblInfIzq);
        rojo.setOpaque(true);
        rojo.setBackground(colorRojo);
        rojo.setBorder(whiteBorderMargin);

        JPanel naranja = new JPanel(gblInfIzq);
        naranja.setOpaque(true);
        naranja.setBackground(colorNaranja);
        naranja.setBorder(whiteBorderMargin);

        /*********************/
        /*********ADDs********/
        /*********************/


        gbc.fill = GridBagConstraints.BOTH;
        //GridBagConstraints 4º Nivel
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 3;
        gbc.gridy = 0;
        infIzq.add(rojo, gbc);

        gbc.weighty = 7;
        gbc.gridy = 3;
        infIzq.add(naranja, gbc);


        //GridBagConstraints 3º Nivel
        gbc.weightx = 3;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        inf.add(infIzq, gbc);

        gbc.weightx = 7;
        gbc.gridx = 3;
        inf.add(rosa, gbc);


        //GridBagConstraints 2º Nivel Izq
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        izq.add(verdeC, gbc);

        gbc.weighty = 1;
        gbc.gridy = 1;
        izq.add(inf, gbc);


        //GridBagConstraints 2º Nivel Der
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 2;
        gbc.gridy = 0;
        der.add(verdeO, gbc);

        gbc.weighty = 7;
        gbc.gridy = 2;
        der.add(azul, gbc);

        gbc.weighty = 1;
        gbc.gridy = 9;
        der.add(marron, gbc);


        //GridBagConstraints 1º nivel
        gbc.weightx = 7;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        main.add(izq,gbc);

        gbc.weightx = 3;
        gbc.gridx = 7;
        main.add(der, gbc);

        add(main);


        /***********************/
        /*********Window********/
        /***********************/

        this.setSize(600, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}