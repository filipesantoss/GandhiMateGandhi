package org.academiadecodigo.bootcamp8.topdownshooter;

/**
 * Created by codecadet on 24/05/17.
 */
public interface Movable {

    void play();
    Direction chooseDirection()Direction direction;
    void move(Direction direction, int speed);
}