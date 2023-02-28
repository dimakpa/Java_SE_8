package Task1;

public class LabeledPoint extends Point{
    String label;
    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
    }
}
