--### entity author
insert into author values(1, '1984-01-10', '005.604', 'Rafael Costa');
insert into author values(2, '1984-01-10', '001.604', 'Fernando Pessoa');
insert into author values(3, '1984-01-10', '111.604', 'Shakespeare');
insert into author values(4, '1975-10-23', '333.604.899', 'Guilherme Theo');
insert into author values(5, '1980-01-10', '005.888', 'Baltazar the Great');
commit;

--### entity book
insert into book values(1, '2022-10-11 12:00:01', 1, 20, 'Alice no País das Maravilhas. Alusão ao Livro de Lewis Carrol', '2022-09-15', 'Alice no País das Maravilhas Tropicais', 100.89);
insert into book values(2, '2022-10-11 07:00:01', 0, 30, 'Good Book', '2022-09-15', 'Century', 10.89);
insert into book values(3, '2022-01-11 12:00:01', 2, 2, '300 Páginas de pura ficção policial', '2022-09-15', 'Twister Metal', 33.05);
insert into book values(4, '2022-03-11 05:00:01', 3, 21, 'Country Neverland Peter Pan', '2022-09-15', 'The Person 12', 08.89);
insert into book values(5, '2022-08-11 06:00:01', 1, 11, 'Cowboy Texas 21 Century', '2022-09-15', 'Between Guns and Flowers', 99.99);
insert into book values(6, '2022-10-11 10:00:01', 3, 6, 'Adventure in Space', '2022-09-15', 'Never forget me', 100.89);
commit;

--### entity authorbook
insert into author_book values(1, 1, 1);
insert into author_book values(2, 1, 2);
insert into author_book values(3, 1, 3);
commit;

insert into author_book values(4, 2, 1);
insert into author_book values(5, 2, 2);
commit;