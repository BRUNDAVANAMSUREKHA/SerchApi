# SerchApi

A Spring Boot search application that helps buyers find manufacturers based on customized criteria such as location, nature of business, and manufacturing processes. This document provides instructions for setting up, running, and testing the application.

## Table of Contents

1. [Project Structure](#project-structure)
2. [Project Overview](#project-overview)
3. [Technologies Used](#technologies-used)
4. [Setup and Installation](#setup-and-installation)
5. [Running the Application](#running-the-application)
6. [Testing the Application](#testing-the-application)
7. [API Endpoints](#api-endpoints)
8. [Troubleshooting](#troubleshooting)
9. [Contributing](#contributing)
10. [License](#license)

## Project Structure

```plaintext
makersharks/                      # Root project directory
├── src/                         # Source folder
│   ├── main/                    # Main source code directory
│   │   ├── java/                # Java source code
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── MakersharksApplication.java  # Main application class
│   │   │               ├── Supplier.java               # Supplier entity class
│   │   │               ├── SupplierRepository.java     # Supplier repository interface
│   │   │               ├── SupplierService.java        # Supplier service class
│   │   │               └── SupplierController.java     # Supplier controller class
│   │   └── resources/         # Resources folder
│   │       ├── application.properties  # Spring Boot configuration file
│   └── test/                  # Test source code directory
│       └── java/
│           └── com/
│               └── example/
│                   └── demo/
├── .claapath
├── .gitignore
├── .project
├── Help.md
├── mvnw
├── mvnw.cmd
└── pox.xml
```


## Project Overview

SerchApi connects buyers with manufacturers based on various search criteria. The application uses Spring Boot for the backend and an H2 in-memory database for data storage.

## Technologies Used

- **Spring Boot**: Framework for building the backend.
- **H2 Database**: In-memory database used for development and testing.
- **Postman**: Tool for testing API endpoints.

## Setup and Installation

### Prerequisites

- Java 19 or higher
- Gradle (if not installed, it will be downloaded automatically by the project)

### Cloning the Repository

1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    ```

2. Navigate to the project directory:
    ```bash
    cd your-repo-name
    ```

### Building the Project

1. Build the project using Gradle:
    ```bash
    ./gradlew build
    ```

## Running the Application

1. Start the application using Gradle:
    ```bash
    ./gradlew bootRun
    ```

2. The application will be available at `http://localhost:8081`.

## Testing the Application

Use Postman or any other API client to test the following endpoints.

### Example cURL Requests

- **Get All Suppliers**:
    ```bash
    curl -X GET "http://localhost:8081/suppliers" -H "accept: application/json"
    ```

- **Get Supplier by ID**:
    ```bash
    curl -X GET "http://localhost:8081/suppliers/{id}" -H "accept: application/json"
    ```

- **Create a New Supplier**:
    ```bash
    curl -X POST "http://localhost:8081/suppliers" -H "Content-Type: application/json" -d '{
      "companyName": "ABC Manufacturing",
      "location": "New York",
      "natureOfBusiness": "Electronics",
      "website": "http://abcmanufacturing.com",
      "manufacturingProcesses": [
        {
          "processKey": "assembly",
          "value": "High",
          "description": "Assembly of electronic components"
        }
      ]
    }'
    ```

- **Update Supplier Information**:
    ```bash
    curl -X PUT "http://localhost:8081/suppliers/{id}" -H "Content-Type: application/json" -d '{
      "companyName": "ABC Manufacturing Updated",
      "location": "New York",
      "natureOfBusiness": "Electronics",
      "website": "http://abcmanufacturing.com",
      "manufacturingProcesses": [
        {
          "processKey": "assembly",
          "value": "High",
          "description": "Assembly of electronic components"
        }
      ]
    }'
    ```

- **Delete a Supplier**:
    ```bash
    curl -X DELETE "http://localhost:8081/suppliers/{id}"
    ```

## Troubleshooting

- If the application does not start, check the console for errors and ensure all dependencies are correctly installed.
- Verify that port `8081` is not being used by another application.

## Contributing

Feel free to submit issues and pull requests. Ensure that contributions are well-documented and tested.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
