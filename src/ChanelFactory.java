public class ChanelFactory implements CosmeticBrandFactory {
    @Override
    public Lipstick createLipstick() {
        return new ChanelLipstick();
    }

    @Override
    public Mascara createMascara() {
        return new ChanelMascara();
    }

    @Override
    public Cream createCream() {
        return new ChanelCream();
    }
}