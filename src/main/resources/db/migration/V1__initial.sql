CREATE TABLE client
(
    id   bigint primary key,
    name text
);

CREATE TABLE car
(
    id    bigint primary key,
    name  text,
    color text
);

CREATE TABLE my_user
(
    id     bigint primary key,
    name   text,
    age    bigint,
    status text
);

INSERT INTO client(id, name)
VALUES (1, 'Gigi Masinuta1'),
       (2, 'Gigi Masinuta2'),
       (3, 'Gigi Masinuta3'),
       (4, 'Gigi Masinuta4'),
       (5, 'Gigi Masinuta5'),
       (6, 'Gigi Masinuta6');
