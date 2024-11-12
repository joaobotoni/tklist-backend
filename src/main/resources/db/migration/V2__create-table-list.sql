CREATE TABLE task_list(
  id serial PRIMARY KEY,
  name varchar(100) not null
);

CREATE TABLE belong (
    task_id INT NOT NULL,
    list_id INT NOT NULL,
    position_task INT NOT NULL,
    FOREIGN KEY (task_id) REFERENCES tasks(id),
    FOREIGN KEY (list_id) REFERENCES task_list(id)
);