package Objects;

public class Bullet extends MovableObject {
    String type; //ether an alien or spaceship bullet(a,s)

    public Bullet( String t, int xP, int yP, int e, int h){
        super(xP, yP, e, h);
        type = t;

    }


}