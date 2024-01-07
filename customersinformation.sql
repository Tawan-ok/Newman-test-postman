ALTER USER 'root'@'localhost' IDENTIFIED BY 'tawanday9';
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `customersinformation` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE customersinformation;

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO customers (name, email) VALUES 
('John Doe', 'john.doe@example.com'),
('Jane Smith', 'jane.smith@example.com'),
('Alice Johnson', 'alice.johnson@example.com'),
('Bob Brown', 'bob.brown@example.com'),
('Mike Davis', 'mike.davis@example.com'),
('Laura Wilson', 'laura.wilson@example.com'),
('Sarah Miller', 'sarah.miller@example.com'),
('James Lee', 'james.lee@example.com'),
('Emily White', 'emily.white@example.com'),
('David Harris', 'david.harris@example.com');
