package day23;

public class EncapsulationConcept {
    private int x;//-1
    private int y;//-1

    public void addition() {
        if (getX()+ getY()<0)
        {
            System.out.println("Not as per the rules...");
        }
        else {
            int sum = getX() + getY();
            System.out.println("SUM: " + sum);
        }
    }

    public void setX(int x) {
        if (x <= 10) {
            this.x = x;
        } else {
            this.x = -1;
        }
    }

    public void setY(int y) {
        if (y <= 10) {
            this.y = y;
        } else {
            this.y = -1;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
