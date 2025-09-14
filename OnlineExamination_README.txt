Online Examination System
-------------------------

Objective:
----------
The objective of this project is to develop a simple console-based Online Examination System in Java.
The program demonstrates concepts of user authentication, profile management, exam functionality with timer, and result calculation.

Features:
---------
- User login system with default credentials.
- Option to update profile and password.
- Start an exam with multiple-choice questions.
- 60-second timer for the exam (auto-submit if time expires).
- Score calculation and result display.
- Logout and exit functionality.

Steps Performed:
----------------
1. Created a User class with username and password attributes, along with a profile update method.
2. Implemented login functionality for user authentication.
3. Provided option to update profile and password.
4. Designed exam functionality with multiple-choice questions and a 60-second timer.
5. Calculated the score based on correct answers.
6. Implemented logout and exit options for session management.

Tools Used:
-----------
- Programming Language: Java
- Development Environment: Any IDE (Eclipse, IntelliJ, VS Code) or Command Line
- Java JDK 8 or higher

How to Run:
-----------
1. Save the program as OnlineExamination.java
2. Compile using: javac OnlineExamination.java
3. Run using: java OnlineExamination

Sample Menu Flow:
-----------------
===== ONLINE EXAMINATION SYSTEM =====
1. Login
2. Update Profile & Password
3. Start Exam
4. Logout
5. Exit
Enter choice: 1

Enter Username: Divyash
Enter Password: Divyash1234
Login successful!
===== ONLINE EXAMINATION SYSTEM =====
1. Login
2. Update Profile & Password
3. Start Exam
4. Logout
5. Exit
Enter choice: 3

Exam Started! (Timer: 60 seconds)
Q1. Java is a __ language? 
1.Object-Oriented  2.Procedural  3.Scripting  4.Machine
Enter answer (1-4): 1
Q2. Which keyword is used to inherit a class in Java? 
1.this  2.super  3.extends  4.import
Enter answer (1-4): 3
Q3. Which of these is not a Java feature? 
1.Platform Independent  2.Multithreaded  3.Pointer Arithmetic  4.Secure
Enter answer (1-4): 3
Exam finished. Your Score: 3/3


Outcome:
--------
- Provides a simple yet functional simulation of an online examination system.
- Reinforces knowledge of Java concepts such as classes, objects, methods, conditionals, loops, and arrays.
- Gives hands-on experience in building authentication and exam logic with timer functionality.
