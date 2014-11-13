drop table if exists t_todo;
create table t_todo(
  todo_id varchar(36) primary key,
  todo_title varchar(30),
  finished boolean,
  created_at timestamp
);

insert into t_todo values(random_uuid(),'title',false,current_timestamp);

commit;