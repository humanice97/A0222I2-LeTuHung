CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
);

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `color` varchar(120) DEFAULT NULL,
  `description` varchar(120) DEFAULT NULL,
  `category_id` int,
  PRIMARY KEY (`id`),
  foreign key (category_id) references category(category_id)
);

INSERT INTO `product`.`category` (`category_id`, `name`) VALUES ('1', 'Televison');
INSERT INTO `product`.`category` (`category_id`, `name`) VALUES ('2', 'Phone');
INSERT INTO `product`.`category` (`category_id`, `name`) VALUES ('3', 'Computer');


INSERT INTO `product`.`product` (`name`, `price`, `quantity`, `color`, `description`, `category_id`) VALUES ('Hung', '12.2', '10', 'white', 'yes', '3');
INSERT INTO `product`.`product` (`name`, `price`, `quantity`, `color`, `description`, `category_id`) VALUES ('Hung', '12.2', '10', 'white', 'yes', '3');
INSERT INTO `product`.`product` (`name`, `price`, `quantity`, `color`, `description`, `category_id`) VALUES ('Hung', '12.2', '10', 'white', 'yes', '3');
INSERT INTO `product`.`product` (`name`, `price`, `quantity`, `color`, `description`, `category_id`) VALUES ('Hung', '12.2', '10', 'white', 'yes', '3');
INSERT INTO `product`.`product` (`name`, `price`, `quantity`, `color`, `description`, `category_id`) VALUES ('Hung', '12.2', '10', 'white', 'yes', '3');


select * from product where name like "Hung";