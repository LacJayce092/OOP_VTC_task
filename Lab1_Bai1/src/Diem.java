public class Diem {
    float x , y;
    String name;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Diem() {
    }

    public Diem(String name ,float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + "(" + x + "," + y + ")";

    }
    public double distance(Diem position2){
        double result  = 0;
        result = Math.sqrt((Math.pow((this.x - position2.x),2)) + (Math.pow((this.y - position2.y) , 2)));
        return result;
    }
}
