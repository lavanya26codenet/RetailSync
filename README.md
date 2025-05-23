# 🛒 RetailSync

**RetailSync** is a desktop-based Retail Management System built using Java and PostgreSQL.  
It helps manage employees, products, billing, and order processing — similar to systems used in stores like D-Mart.

---

## 📌 Why RetailSync?

Retail stores deal with daily tasks like:  
- Adding and updating product stock  
- Managing employee and receptionist details  
- Generating bills for customers  
- Keeping track of orders  

RetailSync makes all of these tasks easier and faster by providing one system for everything.

---

## 💻 Technologies Used

- **Java** (Swing for GUI)  
- **PostgreSQL** (Database)  
- **Barcode4J** (Barcode image generation)  
- **NetBeans** (IDE)  
- **Maven** (Project management)  

---

## 🔑 Key Features

- Manager and Receptionist login  
- Add, update, delete, and view employees/products  
- Billing with automatic stock update  
- Order records saved in the system  
- Barcode generation for products  

---

## 👤 User Roles

- **Manager**: Full access to all features  
- **Receptionist**: Can generate bills and view own orders  

---

## 📁 Project Modules

- **Employee Management**  
- **Product Management**  
- **Billing and Order System**  
- **Login and Role-based Access**  
- **Barcode Generator**  

---

## ⚙️ How to Set Up and Run

### 🔧 Prerequisites

- Java JDK 17+  
- PostgreSQL installed  
- NetBeans IDE (or other Maven-supported IDE)  

---

### 🗄️ Database Setup

### ⚙️ Database Credentials

The application connects to PostgreSQL using:
Username: postgres
Password: postgres
Make sure these credentials are set up in your PostgreSQL server, or update the connection settings in the application source code accordingly.

1. Create a PostgreSQL database named `retailsync`.  
2. Open terminal or pgAdmin.  
3. Run the backup SQL file to restore tables and sample data:

<pre>psql -U postgres -d retailsync -f retailsync_backup.sql</pre>
✅ This will set up tables: employees, users, products, and orders.

---

### ▶️ Running the App
**Option 1: From NetBeans**

Open the project
Right-click SplashScreenFrame.java → Run File

**Option 2: Using the .jar File**

Navigate to the `target` folder:

<pre>cd target/</pre>

> ⚠️ Note: If the `target` folder is missing, you can build the JAR with:

<pre>mvn clean package</pre>
Run the JAR:
<pre>java -jar RetailSync-1.0-SNAPSHOT.jar</pre>

✅ This will open the splash screen, followed by the login screen.

---

## 🔐 Login Credentials

| Role         | Username   | Password     |
|--------------|------------|--------------|
| Manager      | lavanya123 | lavanya@123  |
| Receptionist | neha123    | neha@123     |
| Receptionist | sahil123   | sahil@123    |


👤 More users available in the users table after importing the SQL file.

---

## 📄 License

Developed as a final-year project  
© 2025 RetailSync  
Indira College of Commerce and Science, Pune


---

## 🤝 Connect

For issues or suggestions:  
📧 [lavanyaasole2602@gmail.com](mailto:lavanyaasole2602@gmail.com)  
🌐 [GitHub Repository](https://github.com/lavanya26codenet/RetailSync)


---
