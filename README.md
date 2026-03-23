<h1 align="center"> 🛒 AuraMart - Enterprise-Grade Full-Stack E-Commerce Ecosystem </h1>

<p align="center"> 
  <img src="https://img.shields.io/badge/Java_24-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot_3.5-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/AWS_S3-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white" />
  <img src="https://img.shields.io/badge/OAuth2.0-4285F4?style=for-the-badge&logo=google&logoColor=white" />
  <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white" />
</p>

<p align="center">
  <b>A highly scalable, cloud-native B2C platform architected with modern software design patterns. 
  AuraMart leverages distributed cloud services and enterprise security protocols to deliver a production-ready shopping experience.</b>
</p>

---

## 🔗 Connect with Developer
<p align="left">
  <a href="https://www.linkedin.com/in/mohd-naved-82757a2aa/"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" /></a>
  <a href="navedsheikh7983@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" /></a>
  <a href="https://bit.ly/4rMkxbk"><img src="https://img.shields.io/badge/Live_Deployment-FF9900?style=for-the-badge&logo=amazon-s3&logoColor=black" /></a>
</p>

---

## 📸 Application Interface

<p align="center">
  <b>Admin Dashboard</b><br>
  <i><img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/3a4888d9-ee6a-4229-92b8-26e99fb8d9f3" />
</i>
</p>

<p align="center">
  <b>User Shopping Cart</b><br>
  <i><img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/62d63ac4-3345-4272-86e1-5c19cf79e3f6" />
</i>
</p>

---

## 🛠️ Comprehensive Tech Stack

### Backend Core & Infrastructure
* **Java 24:** Utilizing modern syntax for optimal performance.
* **Spring Boot 3.5.5:** Powering the micro-kernel architecture.
* **Spring Data JPA & Hibernate:** Advanced Object-Relational Mapping (ORM) for efficient database queries.
* **Lombok:** Reducing boilerplate code for cleaner, maintainable data models.

### Security Framework
* **Spring Security:** Implementing a robust security filter chain.
* **Google OAuth 2.0 Client:** Integrated Social Login for frictionless user onboarding.
* **RBAC:** Granular authorization logic separating `USER` and `ADMIN` privileges.
* **Environment Secrets:** Keys are injected via system environment variables for maximum safety.

### Cloud & Third-Party Integrations
* **AWS S3 (aws-java-sdk-s3):** Centralized and scalable cloud storage for dynamic product images and user profiles.
* **AWS Elastic Beanstalk:** Orchestrating automated deployment and load balancing.
* **JavaMailSender:** Automated SMTP server integration for real-time order tracking and user notifications.
* **MySQL 8:** Reliable relational database management.

### Frontend
* **Thymeleaf:** Server-side Java template engine for dynamic web pages.
* **Web Technologies:** HTML5, CSS3, Bootstrap 5.

---

## ⚡ Key Engineering Features

### 👤 Advanced User Experience
* **Persistent Cart Logic:** State-aware shopping cart that survives session transitions.
* **Automated Notification Engine:** Real-time email triggers for order placements and status updates.
* **Dynamic UI Rendering:** Powered by Thymeleaf Fragments for modular components.

### 🛡️ Enterprise Admin Controls
* **Centralized Admin Console:** Dashboard for real-time inventory and user monitoring.
* **Product Lifecycle Management:** Full CRUD capabilities with integrated **Soft Delete** logic.
* **Direct Cloud-Media Pipeline:** Automatic direct-to-S3 upload streams.

---

## ⚙️ Environment Configuration

Before running locally, export the following variables to your system environment:

```env
# Database Settings
DB_URL=jdbc:mysql://localhost:3306/galaxystore
DB_USERNAME=root
DB_PASSWORD=your_secure_password

# AWS Cloud Credentials
AWS_ACCESS_KEY=your_iam_access_key
AWS_SECRET_KEY=your_iam_secret_key

# OAuth & Mail
GOOGLE_CLIENT_ID=your_id.apps.googleusercontent.com
GOOGLE_CLIENT_SECRET=your_client_secret
EMAIL_USERNAME=support@auramart.com
EMAIL_PASSWORD=your_app_password
````

-----

## 📦 Local Build & Execution

```bash
# Clone the source
git clone [https://github.com/Naved-Sheikh/AuraMart-Full-Stack-Springboot-Project.git](https://github.com/Naved-Sheikh/AuraMart-Full-Stack-Springboot-Project.git)

# Navigate to directory
cd AuraMart-Full-Stack-Springboot-Project

# Execute Maven Build (Skips tests)
mvn clean install -DskipTests

# Launch the Application
mvn spring-boot:run
```

-----

\<p align="center"\>
\<i\>Developed and Engineered by \<b\>Mohd Naved\</b\>\</i\>
\</p\>
