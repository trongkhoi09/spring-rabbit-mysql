CREATE TABLE IF NOT EXISTS product
(
    id INTEGER     NOT NULL AUTO_INCREMENT,
    product_name  VARCHAR(50) NOT NULL,
    product_code   VARCHAR(50),
    quantity       INTEGER,
    PRIMARY KEY (id)
);