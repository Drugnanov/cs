CREATE SEQUENCE seq_competence;

CREATE TABLE competence
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('seq_competence'),
    code VARCHAR(255),
    name VARCHAR(255)
)