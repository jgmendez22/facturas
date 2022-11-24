CREATE TABLE IF NOT EXISTS product(
    id SERIAL,
    descripcion VARCHAR(50)NOT NULL,
    brand VARCHAR(100),
    stock VARCHAR (8),
    PRIMARY KEY (id)

 );
