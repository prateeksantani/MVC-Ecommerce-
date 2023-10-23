# eCommerce MVC Project README

Welcome to the eCommerce MVC project! This project is a simple example of a web application built using the Model-View-Controller (MVC) architecture. In this project, we've implemented a basic e-commerce system for managing products and categories, now with additional APIs and data validation. This README will provide an updated overview of the project structure and how to get started.

## Project Structure

The project is organized into several packages, each responsible for a specific part of the application.

### Controller Package (`com.prateek.ecommerceMVC.controller`)

This package contains the controller class, which handles HTTP requests and communicates with the service layer. The controller is responsible for managing various endpoints related to products and categories. In this package, you'll find the following class:

- **ProductController:** This class is annotated with `@RestController` and handles HTTP requests related to products. It now provides new endpoints and validation:
  - `POST /product`: Adds a new product to the system. This endpoint now includes data validation to ensure the correctness of the input.
  - `GET /products`: Retrieves a list of all products.
  - `GET /product/{productId}`: Retrieves a single product by its ID.
  - `PUT /product/{productId}`: Updates an existing product.
  - `DELETE /product/{productId}`: Deletes a product by its ID.

### Service Package (`com.prateek.ecommerceMVC.service`)

The service package contains the business logic of the application. It communicates with the repository to perform operations on products and categories. Here, you'll find the following class:

- **ProductService:** This class is responsible for handling product-related business logic. It now includes validation logic to ensure that products meet certain criteria. It contains methods for adding a product, retrieving all products, updating a product, and deleting a product.

### Repository Package (`com.prateek.ecommerceMVC.repo`)

The repository package manages the data source, which in this case is an in-memory map of products. You'll find the same classes as before:

- **DataSource:** This class is annotated with `@Configuration` and defines a `@Bean` that initializes an empty map to serve as the data source for products.

- **ProductRepo:** This class is responsible for managing the product data. It is annotated with `@Component` and uses the `productMap` bean provided by `DataSource` to store and retrieve product information.

### Entity Package (`com.prateek.ecommerceMVC.entity`)

This package contains the data model classes, including the product and category classes, which have not changed.

## Getting Started

To run this updated project, follow these steps:

1. Ensure you have the necessary dependencies and tools installed, including Java, Spring Boot, and an Integrated Development Environment (IDE) of your choice.

2. Clone the updated project repository to your local machine.

3. Open the updated project in your IDE.

4. Build and run the updated project.

5. Use a tool like Postman or a web browser to interact with the project's APIs by making HTTP requests to the defined endpoints in the `ProductController`.

## Usage

Here's how you can interact with the updated project:

- To add a product, make a POST request to `http://localhost:8080/product` with a JSON body containing the product details. The data validation will ensure that the input is correct.

- To retrieve a list of all products, make a GET request to `http://localhost:8080/products`.

- To retrieve a single product by its ID, make a GET request to `http://localhost:8080/product/{productId}`.

- To update an existing product, make a PUT request to `http://localhost:8080/product/{productId}` with a JSON body containing the updated product details.

- To delete a product by its ID, make a DELETE request to `http://localhost:8080/product/{productId}`.
