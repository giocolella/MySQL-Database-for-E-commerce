# 🗄️ MySQL E-Commerce Database
**Relational Database Design for a Musical Instrument Store**

[![Java](https://img.shields.io/badge/Language-Java-orange.svg?logo=java)](https://www.java.com/)
[![MySQL](https://img.shields.io/badge/Database-MySQL-blue.svg?logo=mysql)](https://www.mysql.com/)
[![JDBC](https://img.shields.io/badge/Driver-JDBC-red.svg)]()
[![Status](https://img.shields.io/badge/Status-Completed-success.svg)]()
[![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)]()

---

## 📑 Table of Contents
1. [Overview](#-overview)
2. [Motivation](#-motivation--why-this-project)
3. [Database Schema & Features](#-database-schema--features)
4. [Requirements](#-requirements)
5. [Setup Guide](#-setup-guide)
6. [Tools & Documentation](#-tools--documentation)

---

## 📌 Overview
This project involves the complete lifecycle of a relational database for an **Online Musical Instrument Store**, from conceptual design to implementation and application integration.

The system is designed to manage:
- **Customers**: Personal data, credit cards and purchase history.
- **Inventory**: A catalog featuring specific instrument categories (Electric Guitars, Drums, Keyboards).
- **Transactions**: Orders, Payments and Shipments.
- **Feedback**: Product reviews and ratings.

The project includes a **Java Console Application** that acts as a client to execute 10 specific operational queries defined in the requirements.

---

## 🎯 Motivation / Why This Project?
- 📐 **Database Theory**: To apply rigorous design principles, including **Conceptual Design** (ER Diagrams) and **Logical Design**.
- 🧹 **Normalization**: To ensure data integrity by restructuring the schema up to **Boyce-Codd Normal Form (BCNF)**, eliminating redundancy and anomalies.
- 🔗 **Java Integration**: To learn how to bridge an Object-Oriented language with a Relational Database using **JDBC (Java Database Connectivity)**.
- ⚡ **Complex Querying**: To master SQL by writing optimized queries involving nested selects, aggregations, joins and triggers.

---

## ⚙ Database Schema & Features

#### **Data Modeling**
The database models complex relationships, including:
- **ISA Hierarchies**: Handling product specialization where *Guitars* (pickups, strings), *Drums* (snares) and *Keyboards* (styles) inherit from a generic *Product* entity.
- **Relationships**: One-to-Many and Many-to-Many associations (like Orders containing multiple Products).

#### **Key Operations (Java CLI)**
The accompanying Java application implements a switch-menu to perform 10 core operations, such as:
1.  **User Registration**: Insert new customer data.
2.  **Catalog Management**: Add specific instruments to the inventory.
3.  **Sales Tracking**: Calculate total revenue per product type.
4.  **Review Analysis**: Find products with average ratings above a threshold.
5.  **Logistics**: Track shipments arriving on specific dates.
6.  **Maintenance**: Delete orders and cascade changes to related tables.

#### **Technical Implementation**
- **DDL**: Scripts to create tables with correct constraints (PK, FK, Checks).
- **DML**: Pre-defined queries for data manipulation.
- **Triggers**: Automated checks to maintain business logic (like stock validation).

---

## 💻 Requirements

### **Database**
- **MySQL Server** (8.0 or compatible).
- **MySQL Workbench** (optional, for visual management).

### **Application**
- **JDK 8** (or higher).
- **MySQL Connector/J** (JDBC Driver).
- **IDE**: Eclipse, IntelliJ or VS Code.

---

## 🚀 Setup Guide

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/giocolella/MySQL-Database-for-E-commerce.git](https://github.com/giocolella/MySQL-Database-for-E-commerce.git)
    ```

2.  **Database Initialization:**
    - Open your MySQL client (e.g., Workbench or CLI).
    - Create a new schema named `musical_store` (or as defined in the SQL script).
    - Import and execute the provided SQL script (e.g., `db_creation.sql`) to generate tables and insert dummy data.

3.  **Java Configuration:**
    - Open the Java project in your IDE.
    - Ensure the `mysql-connector-java.jar` is added to your project's Build Path / Classpath.
    - Locate the database connection file (usually `Main.java` or a `DatabaseConnection` class).
    - **Update credentials:**
      ```java
      String url = "jdbc:mysql://localhost:3306/musical_store";
      String user = "YOUR_USERNAME"; // e.g., root
      String password = "YOUR_PASSWORD";
      ```

4.  **Run:**
    - Run the Main class.
    - Follow the on-screen console menu to interact with the database.

---

## 📚 Tools & Documentation

* **Design Document**: [Project Documentation](./ProgettoBDEcommerce.pdf) - Contains the full Conceptual and Logical design, Normalization steps and query definitions.
* **ER Diagram**: Visual representation of entities and relationships.
* **Draw.io**: Used for designing the diagrams.

---
*Created by [Giorgio Colella](https://github.com/giocolella) - University of Salerno*
