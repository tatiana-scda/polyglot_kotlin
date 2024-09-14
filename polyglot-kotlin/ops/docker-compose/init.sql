CREATE TABLE IF NOT EXISTS accounts (
  id INT PRIMARY KEY,
  username VARCHAR (50) UNIQUE NOT NULL,
  password VARCHAR (50) NOT NULL,
  email VARCHAR (255) UNIQUE NOT NULL
);

INSERT INTO accounts (id, username, password, email)
VALUES('1','username','password', 'user@email.com');