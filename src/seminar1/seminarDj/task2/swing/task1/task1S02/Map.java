package seminar1.seminarDj.task2.swing.task1.task1S02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Map extends JPanel {
    private static final Random RANDOM = new Random();
    private final int DOT_PADDING = 5;
    private final int HUMAN_DOT = 1;
    private final int AI_DOT = 2;
    private final int EMPTY_DOT = 0;
    private int fieldSizeY = 3;
    private int fieldSizeX = 3;
    private char[][] field;
    private int panelWidth;
    private int panelHeight;
    private int cellHeight;
    private int cellWidth;
    Map(){
//        setBackground(Color.BLACK);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }
    void startNewGame(int mode, int fSzX, int fSxY, int wLen){
        System.out.printf("Mode: %d;\nSize: x=%d, x=%d;\nWin Lenght: %d",
                mode,fSzX,fSxY,wLen);
        repaint();
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        render(g);
    }
//    private void render(Graphics g){
//        panelWidth = getWidth();
//        panelHeight = getHeight();
//        cellHeight = panelHeight / 3;
//        cellWidth = panelWidth / 3;
//        g.setColor(Color.BLACK);
//        for (int h=0;h<3;h++){
//            int y =h*cellHeight;
//            g.drawLine(0,y,panelWidth,y);
//        }
//        for (int w=0;w<3;w++){
//            int x =w*cellWidth;
//            g.drawLine(0,x,panelHeight,x);
//        }
//
//
//    }
    private void update(MouseEvent e){
        int cellX = e.getX()/cellWidth;
        int cellY = e.getY()/cellHeight;
        if (!isValidCell(cellX,cellY)||!isEmptyCell(cellX,cellY))return;
        field[cellY][cellX]=HUMAN_DOT;

        repaint();
    }
//    private void update(MouseEvent e){
//        int cellX = e.getX()/cellWidth;
//        int cellY = e.getY()/cellHeight;
//        System.out.printf("x=%d, y=%d\n",cellX,cellY);
//        repaint();
//    }
    private void initMap(){
        fieldSizeY = 3;
        fieldSizeX = 3;
        field= new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j]=EMPTY_DOT;
            }
        }
    }
    private  boolean isValidCell(int x, int y){
        return x>=0&&x<fieldSizeY&&y>=0&&y<fieldSizeY;
    }
    private  boolean isEmptyCell(int x, int y){
        return field[y][x]==EMPTY_DOT;
    }

    private boolean isMapFull(){
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if(field[i][j]==EMPTY_DOT) return false;
            }
        }
        return true;
    }

    private void aiTurn(){
        int x,y;
        do {
            x=RANDOM.nextInt(fieldSizeX);
            y=RANDOM.nextInt(fieldSizeY);
        }while (!isEmptyCell(x,y)) ;
            field[y][x]=AI_DOT;
    }

    private boolean checkWin(char c){
        if (field[0][0]==c && field[0][1]==c&&field[0][2]==c) return true;
        if (field[1][0]==c && field[1][1]==c&&field[1][2]==c) return true;
        if (field[2][0]==c && field[2][1]==c&&field[2][2]==c) return true;

        if (field[0][0]==c && field[1][0]==c&&field[2][0]==c) return true;
        if (field[0][1]==c && field[1][1]==c&&field[2][1]==c) return true;
        if (field[0][2]==c && field[1][2]==c&&field[2][2]==c) return true;

        if (field[0][0]==c && field[1][1]==c&&field[2][2]==c) return true;
        if (field[0][2]==c && field[1][1]==c&&field[2][0]==c) return true;
        return false;
    }
    private void render(Graphics g){
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j]==EMPTY_DOT)continue;
                if (field[i][j]==HUMAN_DOT){

                } else if (field[i][j]==AI_DOT) {

                }else {
                    throw new RuntimeException(" ");
//                            ("Unexpected value"+field[i][j])+
//                            " in cell: j=" + " i=");
                }

            }

        }
    }

}
