CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    assignee VARCHAR(100) NOT NULL,
    createdAt TIMESTAMP NOT NULL,
    description VARCHAR(200) NOT NULL,
    priority SMALLINT CHECK (priority IN (0, 1, 2)) NOT NULL,
    dueDate TIMESTAMP NOT NULL
);

CREATE TABLE task_list (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE belong (
    task_id INT NOT NULL,
    list_id INT NOT NULL,
    position_task INT NOT NULL,
    FOREIGN KEY (task_id) REFERENCES tasks(id) ON DELETE CASCADE,
    FOREIGN KEY (list_id) REFERENCES task_list(id) ON DELETE CASCADE
);