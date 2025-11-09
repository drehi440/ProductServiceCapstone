package com.scaler.productservicecapstoneapplication.services;

import com.scaler.productservicecapstoneapplication.models.Product;

public interface ProductAIService
{
    Product createProductWithAIDescription(String name, double price,
                                           String imageUrl, String category);
}
