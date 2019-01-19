package lab2;

public class Draw<F extends Figure>
{

    private F val;

    Draw(F val){
        this.val = val;
    }

    void drawType() {
        System.out.println(val.getType());
    }

    void draw(){
        System.out.println(val.getType());
        System.out.println(val.getColor());
    }

}
