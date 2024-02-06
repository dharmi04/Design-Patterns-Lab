// ConcreteBuilder2.java
public class ConcreteBuilder2 implements Builder {
    private Product product;

    public ConcreteBuilder2() {
        product = new Product();
    }

    public void buildPart1(String part1) {
        product.setPart1(part1 + " ");
    }

    public void buildPart2(String part2) {
        product.setPart2(part2 + " ");
    }

    public Product getResult() {
        return product;
    }
}
