ALTER TABLE car
    DROP COLUMN rental_user;

CREATE TABLE car_rental
(
    id         bigint primary key,
    car_id     bigint not null,
    user_id    bigint not null,
    start_date date,
    end_date   date,
    CONSTRAINT car_rental_car_fk FOREIGN KEY (car_id) REFERENCES car (id),
    CONSTRAINT car_rental_user_fk FOREIGN KEY (user_id) REFERENCES my_user (id)
);
