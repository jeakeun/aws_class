create table if not exists post{
	num int primaty key auto_increment,
    title varchar(50) not null,
    content longtext not null,
    writer varchar(20) not null,
    date datetime not null default current_timestamp
};