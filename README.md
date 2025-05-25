# ✈️ Flight Management System 2.0 – Java Console Application

**By Anshdeep**

---

## Overview

This is a Java console-based Flight Management System simulating a comprehensive airline ticketing experience with role-based access for **Admin**, **Agent**, and **Passenger** users. The system supports:

* Flight booking and cancellation
* Multiple seat classes (Economy, Business, First)
* Food preferences (Veg, Non-Veg)
* Simulated payment process
* Email booking confirmation with detailed flight info (v2.0)

---

## 🛠 Features (Version 2.0)

### Implemented

* **Booking and cancellation** with seat availability tracking
* **Role-based access control** (Admin, Agent, Passenger)
* **Email notifications** upon successful booking including:

  * Booking ID
  * Flight ID with route and time (e.g., `FL102 (IND-DEL, 6:00PM)`)
  * Seat class and food option
* Simulated payment process
* File-based input/output for data persistence
* Logging of bookings

### Planned (Roadmap)

| Step | Feature            | Status  | Description                    |
| ---- | ------------------ | ------- | ------------------------------ |
| 1️⃣  | QR Code Generation | Pending | Generate QR codes for tickets  |
| 2️⃣  | Admin Analytics    | Pending | View total bookings, revenue   |
| 3️⃣  | Password Hashing   | Pending | Secure passwords with SHA-256  |
| 4️⃣  | OTP Login          | Pending | One-Time Password login system |
| 5️⃣  | Search Filters     | Pending | Filter flights by date, route  |
| 6️⃣  | Booking History    | Pending | View user booking history      |
| 7️⃣  | GUI Implementation | Planned | Add a graphical user interface |

---

## 🎯 How This Project Works

* Uses **Java Scanner** for console input and **System.out.println** for output
* Stores flight, booking, and user data in local files
* Sends booking confirmation emails via Gmail SMTP using JavaMail API
* Simulates payment without real transaction processing

## 📧 Email Confirmation (v2.0) Details

* Triggered on every successful booking
* Email includes:

  * Booking ID
  * Flight details (`FlightID (Source-Destination, Time)`)
  * Selected seat class and food preference





## Version 3.0 Uploaded

The latest **Flight Management System 3.0** is now available on GitHub:  
[https://github.com/Anshdeep6963015/FlightmanagementSystem3.0](https://github.com/Anshdeep6963015/FlightmanagementSystem3.0)




## 👨‍💻 Author

Anshdeep — CSE student at Chitkara University

* Email: anshdeeep24072004@gmail.com
* University Email: anshdeep1779.be23@chitkara.edu.in

