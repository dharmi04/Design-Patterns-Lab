// Director.java
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String part1, String part2) {
        builder.buildPart1(part1);
        builder.buildPart2(part2);
    }
}
