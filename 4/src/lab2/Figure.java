package lab2;

public class Figure {
    String type;
    String color;

    Figure (String t, String c){
        type = t;
        color = c;
    }

    String getType(){
        return this.type;
    }

    String getColor() {
        return this.color;
    }


    public boolean equals(Object obj){
        return this.type.equals(((Figure)obj).type) && this.color.equals(((Figure)obj).color);
    }

    public int hashCode(){
        return this.type.hashCode() + this.color.hashCode();
    }
}
