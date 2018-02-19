CREATE TABLE string_reverse
(
id number(10) NOT NULL,
original_string varchar(255) NOT NULL,
reversed_string varchar(255) NOT NULL,
date_time TIMESTAMP default systimestamp,
constraint string_reverse_pk PRIMARY KEY (id)
);