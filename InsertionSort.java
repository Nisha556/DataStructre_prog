package Sorting_searching;

import javax.swing.*;
import java.awt.*;

public class InsertionSort extends JPanel {
    private int[] tab;
    private int i = 0, j = 0;

    private InsertionSort() {
        JFrame frame = new JFrame("BubbleSort");
        setPreferredSize(new Dimension(1280, 720));
        setBackground(Color.BLACK);
        frame.getContentPane().add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - frame.getWidth()) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - frame.getHeight()) / 2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tab = new int[getWidth()];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random() * getHeight());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        for (int i = 0; i < tab.length; i++) {
            g.drawLine(i, getHeight(), i, tab[i]);
        }
        if (i < tab.length) {
        	int tmp = tab[i];
        	int j = i-1;
            if (j >=0 && tab[j]>tmp) {
                 
                    //int tmp = tab[j];
                    tab[j+1] = tab[j];
                    j= j-1;
                    tab[j + 1] = tmp;
                    j++;  
               
            } 
            
            else {
                i++;
                j = 0;
            }
            repaint();
        } else {
            System.out.println("Finished!");
        }
    }

    public static void main(String[] args) {
        new InsertionSort();
    }
}
