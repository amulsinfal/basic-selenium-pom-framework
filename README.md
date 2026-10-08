# Basic Selenium POM Framework

A clean and simple UI automation testing project built using **Java**, **Selenium WebDriver**, and **TestNG**. This project automates basic login and logout workflows on the [SauceDemo](https://saucedemo.com) e-commerce website to utilize my skills in test automation.

---

## 🛠️ Tech Stack
- **Language:** Java v21.0.11
- **Automation Tool:** Selenium WebDriver v4.50.0
- **Test Runner:** TestNG v7.12
- **Build Tool:** Apache Maven v3.9.14
- **IDE:** Eclipse Version: 2026-09 (4.41.0) 

---

## Project Structure  

<img width="558" height="500" alt="image" src="https://github.com/user-attachments/assets/2c423a24-55fe-4c56-a805-41bce39d6b3d" />

---

## Framework Design
This project uses the **Page Object Model (POM)** design pattern. It separates test logic from page design to make the code maintainable and reusable:
- **Pages Class Layer:** 'LoginPage' and 'ProductsPage' hold the element locators and interaction methods.

  <img width="1198" height="1250" alt="image" src="https://github.com/user-attachments/assets/b35b08d2-e580-4d15-a39e-9c17f5ec2513" />  
  <img width="1198" height="1061" alt="image" src="https://github.com/user-attachments/assets/b9c19aed-9623-4eda-bf27-5d9679935410" />
  
- **Tests Class Layer:** 'LoginTest', 'ProductsTest', and 'LogoutTest' handle the validations and assertions.

  <img width="1346" height="719" alt="image" src="https://github.com/user-attachments/assets/92824d9b-52c0-457d-bf3e-43f1a7794cc4" />
  <img width="1479" height="532" alt="image" src="https://github.com/user-attachments/assets/ae590131-b324-44d3-a95f-e1ccaaf31d41" />
  <img width="1432" height="364" alt="image" src="https://github.com/user-attachments/assets/9c2383a2-3cac-4448-9c91-54a9c025f120" />
 
- **Base Test Setup:** 'BaseTest' manages the browser lifecycle like launching the browser before each test and closing it after execution.

  <img width="958" height="939" alt="image" src="https://github.com/user-attachments/assets/00bfc458-fd32-48b3-b8b8-d5f956715d57" />

---

## Dependency Management (pom.xml)
The framework uses Maven to manage core testing dependencies.  

<img width="940" height="616" alt="image" src="https://github.com/user-attachments/assets/d9815ff7-93e4-40bc-baef-c9efb63048f8" />

#### Dependencies Used:
1. **selenium-java** v 4.50.0
2. **testng** v 7.12.0 

---

## Automated Test Scenarios

1. **Login Testcases ('LoginTest')**
   - Verifies successful login with valid credentials.
   - Verifies error messages for invalid credentials.
   - Verifies error messages for a locked-out user account.
2. **Product Testcases ('ProductsTest')**
   - Verifies that the correct number of products display on the page.
   - Verifies if a specific product name is present in the list.
3. **Logout Testcases ('LogoutTest')**
   - Verifies that clicking logout successfully redirects the user back to the login page.

---

## Test Runner Suite (testng.xml)
This file is used to run the automated tests together in a sequence.  

<img width="1058" height="348" alt="image" src="https://github.com/user-attachments/assets/ae894fff-4df2-4f7f-9b37-285560e140c8" />

---

## How to Run the Tests

### Prerequisites
1. **Java Development Kit (JDK)**.
2. **Apache Maven**.

### Using the Command Line
1. Git clone https://github.com/amulsinfal/basic-selenium-pom-framework
   
2. Go to basic-selenium-pom-framework folder
   ```
   cd basic-selenium-pom-framework
   ```
   
3. Run mvn clean test command:
   ```
   mvn clean test
   ```

### Using an IDE
Open the project in Eclipse right-click on the 'testng.xml' file, and select **Run As -> TestNG Suite**.  

<img width="1058" height="291" alt="image" src="https://github.com/user-attachments/assets/3eb50abc-d7d7-4800-8d31-330635b86f8a" />  

<img width="1058" height="341" alt="image" src="https://github.com/user-attachments/assets/ad3a1e81-dd33-40b3-9f41-cac4c104c565" />



---
