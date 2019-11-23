insert into user (login, password, first_name, last_name, role, DTYPE) values ('admin', '$2a$11$SGqMqftMUCIWObteXWOG4.ZXZN331M7Ns.T/H6s3/xZdDlPoD7l8a', 'Valeriia', 'Adminovich', 'ADMIN', 'User')
,('lecture1', '$2a$11$SGqMqftMUCIWObteXWOG4.ZXZN331M7Ns.T/H6s3/xZdDlPoD7l8a', 'Valeriia', 'Lecture', 'ADMIN', 'Lecturer')
,('lecture2', '$2a$11$SGqMqftMUCIWObteXWOG4.ZXZN331M7Ns.T/H6s3/xZdDlPoD7l8a', 'Valeriia', 'Lecture', 'ADMIN', 'Lecturer')
,('lecture3', '$2a$11$SGqMqftMUCIWObteXWOG4.ZXZN331M7Ns.T/H6s3/xZdDlPoD7l8a', 'Valeriia', 'Lecture', 'ADMIN', 'Lecturer')
,('lecture4', '$2a$11$SGqMqftMUCIWObteXWOG4.ZXZN331M7Ns.T/H6s3/xZdDlPoD7l8a', 'Valeriia', 'Lecture', 'ADMIN', 'Lecturer');
insert into course (title, description, lecturer_id) values
('math', 'When television was young, there was a huge popular show based on the still popular fictional character of Superman.', 2),
('language', 'When television was young, there was a huge popular show based on the still popular fictional character of Superman.',3),
('science', 'When television was young, there was a huge popular show based on the still popular fictional character of Superman.',4),
('creative', 'When television was young, there was a huge popular show based on the still popular fictional character of Superman.',5),
('social', 'When television was young, there was a huge popular show based on the still popular fictional character of Superman.',2);
