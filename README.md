Project Name Springbootk, backend rest APi for a mock e-school platform.

Description

This project implements a system for managing courses, instructors, and students, enabling CRUD operations (Create, Read, Update, Delete) and providing functionalities for retrieving specific course details and instructor information. It utilizes JPA (Java Persistence API) for data persistence and RESTful APIs for data access.

Entities

Course:
courseId (int, primary key): Unique identifier for the course.
courseName (String): Name of the course.
courseDescription (String): Detailed description of the course.
students (Set<Student>, many-to-many relationship with Student): Enrolled students in the course.
instructor (Instructor, one-to-many relationship with Instructor): The instructor who teaches the course.
Instructor:
insId (int, primary key): Unique identifier for the instructor.
insName (String): Name of the instructor.
insTitle (String): Instructor's title (e.g., Professor, Lecturer).
insDepartment (String): Department the instructor belongs to.
insEmail (String): Email address of the instructor.
courses (Set<Course>, many-to-many relationship with Course): Courses taught by the instructor.
Student:
studId (int, primary key): Unique identifier for the student.
studName (String): Name of the student.
studDepartment (String): Department the student belongs to.
studEmail (String): Email address of the student.
courses (Set<Course>, many-to-many relationship with Course): Courses enrolled in by the student.
Technologies Used

Java
Spring Boot
JPA (Hibernate/EclipseLink)
Spring Data JPA
RESTful APIs
Project Structure

src/main/java/
    com/yourpackage/
        entities/
            Course.java
            Instructor.java
            Student.java
        repositories/
            CourseRepository.java
            InstructorRepository.java
            StudentRepository.java
        services/
            CourseService.java
            InstructorService.java
            StudentService.java
        controllers/
            CourseController.java
            InstructorController.java
            StudentController.java
application.properties
pom.xml
(Replace com/yourpackage with your actual package name)

Building and Running the Project

Clone the repository:
Bash
git clone https://github.com/your-username/your-project-name.git
Use code with caution.
Navigate to the project directory:
Bash
cd your-project-name
Use code with caution.
Build the project using Maven:
Bash
mvn clean install
Use code with caution.
Run the application using Spring Boot:
Bash
mvn spring-boot:run
Use code with caution.
The application will typically start on port 8080 by default. You can access the RESTful APIs at http://localhost:8080/your-api-endpoint (replace your-api-endpoint with the specific endpoint you're targeting).

Supported Endpoints and Functionality

Courses:
Create a new course (POST /courses)
Get all courses (GET /courses)
Get details of a specific course by ID, including dynamically populated instructor and student information (GET /courses/{id})
Update an existing course (PUT /courses/{id})
Delete a course (DELETE /courses/{id})
Instructors: (Similar logic for GET, POST, PUT, DELETE operations)
Create a new instructor (POST /instructors)
Get all instructors
Get details of a specific instructor by ID
Update an existing instructor
Delete an instructor
Students: (Similar logic for CRUD operations and dynamic population)
Create a new student
Get all students
Get details of a specific student by ID
Update an existing student
Delete a student
