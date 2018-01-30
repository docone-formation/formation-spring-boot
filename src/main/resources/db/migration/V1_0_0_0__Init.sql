
create sequence author_seq increment 1;

create table author (
  id long primary key,
  first_name varchar(100),
  last_name varchar(100)
);


create sequence book_seq increment 1;

create table book (
  id long primary key,
  titre varchar(100) not null,
  author_id long,
  constraint fk_book_author 
    foreign key (author_id) 
  	references author(id),
);


create sequence chapter_seq increment 1;

create table chapter (
  id long primary key,
  book_id long not null,
  titre varchar(200) not null,
  constraint fk_chapter_book 
    foreign key (book_id) 
  	references book(id)
);








