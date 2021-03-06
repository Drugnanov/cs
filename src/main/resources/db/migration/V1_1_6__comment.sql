CREATE SEQUENCE COMMENT_SEQ;

CREATE TABLE COMMENTS
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('COMMENT_SEQ'),
    TEXT TEXT,
    CREATED TIMESTAMP NOT NULL,
    ENTITY_TYPE INTEGER NOT NULL,
    ENTITY_ID BIGINT NOT NULL,
    ROLE_ID BIGINT NOT NULL constraint COMMENT_NOTE_ROLE_FKEY references ROLES
);

CREATE SEQUENCE COMMENT_NOTE_SEQ;

CREATE TABLE COMMENT_NOTES
(
    ID BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('COMMENT_NOTE_SEQ'),
    TEXT TEXT,
    CREATED TIMESTAMP NOT NULL,
    COMMENT_ID BIGINT NOT NULL constraint COMMENT_NOTE_COMMENT_FKEY references COMMENTS,
    ROLE_ID BIGINT NOT NULL constraint COMMENT_NOTE_ROLE_FKEY references ROLES
);

