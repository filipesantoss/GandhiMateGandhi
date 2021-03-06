package org.academiadecodigo.bootcamp8.gandhimategandhi.field.position;

import org.academiadecodigo.bootcamp8.gandhimategandhi.field.Direction;
import org.academiadecodigo.bootcamp8.gandhimategandhi.gameobjects.GameObject;

public interface FieldPosition {

    int getColumn();

    int getRow();

    void setPosition(int row, int column);

    void moveInDirection(Direction direction, GameObject gameObject);

    void moveInDirection(Direction direction, GameObject gameObject, boolean kitting);

    void show();

    void hide();

    boolean isColliding(FieldPosition position);

    boolean isEdge();

    int getHeight();

    int getWidth();

    int getMaxRow();

    int getMaxColumn();

}
