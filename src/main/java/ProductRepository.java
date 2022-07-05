public class ProductRepository {

    private PuroductItem[] items = new PuroductItem[0];


    public void add(Product person) {
        Product[] tmp = new Product[Product.length + 1];
        for (int i = 0; i < Product.length; i++) {
            tmp[i] = Product[i];
        }
        tmp[tmp.length - 1] = person;
        Product = tmp;
    }
}
