package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        product.setProductId(Integer.toString(productData.size()+1));
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
}
