package Sorting_searching;
import javax.swing.*;
import java.awt.*;

public class move extends JFrame {  
    private static int x[] = {4,8,7,10,2,6,7,8,10,20,19,7,10,8,6,9,4,1,4,2,6,7,8,4,11,2,12};    
    private int n=20;   
    private int m=630;
    private static Rectangle2D[] squares=new Rectangle2D[x.length];
    private static GPanel panel;    
    private JButton swap;
    private static boolean swapShape=false;
    private static int countPaint=0;

    public move(){
        super("Move shape");        
        this.setLayout(new FlowLayout());
        this.setSize(900,850);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new GPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(880,770));
        JButton swap=new JButton("Swap");
        swap.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSort(x,x.length);             
            }

        });
        add(swap);      
        add(panel);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void swap(int i, int j){
        swapShape=true; 
        double minH=squares[i].getMinX();
        squares[i].setRect(squares[j].getMinX(), squares[i].getMinY(), 30, squares[i].getHeight());
        squares[j].setRect(minH, squares[j].getMinY(), 30, squares[j].getHeight());

        //change position of shapes in array
        Rectangle2D temp=squares[i];
        squares[i]=squares[j];
        squares[j]=temp;
        panel.repaint();
    }

    public static void bubbleSort(int myArray[], int n){
        //bubble up largest element
        for (int i=0;i<n;i++){  
            boolean swap=false;
            for (int j=1;j<n;j++){
                if (myArray[j-1]>myArray[j]){                   
                    swap(j,j-1);        
                    int temp=myArray[j-1];
                    myArray[j-1]=myArray[j];
                    myArray[j]=temp;
                    swap=true;              
                }           
            }

            if (swap==false){                   
                break;
            }

        }

        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }


    public static void main(String[] args){
        move frame=new move();          
    }   


    public class GPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D ga=(Graphics2D)g;
            if (swapShape){ 
                    for (int i=0;i<squares.length;i++){
                        if (i%2!=0){
                            ga.setColor(Color.red);
                        }
                        else{
                            ga.setColor(Color.black);
                        }
                        ga.fill(squares[i]);
                        ga.draw(squares[i]);                        
                    }
                    countPaint++;
                    System.out.println("\nrepainted: "+countPaint+" times");
            }
            else{           
                squares[0]=new Rectangle2D.Double(n, m, 30, x[0]*30);
                ga.setColor(Color.black);
                ga.fill(squares[0]);
                ga.draw(squares[0]);
                n+=30;

                for (int i=1;i<x.length;i++){
                    m+=(x[i-1]*30)-(x[i]*30);
                    squares[i]=new Rectangle2D.Double(n, m, 30, x[i]*30);
                    n+=30;
                    ga.draw(squares[i]);
                    if (i%2!=0){
                        ga.setColor(Color.red);
                    }
                    else{
                        ga.setColor(Color.black);
                    }
                    ga.fill(squares[i]);                
                }               
            }

            n=20;   
            m=630;

        }
    }



}