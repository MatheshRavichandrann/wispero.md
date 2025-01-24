# Whispero API

A scalable backend application for a real-time chat system, enabling seamless communication with user management, text, and media messaging.

---

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
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
