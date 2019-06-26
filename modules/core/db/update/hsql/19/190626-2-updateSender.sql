alter table TEST6FLOW_SENDER add column DETAIL varchar(255) ^
update TEST6FLOW_SENDER set DETAIL = '' where DETAIL is null ;
alter table TEST6FLOW_SENDER alter column DETAIL set not null ;
