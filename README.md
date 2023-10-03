# Employee-address-1-1
## Language and Framework
![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Summary

The "Employee-address-1-1" project demonstrates a one-to-one relationship between two tables: "Employee" and "Address."

## Models

### Address Entity

- Attributes:
  - `id (Long)`: Unique identifier for each address.
  - `street (String)`: Street address.
  - `city (String)`: City name.
  - `state (String)`: State name.
  - `zipCode (String)`: ZIP code.

### Employee Entity

- Attributes:
  - `id (Long)`: Unique identifier for each employee.
  - `firstName (String)`: First name of the employee.
  - `lastName (String)`: Last name of the employee.
  - `designation (String)`: Employee's job designation.
  - `address (Address)`: One-to-one relationship with the Address entity.

## Controllers

### AddressController

- Endpoints:
  - `GET /address`: Retrieve a list of all addresses.
  - `GET /address/id/{id}`: Retrieve an address by its ID.
  - `POST /address`: Add a new address by providing address details in the request body.
  - `PUT /address/id/{id}`: Update address details by providing the address ID and optional parameters for street, city, state, and zipCode.
  - `DELETE /address/id/{id}`: Delete an address by its ID.

### EmployeeController

- Endpoints:
  - `GET /employee`: Retrieve a list of all employees.
  - `GET /employee/id/{id}`: Retrieve an employee by their ID.
  - `POST /employee`: Add a new employee by providing employee details in the request body, including the associated address.
  - `PUT /employee/id/{id}`: Update employee details by providing the employee ID and optional parameters for firstName, lastName, designation, and address.
  - `DELETE /employee/id/{id}`: Delete an employee by their ID.
  - `GET /address/employee/id/{id}`: Retrieve the address associated with an employee by their ID.

## Services

### AddressServices

- Manages address-related operations.
- `getAllAddress`: Retrieve all addresses.
- `getAddressById`: Retrieve an address by ID.
- `addAddress`: Add a new address.
- `updateAddress`: Update address details.
- `deleteAddressById`: Delete an address by ID.

### EmployeeServices

- Manages employee-related operations.
- `getAllEmp`: Retrieve all employees.
- `getEmployeeById`: Retrieve an employee by ID.
- `addEmployee`: Add a new employee.
- `updateEmployee`: Update employee details.
- `deleteEmployeeById`: Delete an employee by ID.
- `getTheAddressByEmpId`: Retrieve the address associated with an employee by their ID.

## Repositories

### IAddressRepo

- Interface extending `JpaRepository` for the Address entity.

### IEmployeeRepo

- Interface extending `JpaRepository` for the Employee entity.

## Database Schema
MySQL database has been used
- **Address (Table):**
  - `id (integer, primary key)`
  - `street (string)`
  - `city (string)`
  - `state (string)`
  - `zipCode (string)`

- **Employee (Table):**
  - `id (integer, primary key)`
  - `firstName (string)`
  - `lastName (string)`
  - `designation (string)`
  - `fkAddress (foreign key to Address table)`

   ## Prerequisites
Make sure you have the following prerequisites installed on your system:

- Java Development Kit (JDK)
- Maven
- all the dependencies from poem.xml or active internet connection

## Installation
1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/Abdul12527/MapLearning-employee-address-1-1.git
   
2. Navigate to the project directory

    ```bash
    cd MapLearning-employee-address-1-1

  
## Usage
You can use application by making HTTP requests to the provided API endpoints using your preferred API testing tool or framework.

## Swagger UI
For a more interactive experience and to explore the available APIs, you can use the Swagger UI at http://localhost:8080/swagger-ui/index.html when running the application on your local system.
