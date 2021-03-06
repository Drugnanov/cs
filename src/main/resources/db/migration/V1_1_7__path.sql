CREATE SEQUENCE PATH_SEQ;

CREATE TABLE PATHS
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('PATH_SEQ'),
    TITLE VARCHAR(100) NOT NULL,
    DESCRIPTION TEXT,
    DUE_DATE TIMESTAMP,
    STATE INTEGER NOT NULL,
    ONE_TO_ONE_DATE TIMESTAMP,
    CHAPTER_MEMBER_ID BIGINT NOT NULL constraint PATH_CHAPTER_MEMBER_FKEY references ROLE_CHAPTER_MEMBERS
);

CREATE SEQUENCE PATH_ITEM_SEQ;

CREATE TABLE PATH_ITEMS
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('PATH_ITEM_SEQ'),
    WEIGHT INTEGER NOT NULL,
    PROGRESS VARCHAR(50),
    COMPLETED BOOLEAN NOT NULL DEFAULT false,
    PATH_ID BIGINT NOT NULL constraint PATH_ITEM_PATH_FKEY references PATHS,
    ACTIVITY_ID BIGINT NOT NULL constraint PATH_ITEM_ACTIVITY_FKEY references ACTIVITIES,
    EMPLOYEE_COMPETENCE_ID BIGINT NOT NULL constraint PATH_ITEM_EMPLOYEE_COMPETENCE_FKEY references EMPLOYEE_COMPETENCES
);

CREATE SEQUENCE PATH_ITEM_EVALUATION_SEQ;

CREATE TABLE PATH_ITEM_EVALUATIONS
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('PATH_ITEM_EVALUATION_SEQ'),
    RATING INTEGER NOT NULL,
    DESCRIPTION TEXT,
    PATH_ITEM_ID BIGINT NOT NULL constraint PATH_ITEM_EVALUATION_PATH_ITEM_FKEY references PATH_ITEMS,
    ROLE_ID BIGINT NOT NULL constraint PATH_ITEM_EVALUATION_ROLE_FKEY references ROLES
);

