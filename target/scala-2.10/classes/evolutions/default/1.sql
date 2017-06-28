# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bob_user (
  email                     varchar(255) not null,
  password_hash             varchar(255),
  salt                      varchar(255),
  easy_access_hash          varchar(255),
  easy_salt                 varchar(255),
  constraint pk_bob_user primary key (email))
;

create table s3file (
  id                        varchar(40) not null,
  bucket                    varchar(255),
  bob_user_email            varchar(255),
  name                      varchar(255),
  easy_access_file          boolean,
  constraint pk_s3file primary key (id))
;

create sequence bob_user_seq;

alter table s3file add constraint fk_s3file_bobUser_1 foreign key (bob_user_email) references bob_user (email) on delete restrict on update restrict;
create index ix_s3file_bobUser_1 on s3file (bob_user_email);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bob_user;

drop table if exists s3file;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bob_user_seq;

