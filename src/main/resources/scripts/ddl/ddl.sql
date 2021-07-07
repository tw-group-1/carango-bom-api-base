CREATE TABLE BRANDS (
	ID SERIAL PRIMARY KEY,
	NAME VARCHAR (100) NOT NULL,
	CREATED_AT TIMESTAMP NOT NULL,
	UPDATED_AT TIMESTAMP
)

CREATE TABLE USERS (
	ID SERIAL PRIMARY KEY,
	NAME VARCHAR (100) NOT NULL,
	PASSWORD VARCHAR(250) NOT NULL,
	CREATED_AT TIMESTAMP NOT NULL,
	UPDATED_AT TIMESTAMP
)


CREATE TABLE VEHICLES (
	ID SERIAL PRIMARY KEY,
	BRAND_ID INT NOT NULL,
	MODEL VARCHAR (100) NOT NULL,
	YEAR CHAR (4) NOT NULL,
	PRICE DECIMAL(10, 2) NOT NULL,
	CREATED_AT TIMESTAMP NOT NULL,
	UPDATED_AT TIMESTAMP,
	FOREIGN KEY (BRAND_ID) REFERENCES BRANDS (ID)
)