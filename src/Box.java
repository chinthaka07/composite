import java.util.List;

public class Box {
    private List<Box> boxes;
    private List<Product> products;

    public Box(List<Box> boxes, List<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }
}
