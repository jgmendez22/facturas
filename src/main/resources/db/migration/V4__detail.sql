CREATE TABLE IF NOT EXISTS detail(
    id SERIAL,
    quantity DECIMAL,
    FOREIGN KEY(product_id) REFERENCES product.id
    FOREIGN KEY(invoice_id) REFERENCES invoice.id
    PRIMARY KEY (id),
 );