public class MaybellineFactory implements CosmeticBrandFactory {
    @Override
    public Lipstick createLipstick() {
        return new MaybellineLipstick();
    }

    @Override
    public Mascara createMascara() {
        return new MaybellineMascara();
    }

    @Override
    public Cream createCream() {
        return new MaybellineCream();
    }
}