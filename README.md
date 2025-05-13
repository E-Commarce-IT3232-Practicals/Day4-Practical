# IT3232 E-Commerce Practicals - Day 4 - 2025-04-04 📚🚀

## 📝 Project Overview

This is a simple Spring Boot REST API for managing **students** and **courses**. It supports basic **CRUD operations** using in-memory storage (HashMap), designed to help students understand core RESTful principles with Spring Boot.

---

## 📦 Project Structure

```

src/
└── main/
└── java/
└── lk/ac/vau/fas/ict/
├── model/
│   ├── Student.java       # Student entity
│   └── Course.java        # Course entity
└── controller/
├── MapController.java # Student CRUD endpoints
└── CourseController.java # Course CRUD endpoints

````

---

## 🗃️ Data Storage

The application uses **in-memory storage** with `HashMap`:
- Students are stored using **registration number** as the key.
- Courses are stored using **course code** as the key.

---

## 📌 Example Usage & Outputs

### 👩‍🎓 Student API

#### ✅ Get All Students

**Output:**
![1 Get All Students](https://github.com/user-attachments/assets/b67d2aa0-4f1d-44a6-be5f-0bfb13e628e5)



#### ✅ Get Student by Registration Number

**Output:**
![3 Get One Student](https://github.com/user-attachments/assets/eaf8cb31-33d2-4858-a401-8b35305b2bca)



#### ✅ Add New Student

**Output:**
![5 Add New Student](https://github.com/user-attachments/assets/2554f5c3-083f-4377-9393-be022dd827ae)



#### ✅ Update Student

**Output:**
![7 Update a Student](https://github.com/user-attachments/assets/6716c63e-37ab-40a5-a729-afcdc585286a)



#### ✅ Delete Student

**Output:**
![10 Delete a Student](https://github.com/user-attachments/assets/8769db2a-d384-40a6-b26e-12837eb01dc2)


---
### 📚 Course API

#### ✅ Get All Courses

**Output:**
![2 Get All Courses](https://github.com/user-attachments/assets/bec0fc30-c0d9-41c7-8419-12d5b94fa724)



#### ✅ Get Course by Code

**Output:**
![4 Get One Course](https://github.com/user-attachments/assets/018adf5f-81fd-4b68-90d7-2e4d747fcd57)



#### ✅ Add New Course

**Output:**
![6 Add New Course](https://github.com/user-attachments/assets/b1296d08-4267-4b08-b865-3cd4a7d9de71)



#### ✅ Update Course

**Output:**
![8 Update a Course](https://github.com/user-attachments/assets/a1599684-d4a8-48e9-890f-b3b044fd6998)



#### ✅ Delete Course

**Output:**
![9 Delete a Course](https://github.com/user-attachments/assets/2b60e677-8078-4941-86f0-d14f981eddf2)



## 🧰 Technologies Used

* **Spring Boot** 🚀
* **Spring Web** 🌐
* **Java** ☕
* **Postman** for API Testing 🧪

---

## 💡 Notes

* All endpoints return JSON data.
* The project does **not use a database**. Data is lost upon server restart.
* Designed for educational and demonstration purposes.
