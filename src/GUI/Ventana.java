/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.Aritmetica.Aritmetica;
import AbstractFactory.Convertir.Convertir;
import Main.AbstractFactory;
import Main.FactoryProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author soporte
 */
public class Ventana extends JPanel {

    public int WIDTH = 520, widthTF = 200, widthB = 75;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2;
    private String w = "";
    private int v, g = 0;
    private double dato = 0.0;

    public JButton button;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;

    public JButton button10;
    public JButton button11;
    public JButton button12;
    public JButton button13;
    public JButton button14;
    public JButton button15;
    public JButton button16;
    public JButton button17;

    public JButton button18;
    public JButton button19;

    public Ventana() {
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(30, 40, widthTF, heightTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(290, 40, widthTF, heightTF));
//-------------------------------------- Botones de los numeros ----------------------------------------------------------------

        button = new JButton("1");
        button.setBounds(new Rectangle(10, 100, widthB, heightB));

        button1 = new JButton("2");
        button1.setBounds(new Rectangle(90, 100, widthB, heightB));

        button2 = new JButton("3");
        button2.setBounds(new Rectangle(170, 100, widthB, heightB));

        button3 = new JButton("4");
        button3.setBounds(new Rectangle(10, 135, widthB, heightB));

        button4 = new JButton("5");
        button4.setBounds(new Rectangle(90, 135, widthB, heightB));

        button5 = new JButton("6");
        button5.setBounds(new Rectangle(170, 135, widthB, heightB));

        button6 = new JButton("7");
        button6.setBounds(new Rectangle(10, 170, widthB, heightB));

        button7 = new JButton("8");
        button7.setBounds(new Rectangle(90, 170, widthB, heightB));

        button8 = new JButton("9");
        button8.setBounds(new Rectangle(170, 170, widthB, heightB));

        button9 = new JButton("0");
        button9.setBounds(new Rectangle(90, 205, widthB, heightB));

//------------------------------------------------ Botones de operaciones -------------------------------------------
        button10 = new JButton("+");
        button10.setBounds(new Rectangle(275, 100, widthB, heightB));

        button11 = new JButton("-");
        button11.setBounds(new Rectangle(355, 100, widthB, heightB));

        button12 = new JButton("*");
        button12.setBounds(new Rectangle(435, 100, widthB, heightB));

        button13 = new JButton("/");
        button13.setBounds(new Rectangle(355, 135, widthB, heightB));

        button14 = new JButton("Bin");
        button14.setBounds(new Rectangle(275, 170, widthB, heightB));

        button15 = new JButton("Dec");
        button15.setBounds(new Rectangle(355, 170, widthB, heightB));

        button16 = new JButton("Octal");
        button16.setBounds(new Rectangle(435, 170, widthB, heightB));

        button17 = new JButton("Hexa");
        button17.setBounds(new Rectangle(355, 205, widthB, heightB));

//--------------------------- Boton de igual y limpiar txt ----------------------------------------------
        button18 = new JButton("=");
        button18.setBounds(new Rectangle(150, 250, widthB, heightB));

        button19 = new JButton("AC");
        button19.setBounds(new Rectangle(290, 250, widthB, heightB));

        textF1.setEditable(false);
        textF2.setEditable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textF2.setText(textF1.getText());
            }
        });

        AbstractFactory fac1, fac2;
        fac1 = FactoryProducer.getFactory(1);
        fac2 = FactoryProducer.getFactory(2);

        button.addActionListener((ActionEvent s) -> {
            w = w + "1";
            textF1.setText(w);
        });

        button1.addActionListener((ActionEvent s) -> {
            w = w + "2";
            textF1.setText(w);
        });

        button2.addActionListener((ActionEvent s) -> {
            w = w + "3";
            textF1.setText(w);
        });

        button3.addActionListener((ActionEvent s) -> {
            w = w + "4";
            textF1.setText(w);
        });

        button4.addActionListener((ActionEvent s) -> {
            w = w + "5";
            textF1.setText(w);
        });

        button5.addActionListener((ActionEvent s) -> {
            w = w + "6";
            textF1.setText(w);
        });

        button6.addActionListener((ActionEvent s) -> {
            w = w + "7";
            textF1.setText(w);
        });

        button7.addActionListener((ActionEvent s) -> {
            w = w + "8";
            textF1.setText(w);
        });

        button8.addActionListener((ActionEvent s) -> {
            w = w + "9";
            textF1.setText(w);
        });

        button9.addActionListener((ActionEvent s) -> {
            w = w + "0";
            textF1.setText(w);
        });

        button10.addActionListener((ActionEvent s) -> {
            dato = Double.parseDouble(textF1.getText());
            w = "";
            v = 1;
        });

        button11.addActionListener((ActionEvent s) -> {
            dato = Double.parseDouble(textF1.getText());
            w = "";
            v = 2;
        });

        button12.addActionListener((ActionEvent s) -> {
            dato = Double.parseDouble(textF1.getText());
            w = "";
            v = 3;
        });

        button13.addActionListener((ActionEvent s) -> {
            dato = Double.parseDouble(textF1.getText());
            w = "";
            v = 4;
        });

        button14.addActionListener((ActionEvent s) -> {
            g = Integer.parseInt(textF1.getText());
            w = "";
            v = 5;
        });

        button15.addActionListener((ActionEvent s) -> {
            g = Integer.parseInt(textF1.getText());
            w = "";
            v = 6;
        });

        button16.addActionListener((ActionEvent s) -> {
            g = Integer.parseInt(textF1.getText());
            w = "";
            v = 7;
        });

        button17.addActionListener((ActionEvent s) -> {
            g = Integer.parseInt(textF1.getText());
            w = "";
            v = 8;
        });

        button19.addActionListener((ActionEvent s) -> {
            textF1.setText("");
            textF2.setText("");
            w = "";
            v = 9;
        });

        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent s) {
                switch (v) {
                    case 1:
                        Aritmetica Sum;
                        Sum = fac1.getAritmetica(1);
                        String Su = String.valueOf(Sum.resultado(dato, Double.valueOf(textF1.getText())));
                        textF2.setText(Su);
                        break;

                    case 2:
                        Aritmetica Res;
                        Res = fac1.getAritmetica(2);
                        String Re = String.valueOf(Res.resultado(dato, Double.valueOf(textF1.getText())));
                        textF2.setText(Re);
                        break;

                    case 3:
                        Aritmetica Mult;
                        Mult = fac1.getAritmetica(3);
                        String Mu = String.valueOf(Mult.resultado(dato, Double.valueOf(textF1.getText())));
                        textF2.setText(Mu);
                        break;

                    case 4:
                        Aritmetica Div;
                        Div = fac1.getAritmetica(4);
                        String Di = String.valueOf(Div.resultado(dato, Double.valueOf(textF1.getText())));
                        textF2.setText(Di);
                        break;

                    case 5:
                        Convertir Bin;
                        Bin = fac2.getConvertir(1);
                        String Bi = Bin.Convertir(g);
                        textF2.setText(Bi);
                        break;

                    case 6:
                        Convertir Deci;
                        Deci = fac2.getConvertir(4);
                        String De = Deci.Convertir(g);
                        textF2.setText(De);
                        break;

                    case 7:
                        Convertir Octal;
                        Octal = fac2.getConvertir(3);
                        String Oc = Octal.Convertir(g);
                        textF2.setText(Oc);
                        break;

                    case 8:                        
                        Convertir Hexa;
                        Hexa = fac2.getConvertir(2);
                        String He = Hexa.Convertir(g);
                        textF2.setText(He);
                        break;
                }
            }
        });

        add(textF1);
        add(textF2);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);

        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
        add(button17);

        add(button18);
        add(button19);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }

}
