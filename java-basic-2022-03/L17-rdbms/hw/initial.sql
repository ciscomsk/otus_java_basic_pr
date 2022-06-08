CREATE DATABASE IF NOT EXISTS db_hw;

CREATE TABLE questions
(
    id   SERIAL PRIMARY KEY,
    text VARCHAR(100) NOT NULL
);

CREATE TABLE answers
(
    id          SERIAL PRIMARY key,
    question_id INTEGER REFERENCES questions (id),
    text        VARCHAR(100) NOT NULL
);

CREATE TABLE users
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100) NOT NULL,
    birth_date DATE         NOT NULL
);

create TABLE polls
(
    id              SERIAL PRIMARY KEY,
    date            DATE    NOT NULL,
    correct_answers INTEGER NOT NULL,
    wrong_answers   INTEGER NOT NULL,
    user_id         INTEGER REFERENCES users (id)
);

CREATE TABLE polls_details
(
    poll_id           INTEGER REFERENCES polls (id),
    question_id       INTEGER REFERENCES questions (id),
    user_answer_id    INTEGER REFERENCES answers (id),
    is_correct_answer BOOLEAN NOT NULL
);