CREATE TABLE if not exists Dish (
    dish_id BIGSERIAL primary key,
    dish_name varchar(50) not null,
    dish_price NUMERIC(10,2)
);