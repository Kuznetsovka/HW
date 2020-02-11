package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyWindow extends JFrame {
    public static int LENGTH_MIN = 1;
    public static int LENGTH_MAX = 30;

    public MyWindow() {
        super("Окно генерации пароля!");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 200);
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JLabel labelIN = new JLabel("Введите длину пароля");
        JLabel labelOUT = new JLabel("Ваш пароль");
        JButton button = new JButton("Button");
        JTextField text = new JTextField(5);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        panel1.add(labelIN, BorderLayout.CENTER);
        panel2.add(text, BorderLayout.AFTER_LAST_LINE);
        panel3.add(button, BorderLayout.EAST);
        panel4.add(labelOUT, BorderLayout.WEST);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        setVisible(true);
        button.addActionListener(e -> {
            Integer lengthPassword = tryParseInt(text.getText());
            passwordNulled(labelOUT);
            if (lengthPassword == null) {
                JOptionPane.showMessageDialog(null, "Введите число от 1 до 30!!!");
                textNulled(text);
            } else if(lengthPassword <= 0) {
                JOptionPane.showMessageDialog(null, "Введите число больше 0!!!");
                textNulled(text);
            } else if (lengthPassword > 30) {
                JOptionPane.showMessageDialog(null, "Введите число меньше 30!!!");
                textNulled(text);
            } else {
                labelOUT.setText("Ваш пароль: " + Generate(text));
            }
        });
    }

    private void textNulled(JTextField text) {
        text.setText("");
    }

    private void passwordNulled(JLabel labelOUT) {
        labelOUT.setText("Ваш пароль:");
    }

    private Integer tryParseInt(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private String Generate(JTextField text) {
        int lengthPassword = Integer.parseInt(text.getText());
        return RardomPas(lengthPassword);
    }

    private String RardomPas(int lengthPassword) {
        StringBuilder word =  new StringBuilder("abcdefghijklmnopqrstuvwxyz1234567890");
        StringBuilder str = new StringBuilder();
        while (str.length() < lengthPassword) {
            str.append(word.charAt(RandomSize(word.length())));
        }
        return String.valueOf(str);
    }

    private int RandomSize(int length) {
        Random Randomize = new Random();
        return Randomize.nextInt(length);
    }
}
