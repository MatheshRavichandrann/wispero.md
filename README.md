# Whispero API

A scalable backend application for a real-time chat system, enabling seamless communication with user management, text, and media messaging.

---

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)# Wispero.MD (Messaging Application)

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

  - [Configuration](#configuration)
  - [Build and Run](#build-and-run)
- [API Endpoints](#api-endpoints)
  - [Message APIs](#message-apis)
  - [User APIs](#user-apis)
- [Example Usage](#example-usage)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **User Management**
  - OAuth2 authentication and synchronization with IDPs.
  - Fetch online statuses and user details.

- **Messaging**
  - Send and retrieve text/media messages.
  - Mark messages as seen.

- **Media Upload**
  - Supports file uploads (image, audio, video).

- **Database**
  - Robust persistence with PostgreSQL.

- **Audit Support**
  - Tracks message states and timestamps.

---

## Technologies Used

- **Backend Framework:** Spring Boot
- **Database:** PostgreSQL with JPA
- **Authentication:** Keycloak and OAuth2
- **Media Handling:** Multipart file upload
- **Testing:** JUnit, Mockito
- **Build Tool:** Maven

---

## Getting Started

### Prerequisites

Ensure the following tools are installed:

- Java 21+
- Maven 3.6+
- PostgreSQL
- Keycloak (or a similar OAuth2 provider)

---

### Configuration

1. Update the database and OAuth2 credentials in `src/main/resources/application.yml`:

   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/whispero
       username: your-username
       password: your-password
     jpa:
       hibernate:
         ddl-auto: update
   ```

2. Set up Keycloak:
   - Configure a realm and a client for authentication.
   - Update the Keycloak URL and credentials in `application.yml`.

---

### Build and Run

1. Build the project:
   ```bash
   mvn clean install
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## API Endpoints

### Message APIs

| Endpoint                       | Method | Description                   |
|--------------------------------|--------|-------------------------------|
| `/api/v1/messages`             | POST   | Send a message                |
| `/api/v1/messages/upload-media`| POST   | Upload media                  |
| `/api/v1/messages/{id}`        | PATCH  | Mark messages as seen         |

### User APIs

| Endpoint          | Method | Description              |
|-------------------|--------|--------------------------|
| `/api/v1/users`   | GET    | Get user details         |
| `/api/v1/users/{id}`| GET   | Fetch specific user info |

---

## Example Usage

<details>
<summary>Sending a Message</summary>

**Endpoint:** `POST /api/v1/messages`  
**Request Body:**

```json
{
  "content": "Hello!",
  "senderId": "user1",
  "receiverId": "user2",
  "type": "TEXT",
  "chatId": "12345"
}
```

</details>

<details>
<summary>Uploading Media</summary>

**Endpoint:** `POST /api/v1/messages/upload-media`  
**Form Data:**
- `chat-id`: Chat ID
- `file`: Media file (image, audio, or video)

</details>

---

## Future Enhancements

- Push notifications for real-time updates.
- Document and file attachments.
- Implement a CI/CD pipeline using GitHub Actions.

---

## Contributing

Contributions are welcome! Please:
- Fork the repo.
- Make your changes in a feature branch.
- Submit a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE).
```
