public class Cheese extends Extras {
    public Cheese(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getDescription() {
        return hamburguer.getDescription() + ", Cheese";
    }

    public double cost() {
        return hamburguer.cost() + .15;
    }
}
