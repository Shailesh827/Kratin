![userdb](https://github.com/Shailesh827/Kratin/assets/123078324/ed92618b-a972-4871-888f-1e63439dbd67)
![reminderdb](https://github.com/Shailesh827/Kratin/assets/123078324/59ac7336-677b-4d1f-9e1f-8de6dc424d53)
![medicindb](https://github.com/Shailesh827/Kratin/assets/123078324/71311621-9789-474b-bde5-a5e13eb830f9)
# Kratin
# Project Documentation

## Overview
This project is a web application for managing user registrations, reminders, and medication lists. It provides functionalities for user registration, creating reminders, and maintaining a list of medications. The application is built using the Spring Boot framework for the backend and React for the frontend.

## Backend
The backend of the application is developed using Spring Boot. It consists of several components including controllers, services, and repositories. These components work together to handle API requests, perform business logic, and interact with the database.

### API Endpoints
- `POST /api/users/register`: Register a new user.
- `POST /api/users/login`: Authenticate a user and generate an authentication token.
- `GET /api/reminders`: Get all reminders.
- `POST /api/reminders`: Create a new reminder.
- `GET /api/medications`: Get all medications.
- `POST /api/medications`: Create a new medication.

## Frontend
The frontend of the application is built using React. It consists of several components that are responsible for rendering different parts of the user interface and handling user interactions.

### Component Hierarchy
- App: The main component that handles routing and renders other components.
- RegistrationForm: Allows users to register by providing their username, password, email, and age.
- LoginForm: Enables users to log in with their credentials.
- ReminderForm: Allows users to create reminders by providing a name, description, and date/time.
- MedicationList: Displays a list of all medications.
- MedicationForm: Enables users to add new medications by providing a name, dosage, and frequency.

## Deployment
To deploy the application to a production environment, follow these general steps:
1. Set up a server or cloud hosting service for deploying the backend application.
2. Build the backend project into a deployable artifact (e.g., JAR file).
3. Configure the necessary environment variables and server settings for the backend application.
4. Set up a database server or use a database-as-a-service provider and configure the database connection settings.
5. Set up a production-ready web server (e.g., Nginx, Apache) to serve the frontend build files.
6. Build the frontend project for production.
7. Configure the web server to serve the frontend build files.
8. Update any necessary DNS or domain settings to point to your deployed application.

## Conclusion
This documentation provides an overview of the project's structure, components, API endpoints,
 and deployment guidelines. It serves as a reference for developers and other stakeholders involved 
in the project. Please note that this is a simplified documentation template, and you can expand it 
with more detailed information as per your project requirements.
![reminder](https://github.com/Shailesh827/Kratin/assets/123078324/b27eb191-3fa9-4d99-afe0-b96baf3b8a9c)
![medicinelist](https://github.com/Shailesh827/Kratin/assets/123078324/cc8ad8d1-ef52-4c72-b6d1-8d0c020913e6)
![loginm](https://github.com/Shailesh827/Kratin/assets/123078324/665bf40d-e1eb-49b9-958a-441ab9ffa7b4)
![register](https://github.com/Shailesh827/Kratin/assets/123078324/7742380b-7bdb-432e-872f-9448fea4b01a)
![home](https://github.com/Shailesh827/Kratin/assets/123078324/c4f6923b-756e-4ef1-b6b7-3eda09673c7a)
