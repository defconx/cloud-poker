CREATE TABLE IF NOT EXISTS player (
  id UUID,
  username varchar(20),
  first_name varchar(20),
  last_name varchar(20),
  email_address varchar(50),
  date_of_birth DATE,
  win_count INT,
  loss_count INT
);

