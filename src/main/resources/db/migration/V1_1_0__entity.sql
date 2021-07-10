CREATE SEQUENCE COMPETENCE_SEQ;

CREATE TABLE COMPETENCES
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('COMPETENCE_SEQ'),
    TITLE VARCHAR(255) NOT NULL,
    DESCRIPTION TEXT
);

CREATE SEQUENCE AREA_SEQ;

CREATE TABLE AREAS
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('AREA_SEQ'),
    TITLE VARCHAR(255) NOT NULL,
    DESCRIPTION TEXT
);

CREATE SEQUENCE TRIBE_SEQ;

CREATE TABLE TRIBES
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('TRIBE_SEQ'),
    TITLE VARCHAR(255) NOT NULL,
    DESCRIPTION TEXT
);