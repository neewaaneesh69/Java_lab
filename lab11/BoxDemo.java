package lab11;

class Box {
    int length, b, h;

    Box(int l, int b, int h) {
        this.length = l;
        this.b = b;
        this.h = h;
    }

    int getVolume() {
        return (length * b * h);
    }
}

class BoxWeight extends Box {
    int weight;

    BoxWeight(int l, int b, int h, int wt) {
        super(l, b, h);
        this.weight = wt;
    }

    void display(String name) {
        System.out.println("Volume of " + name + ": " + super.getVolume());
        System.out.println("Weight of " + name + ": " + weight);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(5, 5, 5, 100);
        BoxWeight box2 = new BoxWeight(10, 10, 10, 500);

        box1.display("Box1");
        box2.display("Box2");
    }
}