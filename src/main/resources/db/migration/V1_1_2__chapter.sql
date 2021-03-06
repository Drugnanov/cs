CREATE SEQUENCE CHAPTER_SEQ;

CREATE TABLE CHAPTERS
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('CHAPTER_SEQ'),
    TITLE VARCHAR(100) NOT NULL,
    DESCRIPTION TEXT,
    AREA_ID BIGINT NOT NULL
        constraint CHAPTER_AREA_FKEY references AREAS
);