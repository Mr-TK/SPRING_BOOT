-- Drop user first if they exist
DROP USER if exists 'bms'@'localhost' ;

-- Now create user with prop privileges
CREATE USER 'bms'@'localhost' IDENTIFIED BY 'bms@123';

GRANT ALL PRIVILEGES ON * . * TO 'bms'@'localhost';