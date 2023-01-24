package core.basesyntax;

public class Square extends Figure implements Area {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append("square, area: ")
                .append(getArea()).append(" sq.units, ")
                .append("side: ")
                .append(side)
                .append(" units, ")
                .append("color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}