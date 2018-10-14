CREATE TABLE companies (
    id   INTEGER NOT NULL,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE messages (
    id   INTEGER   PRIMARY KEY NOT NULL ,
    date_time TIMESTAMP without time zone NOT NULL,
    phone_number VARCHAR(128) NOT NULL,
    company_id INTEGER NOT NULL,
    text VARCHAR(500) NOT NULL,
    FOREIGN KEY (company_id) REFERENCES companies(id)
);
