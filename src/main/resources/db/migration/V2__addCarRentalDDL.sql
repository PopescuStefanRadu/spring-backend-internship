ALTER TABLE car
    ADD COLUMN rental_user bigint,
    ADD CONSTRAINT car_client_fk FOREIGN KEY (rental_user) references my_user (id);

insert into my_user(id, name, age, status)
VALUES (1, 'Gigi Masinuta1', 10, 'active'),
       (2, 'Gigi Masinuta2', 10, 'active'),
       (3, 'Gigi Masinuta3', 10, 'active'),
       (4, 'Gigi Masinuta4', 10, 'active'),
       (5, 'Gigi Masinuta5', 10, 'active'),
       (6, 'Gigi Masinuta6', 10, 'active');


insert into car(id, rental_user, name, color)
VALUES (1, null, 'Mitsu Lancer', 'red'),
       (2, 2, 'septar', 'red'),
       (3, 3, 'cinciar', 'red'),
       (4, 4, 'cinciar cu numere de septar', 'red'),
       (5, null, 'Mercedes', 'red'),
       (6, null, 'Audi Logan', 'red');
