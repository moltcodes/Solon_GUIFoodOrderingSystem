import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food extends JFrame {
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton button1;
    private JPanel jpanel;

    double price = 0;

    public Food(){
        JRadioButton btngrp[] = {rbNone, rb5, rb10, rb15};
        JCheckBox cbgrp[] = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        rbNone.setSelected(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                for(JCheckBox cb: cbgrp){
                    if(cb.isSelected()){
                        if(cb == cPizza){
                            price += 100;
                        }else if(cb == cBurger){
                            price += 80;
                        }else if(cb == cFries){
                        price += 65;
                        }else if(cb == cSoftDrinks){
                            price += 55;
                        }else if(cb == cTea){
                            price += 50;
                        }else if(cb == cSundae){
                            price+= 40;
                        }
                    }
                }

                for(JRadioButton rb: btngrp){
                    if(rb.isSelected()){
                        if(rb == rbNone){
                            price += 0;
                        }else if(rb == rb5){
                            price -= price * 0.05;
                        }else if(rb == rb10){
                            price -= price * 0.1;
                        }else if(rb == rb15){
                            price -= price * 0.15;
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "The total price is "+ price);
                price = 0;
            }
        });
    }

    public static void main(String[] args) {
        Food app = new Food();
        app.setContentPane(app.jpanel);
        app.setSize(500, 400);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}


