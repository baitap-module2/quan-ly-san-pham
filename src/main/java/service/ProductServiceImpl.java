package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(01, "Bút chì", 2.500, "SX 2010", "ABC"));
        products.put(2, new Product(02, "Bút bi", 3.000, "SX 2008", "ACB"));
        products.put(3, new Product(03, "Tẩy", 4.500, "SX 2011", "CCC"));
        products.put(4, new Product(04, "Vở", 7.000, "SX 2005", "WEF"));
        products.put(5, new Product(05, "Sách", 10.500, "SX 2017", "BGD"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
