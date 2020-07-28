INSERT INTO USER (USERID, USERNAME, USERPASS)
VALUES (1, 'Demo', 'demo');

INSERT INTO BOOK (BOOKID, BOOKTITLE, BOOKAUTHORLAST, BOOKAUTHORFIRST, BOOKPAGESTOTAL, BOOKISBN)
VALUES (1, 'Logs and Moonshine', 'Tate', 'Suzanne', 48, '9781878405296'),
       (2, 'Civil War in Connacht', 'O Gadhra', 'Nollaig', 192, '1856352811'),
       (3, 'Catechism of the Revolutionist', 'Nekayev', 'Sergei', 23, '');


INSERT INTO NOTE (NOTEID, BOOKID, NOTEDATE, NOTECONTENTS, NOTEPAGESREAD)
VALUES (1, 1, 2020-01-24, 'Great recipe on page 8.', '1-10'),
       (2, 3, 2020-04-15, 'omg this book is stupid', '1-16'),
       (3, 3, 2020-04-30, 'Why do people still share this mess?.', '17-23');

/*
Must tell hibernate of the id numbers already used.
The number after with must be greater that the highest number id assigned.
 */
alter sequence hibernate_sequence restart with 5;

