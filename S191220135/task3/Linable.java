package task3;

import task3.Line.Position;

public interface Linable {
    
    public void setPosition(Position position);

    public Position getPosition();

    public void swapPosition(Linable another);

    public int getValue();

}