CREATE TABLE tasks(
    id serial PRIMARY KEY,
    title varchar(100) NOT NULL,
    assignee varchar(100) NOT NULL UNIQUE,
    description varchar(200) NOT NULL,
    priority smallint CHECK (priority IN (1, 2, 3)) NOT NULL,
    createdAt timestamp DEFAULT current_timestamp,
    dueDate timestamp NOT NULL
);
