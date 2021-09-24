package com.kremogen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainWindow extends JFrame{

    int milanPoints = 0;
    int madridPoints = 0;

    protected MainWindow(){
        super("Milan x Madrid");

        this.setLayout(null);
        this.setSize(480, 320);

        JButton milan = new JButton("AC Milan");
        milan.setSize(100,20);
        milan.setLocation(110, 200);

        JButton madrid = new JButton("Real Madrid");
        madrid.setSize(100,20);
        madrid.setLocation(270, 200);

        JLabel result = new JLabel("Result: " + milanPoints + " X " + madridPoints);
        result.setFont(Font.getFont(Font.MONOSPACED));
        result.setSize(320, 100);
        result.setLocation(200, 120);

        JLabel lastScorer = new JLabel("Last Scorer: N/A");
        lastScorer.setFont(Font.getFont(Font.MONOSPACED));
        lastScorer.setSize(320, 100);
        lastScorer.setLocation(190, 90);

        JLabel winner = new JLabel("Winner: DRAW");
        winner.setFont(Font.getFont(Font.MONOSPACED));
        winner.setSize(320, 100);
        winner.setLocation(195, 40);

        this.add(milan);
        this.add(madrid);
        this.add(result);
        this.add(lastScorer);
        this.add(winner);

        milan.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                milanPoints += 1;
                lastScorer.setText("Last Scorer: AC Milan");
                result.setText("Result: " + milanPoints + " X " + madridPoints);
                if (milanPoints > madridPoints){
                    winner.setText("Winner: AC Milan");
                }
                else if (milanPoints < madridPoints){
                    winner.setText("Winner: Real Madrid");
                    //JLabel winner = new JLabel("Winner: Real Madrid");
                }
                else{
                    winner.setText("Winner: DRAW");
                    //JLabel winner = new JLabel("Winner: DRAW");
                }
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        madrid.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                madridPoints += 1;
                lastScorer.setText("Last Scorer: Real Madrid");
                result.setText("Result: " + milanPoints + " X " + madridPoints);
                if (milanPoints > madridPoints){
                    winner.setText("Winner: AC Milan");
                }
                else if (milanPoints < madridPoints){
                    winner.setText("Winner: Real Madrid");
                    //JLabel winner = new JLabel("Winner: Real Madrid");
                }
                else{
                    winner.setText("Winner: DRAW");
                    //JLabel winner = new JLabel("Winner: DRAW");
                }
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
    }
}
