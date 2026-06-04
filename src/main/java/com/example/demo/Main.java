package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class Main {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://dummyjson.com/products/1";

        Product product = restTemplate.getForObject(
                url,
                Product.class
        );

        System.out.println(product);
    }
}