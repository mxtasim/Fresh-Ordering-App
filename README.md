
# Restaurant Order Management App

This is a **Java GUI desktop application** developed using **NetBeans IDE**. It is designed for restaurant staff to manage orders placed from tablets or iPads. The app allows staff to log in, sign up new users, handle customer support requests, and generate receipts with the ability to download them as PDF files.

---

## Features

- **User Authentication**
  - Login page to verify existing users
  - Sign-up page to create new user accounts

- **Customer Support**
  - Manage customer support data through a dedicated page

- **Order Management**
  - Designed for restaurant employees to receive and process orders from tablets/iPads
  - Generate and download order receipts as PDF files

---

## Data Storage

- All application data is stored in simple text files located in the `Fresh` folder:
  1. `Logins` — stores user login information
  2. `CustomerSupport` — stores customer support data

---

## Important Setup Instructions

> ⚠️ **You must update the file save directory paths in the source code to match your local PC directory before running the application.**

- **Login page (Home frame):**  
  - Location: Line 20  
  - Purpose: Checks if users exist  
  - File reference variable: `File f`

- **SignUp page (SignUp frame):**  
  - Location: Line 15  
  - Purpose: Creates new user accounts  
  - File reference variable: `File f`

- **Customer Support page (CustomerSupport frame):**  
  - Location: Line 19  
  - Purpose: Creates new files to store customer support data  
  - File reference variable: `File c`

---

## Usage

1. Open the project in NetBeans IDE.
2. Update the directory paths in the source files as described above to match your system.
3. Build and run the application.
4. Use the Login or SignUp pages to authenticate users.
5. Manage customer support requests.
6. Process orders and generate receipts downloadable as PDFs.

---

## Technologies

- Java (JDK 8 or above)
- Swing GUI (NetBeans GUI Builder)
- File handling using Java IO
- PDF generation 

---

## Notes

- This application stores data locally in text files, so it is best suited for small-scale or demo use.
- Make sure to adjust file paths according to your operating system's directory structure.

---



For questions or support, please open an issue or contact the maintainer.
