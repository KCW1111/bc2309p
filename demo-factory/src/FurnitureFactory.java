public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();
  public static FurnitureFactory create(Style style){

   return switch (style) {
      case MODERN -> new ModernFurnitureFactory();
      case VICTORIAN -> new VictorianFurnitureFactory();
    };
  }

  public static void main(String[] args) {
    FurnitureFactory ff = FurnitureFactory.create(Style.MODERN);

    ff.createSofa(); // during compile time: do we know it is creating modern sofa???
  }

  //open-close principle
}
