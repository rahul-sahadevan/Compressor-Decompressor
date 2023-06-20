package GUI;

import Comp_Decomp.Compressor;
import Comp_Decomp.Decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

public class AppFrame implements ActionListener {

    JFrame f;

    JButton CompressButon;
    JButton DecpmressButton;

    AppFrame(){
        f = new JFrame("Compresor And Decompressor");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,500);
        f.getContentPane().setBackground(Color.yellow);
        f.setVisible(true);
        f.setLayout(null);


        JLabel text = new JLabel("Welcome To File Compressor");
        text.setFont(new Font("Osward",Font.BOLD,25));
        text.setBackground(Color.yellow);
        text.setBounds(200,40,400,40);
        f.add(text);

        f.setSize(800,480);
        f.setVisible(true);
        f.setLocation(275,150);




        CompressButon = new JButton("select file to compress");
        CompressButon.setSize(200,30);
        CompressButon.setLocation(100,150);
        f.add(CompressButon);
        CompressButon.addActionListener(this);

        DecpmressButton = new JButton("select file to decompress");
        DecpmressButton.setSize(200,30);
        DecpmressButton.setLocation(450,150);
        f.add(DecpmressButton);
        DecpmressButton.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CompressButon){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        if(e.getSource() == DecpmressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Decompressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }

    }

