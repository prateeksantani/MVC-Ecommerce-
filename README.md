# eCommerce MVC Project README

Welcome to the eCommerce MVC project! This project is a simple example of a web application built using the Model-View-Controller (MVC) architecture. In this project, we've implemented a basic e-commerce system for managing products and categories. This README will provide an overview of the project structure and how to get started.

## Project Structure

The project is organized into several packages, each responsible for a specific part of the application.

### Controller Package (`com.prateek.ecommerceMVC.controller`)

This package contains the controller class, which handles HTTP requests and communicates with the service layer. The controller is responsible for managing product-related endpoints. In this package, you'll find the following class:

- **ProductController:** This class is annotated with `@RestController` and handles HTTP requests related to products. It provides two endpoints:
  - `POST /product`: Adds a new product to the system.
  - `GET /products`: Retrieves a list of all products.

### Service Package (`com.prateek.ecommerceMVC.service`)

The service package contains the business logic of the application. It communicates with the repository to perform operations on products. Here, you'll find the following class:

- **ProductService:** This class is responsible for handling product-related business logic. It contains methods for adding a product and retrieving all products.

### Repository Package (`com.prateek.ecommerceMVC.repo`)

The repository package manages the data source, which in this case is an in-memory map of products. You'll find two classes in this package:

- **DataSource:** This class is annotated with `@Configuration` and defines a `@Bean` that initializes an empty map to serve as the data source for products.

- **ProductRepo:** This class is responsible for managing the product data. It is annotated with `@Component` and uses the `productMap` bean provided by `DataSource` to store and retrieve product information.

### Entity Package (`com.prateek.ecommerceMVC.entity`)

This package contains the data model classes. In this project, there is a single entity class:

- **Product:** This class represents a product with attributes such as `productId`, `productName`, `productPrice`, and `productCategory`. It is annotated with Lombok annotations for simplified code generation.

- **Category:** This is an enum that defines the possible product categories, including Electronics, Cosmetics, Sports, and Clothes.

## Getting Started

To run this project, follow these steps:

1. Ensure you have the necessary dependencies and tools installed, including Java, Spring Boot, and an Integrated Development Environment (IDE) of your choice.

2. Clone the project repository to your local machine.

3. Open the project in your IDE.

4. Build and run the project.

5. Use a tool like Postman or a web browser to interact with the project's API by making HTTP requests to the defined endpoints in the `ProductController`.

## Usage

Here's how you can interact with the project:

- To add a product, make a POST request to `http://localhost:8080/product` with a JSON body containing the product details.

- To retrieve a list of all products, make a GET request to `http://localhost:8080/products`.

## Conclusion

This README provides an overview of the eCommerce MVC project, its structure, and how to get started. You can extend this project by adding more features, such as user authentication, a front-end interface, and additional functionality to manage products and categories. Happy coding!
