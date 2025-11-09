package com.scaler.productservicecapstoneapplication.services;

import com.scaler.productservicecapstoneapplication.exceptions.ProductNotFoundException;
import com.scaler.productservicecapstoneapplication.models.Product;

import java.util.List;

public interface ProductService
{
    Product getProductById(long id) throws ProductNotFoundException;
    List<Product> getAllProducts();
    Product createProduct(String name, String description, double price,
                          String imageUrl, String category);
}
