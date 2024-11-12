## Insert
```sql
INSERT INTO tasks (title, assignee, created_at, description, priority, due_date) VALUES 
  ('Comprar leite', 'João', NOW(), 'Comprar leite no supermercado', 0, '2024-11-15 09:00:00'),
  ('Enviar relatório', 'Maria', NOW(), 'Enviar relatório de vendas para a diretoria', 1, '2024-11-14 17:00:00'),
  ('Reunião com cliente', 'Carlos', NOW(), 'Reunião para discutir novos projetos', 2, '2024-11-13 10:00:00'),
  ('Lavar o carro', 'João', NOW(), 'Lavar o carro no lava-jato', 0, '2024-11-16 14:00:00'),
  ('Organizar arquivo de documentos', 'Maria', NOW(), 'Organizar documentos no escritório', 1, '2024-11-17 16:00:00'),
  ('Revisar código do projeto', 'Carlos', NOW(), 'Revisar código do sistema para o cliente', 0, '2024-11-12 18:00:00'),
  ('Comprar presente de aniversário', 'João', NOW(), 'Comprar presente para o aniversário de um amigo', 1, '2024-11-18 11:00:00'),
  ('Ajustar orçamento', 'Maria', NOW(), 'Ajustar o orçamento para o próximo trimestre', 2, '2024-11-19 15:00:00'),
  ('Fazer planejamento estratégico', 'Carlos', NOW(), 'Planejar as metas para o próximo ano', 0, '2024-11-20 09:00:00'),
  ('Atualizar currículo', 'João', NOW(), 'Atualizar currículo para candidatura em novas vagas', 1, '2024-11-22 10:00:00');

-- Inserindo listas na tabela task_list
INSERT INTO task_list (name) VALUES 
  ('Lista de Tarefas Pessoais'),
  ('Lista de Tarefas Profissionais'),
  ('Lista de Tarefas Urgentes');

-- Associando tarefas a listas na tabela belong
INSERT INTO belong (task_id, list_id, position_task) VALUES 
  (1, 1, 1),
  (2, 2, 1),
  (3, 3, 1),
  (4, 1, 2),
  (5, 2, 2),
  (6, 2, 3),
  (7, 1, 3),
  (8, 2, 4),
  (9, 3, 2),
  (10, 1, 4);
```
