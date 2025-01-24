
# Whispero API

Whispero API is a backend application for a real-time chat system, supporting text, media messages, and user management. Built using **Spring Boot**, it provides RESTful endpoints for seamless communication between clients.

## Features

- **User Management**
  - OAuth2 authentication and synchronization with Identity Providers (IDPs).
  - Retrieve user details and online status.
  
- **Messaging**
  - Send text and media messages (image, audio, video).
  - Mark messages as seen.
  - Fetch chat history for a given chat ID.
  
- **Media Upload**
  - Support for uploading media files in chat.

- **Database**
  - Built-in persistence using JPA and PostgreSQL for relational data.

- **Audit Support**
  - Tracks message creation time and state transitions.

## Technologies Used

- **Backend Framework:** Spring Boot
- **Authentication:** Spring Security with OAuth2
- **Database:** PostgreSQL with JPA
- **Media Handling:** Multipart file upload
- **Build Tool:** Maven
- **Testing:** JUnit, Mockito
- **Dependencies:** Lombok, ModelMapper, Jakarta Persistence, and more

## Prerequisites

- **Java 21** or later
- **Maven** (version 3.6 or higher)
- **PostgreSQL** database setup
- **Keycloak** for authentication (or a similar OAuth2 provider)

## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/whispero-api.git
   cd whispero-api
   ```

2. **Configure the Application**
   - Update the `application.yml` or `application.properties` file with your database and OAuth2 configurations:
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

3. **Build and Run**
   - Build the project using Maven:
     ```bash
     mvn clean install
     ```
   - Start the application:
     ```bash
     mvn spring-boot:run
     ```

4. **API Endpoints**
   - Access the API at `http://localhost:8080/api/v1`.
   - Examples:
     - `POST /messages` - Send a message.
     - `POST /messages/upload-media` - Upload media.
     - `PATCH /messages` - Mark messages as seen.
     - `GET /users` - Fetch all users.

## Example Usage

### Sending a Message
- **Endpoint:** `POST /api/v1/messages`
- **Request Body:**
  ```json
  {
    "content": "Hello!",
    "senderId": "user1",
    "receiverId": "user2",
    "type": "TEXT",
    "chatId": "12345"
  }
  ```

### Uploading Media
- **Endpoint:** `POST /api/v1/messages/upload-media`
- **Form Data:**
  - `chat-id`: Chat ID
  - `file`: Media file (image, audio, or video)

## Future Enhancements

- **Notifications**: Implement real-time push notifications for new messages and updates.
- **Attachments**: Add support for document and file attachments.
- **CI/CD Pipeline**: Integrate GitHub Actions for continuous deployment.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests. For major changes, please open an issue first to discuss what you'd like to change.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.
```

Replace placeholders like `your-username` and database credentials with your actual details. Add or modify sections as needed based on your specific project features and setup.
