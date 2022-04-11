
CREATE TABLE users (
    id integer NOT NULL,
    username character varying(255) NOT NULL,
    email character varying(255) NOT NULL,
    password character varying(60) NOT NULL
);


ALTER TABLE users OWNER TO rosinfra_new;


CREATE SEQUENCE users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 2147483647
    CACHE 1;

ALTER TABLE users_id_seq OWNER TO rosinfra_new;


ALTER SEQUENCE users_id_seq OWNED BY users.id;

INSERT INTO users (id,username,email,password) VALUES (1,'Ivan','ivan@mail.ru',1); 
INSERT INTO users (id,username,email,password) VALUES (2,'Stepan','stepan@mail.ru',2); 
INSERT INTO users (id,username,email,password) VALUES (3,'Petr','petr@mail.ru',3); 


SELECT * FROM users WHERE username = "Stepan";

UPDATE users SET username = "Stepa" WHERE id = 2; 