-- begin TEST6FLOW_SENDER
create table TEST6FLOW_SENDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FROM_DATE date not null,
    TO_DATE date not null,
    STATE varchar(255),
    --
    primary key (ID)
)^
-- end TEST6FLOW_SENDER
-- begin TEST6FLOW_HEAD_DESIDE
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
)^
-- end TEST6FLOW_HEAD_DESIDE
