# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table s3file (
  id                        varchar(40) not null,
  bucket                    varchar(255),
  user_id                   varchar(40),
  name                      varchar(255),
  constraint pk_s3file primary key (id))
;

create table user (
  id                        varchar(40) not null,
  email                     varchar(255),
  password_hash             varchar(255),
  salt                      varchar(255),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

alter table s3file add constraint fk_s3file_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_s3file_user_1 on s3file (user_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists s3file;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

