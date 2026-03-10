# Sourabh Awate – Professional Portfolio

A modern, high-performance portfolio architecture. This project features a Spring Boot 3.4 REST API backend and a decoupled Tailwind CSS frontend, demonstrating a clean separation of concerns and production-ready security practices.

---

## 📁 Project Structure

```
personal-portfolio/
├── frontend/                # UI Layer (HTML5, Tailwind CSS, JavaScript)
│   ├── assets/              # Images and brand assets
│   ├── index.html           # Main Entry Point
│   └── style.css            # Custom Tailwind configurations
│
└── backend/                 # API Layer (Spring Boot 3.4 + Java 17)
    ├── src/main/java/       # Controller, Service, and Model layers
    ├── src/main/resources/
    │   ├── application.properties  # Global Config (Push to Git)
    │   └── env.properties          # SECRETS (Excluded via .gitignore)
    └── pom.xml              # Maven Dependencies
```

---

## 🚀 Quick Start

### Prerequisites
- Backend: Java 17, Spring Boot 3.4, Spring Mail (SMTP), Jakarta Validation.

- Frontend: HTML5, Tailwind CSS v4, Vanilla JavaScript (Async/Await Fetch API).

- Security: Google App Passwords for SMTP, CORS Policy Management, Environment Secret Isolation.

Here is a polished, professional README.md file specifically tailored to your new monorepo structure. It’s designed to look great on GitHub and clearly explain your high-level tech choices to potential employers.

🚀 Sourabh Awate – Full-Stack Professional Portfolio
A modern, high-performance portfolio architecture. This project features a Spring Boot 3.4 REST API backend and a decoupled Tailwind CSS frontend, demonstrating a clean separation of concerns and production-ready security practices.

📁 Project Structure (Monorepo)
Plaintext
personal-portfolio/
├── frontend/                # UI Layer (HTML5, Tailwind CSS, JavaScript)
│   ├── assets/              # Images and brand assets
│   ├── index.html           # Main Entry Point
│   └── style.css            # Tailwind / Custom CSS
│
└── backend/                 # API Layer (Spring Boot 3.4 + Java 17)
├── src/main/java/       # Controller, Service, and Model layers
├── src/main/resources/
│   ├── application.properties  # Global Config (Safe for GitHub)
│   └── env.properties          # SECRETS (Excluded via .gitignore)
├── pom.xml              # Maven Dependencies
└── Dockerfile           # Backend Containerization

🛠️ Tech Stack

Backend: Java 17, Spring Boot 3.4, Spring Mail (SMTP), Jakarta Validation.

Frontend: HTML5, Tailwind CSS v4, Vanilla JavaScript (Async/Await Fetch API).

Security: Google App Passwords for SMTP, CORS Policy Management, Environment Secret Isolation.

Performance: Background processing via Spring @Async for instant form submission.

🚀 Quick Start
1. Backend Setup (IntelliJ)
   Navigate to the backend/ folder.

Create a file at src/main/resources/env.properties.

Add your Gmail App Password credentials:

Properties
GMAIL_USERNAME=your-email@gmail.com
GMAIL_PASSWORD=your-16-character-app-password
Run PortfolioApplication.java. The server will start at http://localhost:8080.


Gemini said
Here is a polished, professional README.md file specifically tailored to your new monorepo structure. It’s designed to look great on GitHub and clearly explain your high-level tech choices to potential employers.

🚀 Sourabh Awate – Full-Stack Professional Portfolio
A modern, high-performance portfolio architecture. This project features a Spring Boot 3.4 REST API backend and a decoupled Tailwind CSS frontend, demonstrating a clean separation of concerns and production-ready security practices.

📁 Project Structure (Monorepo)
Plaintext
personal-portfolio/
├── frontend/                # UI Layer (HTML5, Tailwind CSS, JavaScript)
│   ├── assets/              # Images and brand assets
│   ├── index.html           # Main Entry Point
│   └── style.css            # Tailwind / Custom CSS
│
└── backend/                 # API Layer (Spring Boot 3.4 + Java 17)
├── src/main/java/       # Controller, Service, and Model layers
├── src/main/resources/
│   ├── application.properties  # Global Config (Safe for GitHub)
│   └── env.properties          # SECRETS (Excluded via .gitignore)
├── pom.xml              # Maven Dependencies
└── Dockerfile           # Backend Containerization
🛠️ Tech Stack
Backend: Java 17, Spring Boot 3.4, Spring Mail (SMTP), Jakarta Validation.

Frontend: HTML5, Tailwind CSS v4, Vanilla JavaScript (Async/Await Fetch API).

Security: Google App Passwords for SMTP, CORS Policy Management, Environment Secret Isolation.

Performance: Background processing via Spring @Async for instant form submission.

🚀 Quick Start
1. Backend Setup (IntelliJ)
   Navigate to the backend/ folder.

Create a file at src/main/resources/env.properties.

Add your Gmail App Password credentials:

Properties
GMAIL_USERNAME=your-email@gmail.com
GMAIL_PASSWORD=your-16-character-app-password
Run PortfolioApplication.java. The server will start at http://localhost:8080.

2. Frontend Setup
   Navigate to the frontend/ folder.

Open index.html using a local server (like VS Code Live Server).

Ensure the JavaScript fetch() URL is pointing to your running backend: http://localhost:8080/api/contact.

