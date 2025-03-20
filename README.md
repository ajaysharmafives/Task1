# Bulk Operation API

This project provides a **Bulk Operation API** built with **Spring Boot** and connected to a MySQL database. It allows users to perform bulk operations efficiently and securely. The API supports file uploads, batch inserts, and various database operations.

## Features

- Perform **bulk database operations** (insert, update, delete).
- Supports **large file uploads** up to 50MB.
- Connects to a **MySQL database** using secure credentials.
- **Batch processing** for faster inserts and updates using Hibernate.

## Technologies Used

- **Spring Boot**: For building the RESTful API.
- **MySQL**: As the database for storing data.
- **Hibernate (JPA)**: For ORM and database interaction.
- **Maven**: For project build management.
- **File Uploading**: Supports large file uploads.

## Prerequisites

Before running the application, make sure you have the following installed:

- **Java 17 or higher**
- **Maven** (for building the project)
- **MySQL Database**

## API URL
- http://localhost:8080/api/csv/upload  (Upload data)
- http://localhost:8080/api/csv/data  (fetch data)

## Postman Collection URl
  
- https://github.com/user-attachments/files/19364577/Task1.postman_collection.json


## Setup & Installation

### 1. Clone the repository
Clone the repository to your local machine:
```bash[Uploading Task1.postman_collection.json…]()

git clone https://github.com/ajaysharmafives/Task1.git



