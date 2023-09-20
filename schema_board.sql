DROP TABLE IF EXISTS post;

CREATE TABLE IF NOT EXISTS post (
    id varchar(255) NOT NULL,
    author varchar(20) NULL,
    title varchar(20) NULL,
    body varchar(1000) NULL,
    deleted bool NOT NULL,
    created_date timestamp NULL,
    updated_date timestamp NULL,
    PRIMARY KEY (id)
);