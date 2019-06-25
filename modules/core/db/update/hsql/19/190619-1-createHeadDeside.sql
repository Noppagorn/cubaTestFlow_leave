create table TEST6FLOW_HEAD_DESIDE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HEAD_NAME varchar(255) not null,
    PERMISSION varchar(255) not null,
    --
    primary key (ID)
);