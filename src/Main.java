public class Main {
    public static void main(String[] args) {
        CosmeticBrandFactory factory = new ChanelFactory();

        Lipstick lipstick = factory.createLipstick();
        Mascara mascara = factory.createMascara();
        Cream cream = factory.createCream();

        lipstick.apply();
        mascara.apply();
        cream.apply();

        System.out.println("-----------------");

        CosmeticBrandFactory factory2 = new MaybellineFactory();
        Lipstick lipstick2 = factory2.createLipstick();
        Mascara mascara2 = factory2.createMascara();
        Cream cream2 = factory2.createCream();

        lipstick2.apply();
        mascara2.apply();
        cream2.apply();
    }
}