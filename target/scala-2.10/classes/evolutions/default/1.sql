# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table s3file (
  id                        varchar(40) not null,
  bucket                    varchar(255),
  user_email                varchar(255),
  name                      varchar(255),
  easy_access_file          boolean,
  constraint pk_s3file primary key (id))
;

create table XonamiUser (
  email                     varchar(255) not null,
  password_hash             varchar(255),
  salt                      varchar(255),
  easy_access_hash          varchar(255),
  easy_salt                 varchar(255),
  constraint pk_XonamiUser primary key (email))
;

create sequence XonamiUser_seq;

alter table s3file add constraint fk_s3file_user_1 foreign key (user_email) references XonamiUser (email) on delete restrict on update restrict;
create index ix_s3file_user_1 on s3file (user_email);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists s3file;

drop table if exists XonamiUser;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists XonamiUser_seq;

