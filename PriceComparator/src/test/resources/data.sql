INSERT INTO USERS(USER_ID, USERNAME, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ENABLED, CREATION_DATE) VALUES(1, 'ja3ekja', 'Jacek', 'Feliksiak', 'jacekfeliksiak@gmail.com', 'Cieslak123', true, CURRENT_DATE());
INSERT INTO USER_ROLES VALUES(1, 'USER');
INSERT INTO USER_ROLES VALUES(2, 'ADMIN');