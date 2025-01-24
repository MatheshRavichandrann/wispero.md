# Wispero.MD (Messaging Application)

This is a **Messaging Application** backend built using **Spring Boot**. It supports user authentication with Keycloak, database integration with PostgreSQL, WebSocket communication for real-time messaging, and media file uploads.

## Features

- User authentication and management using Keycloak.
- Real-time messaging via WebSocket.
- Media file uploads (images, videos, etc.).
- Angular frontend support with Nginx deployment.
- CI/CD pipeline using GitHub Actions.
- Dockerized deployment for seamless integration.

## Technologies Used

### Backend
- Java 21
- Spring Boot
- WebSocket
- PostgreSQL
- Keycloak

### Frontend
- HTML, CSS
- Angular
- Nginx

### DevOps
- Docker
- GitHub Actions
- Render (for deployment)

## Prerequisites

- **Java 21**
- **Maven**
- **PostgreSQL**
- **Keycloak**
- **Docker**
- **Node.js** (for Angular frontend)

## Setup Instructions

### 1. Clone the Repository
```bash
git clone <repository-url>
cd <repository-directory>
```

### 2. Configure the Application

#### Keycloak
- Set up Keycloak with your realm, clients, and users.
- Update the `application.yml` with Keycloak configurations.

#### PostgreSQL
- Create a PostgreSQL database.
- Update the `application.yml` with the database URL, username, and password.

```yaml
spring:
  datasource:
    url: jdbc:postgresql://<db_host>:<db_port>/<db_name>
    username: <db_username>
    password: <db_password>
```

#### WebSocket
- Ensure the WebSocket endpoint is correctly configured in the backend and aligns with the frontend setup.

#### Media Uploads
- Update the file storage location in the backend, if necessary.

### 3. Build and Run the Backend

#### Using Maven
```bash
mvn clean install
java -jar target/<jar-file>.jar
```

#### Using Docker
Build the Docker image:
```bash
docker build -t messaging-app-backend .
```
Run the container:
```bash
docker run -p 8080:8080 messaging-app-backend
```

### 4. Set Up the Frontend
- Navigate to the frontend project directory.
- Install dependencies and build the project:
```bash
npm install
ng build --prod
```
- Deploy the Angular build with Nginx.

### 5. Deployment
#### Using Render
- Push your code to GitHub.
- Configure the Render service for automatic deployment.

#### CI/CD with GitHub Actions
- Set up the GitHub Actions workflow file in `.github/workflows/ci-cd.yml` for automatic testing and deployment.

## API Endpoints

| Endpoint                | Method | Description                |
|-------------------------|--------|----------------------------|
| `/auth/login`           | POST   | Authenticate a user        |
| `/auth/register`        | POST   | Register a new user        |
| `/messages`             | GET    | Fetch user messages        |
| `/messages/send`        | POST   | Send a new message         |
| `/media/upload`         | POST   | Upload media files         |

## Contribution

Feel free to submit issues or create pull requests for enhancements and bug fixes. Follow the project's code of conduct when contributing.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
