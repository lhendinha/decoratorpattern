public class HamburguerStore {
    public static void main(String args[]) {
        Hamburguer hamburguer = new ThinHamburguer();
        Hamburguer cheeseHamburguer = new Cheese(hamburguer);
        Hamburguer baconHamburguer = new Bacon(hamburguer);

        System.out.println(cheeseHamburguer.getDescription()
            + " R$" + cheeseHamburguer.cost());

        System.out.println(baconHamburguer.getDescription()
                + " R$" + baconHamburguer.cost());
    }
}
