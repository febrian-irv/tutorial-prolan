package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();
    private int countId = 0;

    public Product create(Product product) {
        countId += 1;
        product.setProductId(Integer.toString(countId));
        productData.add(product);
        return product;
    }

    public Product findProduct(String productId){
        for (Product product: productData) {
            if (product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    public Product edit(Product editProduct) {
        Product tempProduct = findProduct(editProduct.getProductId());
        System.out.println(tempProduct.getProductName());
        tempProduct.setProductName(editProduct.getProductName());
        tempProduct.setProductQuantity(editProduct.getProductQuantity());
        return tempProduct;
    }

    public  Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product delete(String productId) {
        Product tempProduct = findProduct(productId);
        productData.remove(tempProduct);
        return tempProduct;
    }
}
