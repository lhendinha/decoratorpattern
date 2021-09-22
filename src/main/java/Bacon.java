public class Bacon extends Extras {
    public Bacon(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getDescription() {
        return hamburguer.getDescription() + ", Bacon";
    }

    public double cost() {
        return hamburguer.cost() + .99;
    }
}