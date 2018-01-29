create sequence author_seq increment 1;

create table author (
  id long,
  first_name varchar(100),
  last_name varchar(100)
);


create sequence book_seq increment 1;

create table book (
  id long,
  titre varchar(100),
  author_id long,
  constraint fk_book_author FOREIGN KEY (author_id) REFERENCES author(id),
);


