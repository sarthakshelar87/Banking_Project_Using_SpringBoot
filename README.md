<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking System API</title>
</head>
<body>

<h1>Banking System API</h1>

<h2>Overview</h2>
<p>Welcome to the <strong>Banking System API</strong>! This project is a simple banking application built using Spring Boot, REST API, Hibernate, MySQL, and Lombok. It allows users to perform basic banking operations such as creating an account, viewing account details, depositing funds, withdrawing funds, and viewing all accounts.</p>
<p>Developed by <strong>Sarthak Shelar</strong>.</p>

<h2>Features</h2>
<ul>
    <li><strong>Create Account:</strong> Create a new bank account for a customer.</li>
    <li><strong>View Account:</strong> Retrieve details of an existing account by account ID.</li>
    <li><strong>Deposit:</strong> Add funds to an account.</li>
    <li><strong>Withdraw:</strong> Withdraw funds from an account.</li>
    <li><strong>View All Accounts:</strong> List all the accounts available in the system.</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li><strong>Spring Boot:</strong> For building the RESTful web services.</li>
    <li><strong>Hibernate:</strong> As the ORM framework for database interactions.</li>
    <li><strong>MySQL:</strong> For data storage.</li>
    <li><strong>Lombok:</strong> To reduce boilerplate code.</li>
    <li><strong>Maven:</strong> For project management and build automation.</li>
</ul>

<h2>Project Structure</h2>
<pre>
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── sarthak/
│   │           └── banking/
│   │               ├── controller/
│   │               ├── model/
│   │               ├── repository/
│   │               ├── service/
│   │               └── BankingApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql
└── test/
    └── java/
        └── com/
            └── sarthak/
                └── banking/
                    └── BankingApplicationTests.java
</pre>

<h2>Endpoints</h2>
<p>Here are the main REST endpoints:</p>
<ul>
    <li>
        <strong>Create Account</strong>
        <ul>
            <li><strong>POST</strong> <code>/api/accounts</code></li>
            <li>Request Body: JSON containing account details</li>
            <li>Response: Created account details</li>
        </ul>
    </li>
    <li>
        <strong>View Account</strong>
        <ul>
            <li><strong>GET</strong> <code>/api/accounts/{id}</code></li>
            <li>Path Parameter: <code>id</code> (Account ID)</li>
            <li>Response: Account details</li>
        </ul>
    </li>
    <li>
        <strong>Deposit Funds</strong>
        <ul>
            <li><strong>POST</strong> <code>/api/accounts/{id}/deposit</code></li>
            <li>Path Parameter: <code>id</code> (Account ID)</li>
            <li>Request Body: JSON containing the amount to deposit</li>
            <li>Response: Updated account balance</li>
        </ul>
    </li>
    <li>
        <strong>Withdraw Funds</strong>
        <ul>
            <li><strong>POST</strong> <code>/api/accounts/{id}/withdraw</code></li>
            <li>Path Parameter: <code>id</code> (Account ID)</li>
            <li>Request Body: JSON containing the amount to withdraw</li>
            <li>Response: Updated account balance</li>
        </ul>
    </li>
    <li>
        <strong>View All Accounts</strong>
        <ul>
            <li><strong>GET</strong> <code>/api/accounts</code></li>
            <li>Response: List of all accounts</li>
        </ul>
    </li>
</ul>

<h2>Installation</h2>
<ol>
    <li><strong>Clone the repository:</strong>
        <pre>
git clone https://github.com/your-username/Banking_Project_Using_SpringBoot.git
cd Banking_Project_Using_SpringBoot
        </pre>
    </li>
    <li><strong>Set up the database:</strong>
        <ul>
            <li>Ensure MySQL is installed and running.</li>
            <li>Create a database named <code>banking_db</code>.</li>
            <li>Update <code>src/main/resources/application.properties</code> with your MySQL username and password.</li>
        </ul>
    </li>
    <li><strong>Build the project:</strong>
        <pre>mvn clean install</pre>
    </li>
    <li><strong>Run the application:</strong>
        <pre>mvn spring-boot:run</pre>
    </li>
    <li><strong>Access the API:</strong>
        <p>The application runs on <code>http://localhost:8080</code>.</p>
    </li>
</ol>

<h2>Interactive API Documentation</h2>
<p>To explore and test the API interactively, use the Swagger UI, accessible at:</p>
<p><code>http://localhost:8080/swagger-ui.html</code></p>

<h2>Contributing</h2>
<p>If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.</p>

<h2>License</h2>
<p>This project is open-source and available under the MIT License.</p>

</body>
</html>
