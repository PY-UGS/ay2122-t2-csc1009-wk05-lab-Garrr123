package Week5;

import java.util.*;

public class GeometricObject {
    private String colour;
    private boolean filled;
    private Date dateCreated = new Date();

    public GeometricObject() {
        this.colour = "white";
        this.filled = false;
    }

    public GeometricObject(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString(){
        return "created on " + this.getDateCreated() + "\ncolor: " + colour + " and Filled: " + this.isFilled();
    }
}
