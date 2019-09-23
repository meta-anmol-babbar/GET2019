delimiter $$

CREATE DATABASE `student` /*!40100 DEFAULT CHARACTER SET latin1 */$$

delimiter $$

CREATE TABLE `student` (
  `S_id` int(11) NOT NULL,
  `S_age` int(11) NOT NULL,
  `S_email` varchar(255) DEFAULT NULL,
  `Father_name` varchar(50) DEFAULT NULL,
  `First_name` varchar(15) DEFAULT NULL,
  `last_name` varchar(15) DEFAULT NULL,
  `S_class` int(11) NOT NULL,
  PRIMARY KEY (`S_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1$$

