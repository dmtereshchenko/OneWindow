DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
    id              BIGINT          GENERATED           BY DEFAULT AS IDENTITY NOT NULL,
    name            VARCHAR(255)    NOT NULL,
    email           VARCHAR(255)    NOT NULL,
    binance_token   VARCHAR(255),
    CONSTRAINT      pk_user_email   UNIQUE(email),
    CONSTRAINT      pk_user         PRIMARY KEY(id)
);