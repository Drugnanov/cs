CREATE SEQUENCE EMPLOYEE_SEQ;

CREATE TABLE EMPLOYEES
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('EMPLOYEE_SEQ'),
    NAME VARCHAR(100) NOT NULL,
    SURNAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(200) NOT NULL,
    EXTERNAL_ID VARCHAR(50)
);

CREATE SEQUENCE EMPLOYEE_COMPETENCE_SEQ;

CREATE TABLE EMPLOYEE_COMPETENCES
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('EMPLOYEE_COMPETENCE_SEQ'),
    LEVEL INTEGER NOT NULL,
    OBTAINED_DATE TIMESTAMP NOT NULL,
    EMPLOYEE_ID BIGINT NOT NULL
        constraint EMPLOYEE_COMPETENCE_EMPLOYEE_FKEY references EMPLOYEES,
    COMPETENCE_ID BIGINT NOT NULL
        constraint EMPLOYEE_COMPETENCE_COMPETENCE_FKEY references EMPLOYEES
);