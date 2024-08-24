# Supplier Search API

The Supplier Search API allows buyers to search for manufacturers based on location, nature of business, and manufacturing processes. The API supports pagination and provides detailed information about suppliers that match the specified criteria.

## Security Best Practices

To protect sensitive user data and prevent potential vulnerabilities, the following best practices are implemented:

- **Authentication and Authorization**: The API uses OAuth2 for authentication. All endpoints require a valid access token. Role-based access control (RBAC) ensures that users have the appropriate roles to access certain endpoints.
- **Data Encryption**: All API requests and responses are encrypted using HTTPS to protect data during transmission. Sensitive data stored in the database is also encrypted to ensure its security.
- **Input Validation and Sanitization**: All user inputs are validated to prevent injection attacks. Parameters must meet specific criteria (e.g., `location` must be a valid city name, `natureOfBusiness` and `manufacturingProcess` must be from predefined sets). 

## API Endpoints

### Query Suppliers

- **URL**: `/api/supplier/query`
- **Method**: `POST`
- **Description**: Retrieves a list of manufacturers based on location, nature of business, and manufacturing processes.
- **Request Parameters**: 
  - `location` (String): The location of the supplier (e.g., "India").
  - `natureOfBusiness` (String): Nature of business (e.g., "small_scale", "medium_scale", "large_scale").
  - `manufacturingProcess` (String): Manufacturing process (e.g., "moulding", "3d_printing", "casting", "coating").
  - `page` (int): Page number for pagination.
  - `size` (int): Number of results per page.

## To run the Supplier Search API application, follow these steps:

First, clone the repository using `git clone https://github.com/your-repo/supplier-search-api.git`. Next, configure your database by updating the `src/main/resources/application.properties` file with your database connection settings. You need to set `spring.datasource.url` to your database URL, `spring.datasource.username` to your database username, and `spring.datasource.password` to your database password. After configuring the database, build the application using Maven with the command `mvn clean install`. Once the build is complete, start the application using Maven with `mvn spring-boot:run`. The application will be running at `http://localhost:8080`, and you can access it via this URL in your web browser or API testing tool.

Ensure that you have Java 17 and Spring Boot 3.x installed, and use PostgreSQL/MySQL or any other supported database for configuration.

Documented the api using Swagger.
