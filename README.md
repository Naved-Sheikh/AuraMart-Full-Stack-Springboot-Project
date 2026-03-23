
<h1 align="center"> 🛒 AuraMart - Enterprise-Grade Full-Stack E-Commerce Ecosystem </h1>

<p align="center"> 
  <img src="https://img.shields.io/badge/Java_24-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot_3.5-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Security_6-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL_8-005C84?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Amazon_AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white" />
  <img src="https://img.shields.io/badge/Hibernate_6-B71C1C?style=for-the-badge&logo=hibernate&logoColor=white" />
</p>

<p align="center">
  <b>A highly scalable, cloud-native B2C platform architected with modern software design patterns. 
  AuraMart leverages distributed cloud services and enterprise security protocols to deliver a production-ready shopping experience.</b>
</p>

---

## 🔗 Connect with Developer
<p align="left">
  <a href="https://www.linkedin.com/in/mohd-naved-88b0a9277/"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" /></a>
  <a href="mailto:navedsheikh8859@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" /></a>
  <a href="https://bit.ly/4rMkxbk"><img src="https://img.shields.io/badge/Live_Deployment-FF9900?style=for-the-badge&logo=amazon-s3&logoColor=black" /></a>
</p>

---

## 🛠️ Comprehensive Tech Stack

### Backend Core & Infrastructure
* **Java 24 (Latest LTS Features):** Utilizing modern syntax for optimal performance.
* **Spring Boot 3.5.5:** Powering the micro-kernel architecture and dependency injection.
* **Spring Data JPA & Hibernate 6:** Advanced Object-Relational Mapping (ORM) with optimized query execution.
* **HikariCP:** High-performance JDBC connection pooling for low-latency interactions.

### Security Framework
* **Spring Security 6:** Implementing a robust security filter chain.
* **Google OAuth 2.0:** Integrated Social Login for frictionless onboarding.
* **RBAC:** Granular authorization logic separating `USER` and `ADMIN` privileges.
* **BCrypt Encryption:** Industry-standard password hashing.
* **Environment-Level Secrets:** Keys are injected via system environment variables for maximum safety.

### Cloud & DevOps (AWS Ecosystem)
* **AWS Elastic Beanstalk:** Orchestrating automated deployment and load balancing.
* **AWS RDS (MySQL 8):** Managed relational database with high availability.
* **AWS S3:** Centralized cloud storage for product images and user profiles.

---

## ⚡ Key Engineering Features

### 👤 Advanced User Experience
* **Persistent Cart Logic:** State-aware shopping cart that survives session transitions.
* **Automated Notification Engine:** Real-time email triggers via **JavaMailSender** for order updates.
* **Dynamic UI Rendering:** Powered by **Thymeleaf Fragments** for modular components.
* **Order Tracking:** Transparency with a personalized "My Orders" dashboard.

### 🛡️ Enterprise Admin Controls
* **Centralized Admin Console:** Dashboard for real-time inventory and user monitoring.
* **Product Lifecycle Management:** Full CRUD capabilities with integrated **Soft Delete** logic.
* **Direct Cloud-Media Pipeline:** Automatic direct-to-S3 upload streams.
* **Order Fulfillment System:** Real-time status updates reflecting across the ecosystem instantly.

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

# Execute Maven Build
mvn clean install -DskipTests

# Launch the Application
mvn spring-boot:run
```

-----

\<p align="center"\>
\<i\>Developed and Engineered by \<b\>Mohd Naved\</b\>\</i\>
\</p\>

```
```
