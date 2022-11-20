CREATE TABLE IF NOT EXISTS invoice(
    id SERIAL,
    code DATE(20)NOT NULL,
    create_ad VARCHAR(100),
    total DECIMAL (8,2),
    PRIMARY KEY (id),
    FOREIGN KEY(client_id) REFERENCES client.id

 );