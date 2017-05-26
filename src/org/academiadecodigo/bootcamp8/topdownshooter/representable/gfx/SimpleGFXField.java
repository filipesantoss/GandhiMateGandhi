package org.academiadecodigo.bootcamp8.topdownshooter.representable.gfx;

import org.academiadecodigo.bootcamp8.topdownshooter.field.Field;
import org.academiadecodigo.bootcamp8.topdownshooter.field.position.AbstractPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Created by codecadet on 25/05/17.
 */
public class SimpleGFXField implements Field {

    private final  int PADDING = 10;
    private int columns;
    private int rows;
    private Rectangle field;
    private final int CELL_SIZE = 20;                             //for testing


    public SimpleGFXField(int rows, int columns) {

     this.rows = rows;
     this.columns = columns;

    }

    @Override
    public void setup() {
        field = new Rectangle(PADDING, PADDING, columns * CELL_SIZE, rows * CELL_SIZE);
        field.draw();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return rows;
    }

    public int getWidth(){
        return columns*CELL_SIZE;
    }

    public int getHeight(){
        return rows*CELL_SIZE;
    }

    public int getCELL_SIZE(){
        return CELL_SIZE;
    }

    public int getX(){
        return PADDING;
    }

    public int getY(){
        return PADDING;
    }

    public int columntoX(int col){
        return PADDING+col*CELL_SIZE;
    }

    public int rowToY(int row){
        return PADDING+row*CELL_SIZE;
    }

    @Override
    public AbstractPosition createRepresentation() {
        return new SimpleGFXPosition(this);
    }

    public AbstractPosition createRepresentation(int row, int col){
        return new SimpleGFXPosition(row,col,this);
    }

}