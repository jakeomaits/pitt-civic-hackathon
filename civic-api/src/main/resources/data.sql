insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Joe', 'Rosza', 'jakeomaits@email.com', '15108', 'St Pauls Church', 'hashme', 11, CURDATE());
insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('b6ab3c46-62a3-11eb-ae93-0242ac130005', 'Jimmy', 'Smythe', 'nikil@theinternet.com', '15203', 'Boy Scouts', 'hashme', 165, CURDATE());
insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('b6ab3c46-62a3-11eb-ae93-0242ac130066', 'Ed', 'Johnson', 'pdm_master@anywhere.com', '15215', 'St Francis', 'hashme', 0, CURDATE());
insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('2', 'Randy', 'Savage', 'ohyeahhhh@wwf.com', '15238', 'Apple Ridge Motorcycle Club', 'hashme', 9947, CURDATE());
insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('3', 'Billy', 'Styles', 'rstyles@gmail.com', '15365', 'Pittsburgh Botany Association', 'hashme', 50, CURDATE());
insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('4', 'Ben', 'Morris', 'b-mo-money@hotmail.com', '15260', 'Jake Omaits Fan Club', 'hashme', 14, CURDATE());
insert into appuser (User_ID, first_name, last_name, email, zip, organization_id, password, points, create_date) values ('5', 'Sandy', 'Ravage', 'oh-noooo@wwe.com', '15252', 'Boy Scouts', 'hashme', 8, CURDATE());

--complete
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('b6ab3c46-62a3-11eb-ae93-0242ac130002', 'b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Cat is stuck in tree.', 'Please come asap because he has been there for 4 days.','15108', '2021-01-28', 'Child/Dependent Care', 'http://www.catsguru.com/wp-content/uploads/2011/03/cat-stuck-up-tree.jpg', CURDATE(), 'Morning', '2021-01-28', 2, 'I really appreciate all the help. Very generous!', 'true', 'You and (3) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('b6ab3c46-62a3-11eb-ae93-0242ac130004', 'b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Shingle Repair.', 'Im scared of heights and too afraid to get on my roof due.', '15106', '2021-01-05', 'Home/Repair', 'https://biondoroofing.com/wp-content/uploads/2015/08/Roof-Repair-Tips1.jpg', CURDATE(), 'Evening', '2021-01-10', 3, 'Thank you so much. This literally saved me a thousand dollars. I really appreciate it.', 'false', '(2) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('1', 'b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Flat tire', 'I have a flat tire on my car. It is in my driveway but I dont know how to change it.', '15203', '2021-01-15', 'Home/Repair', 'https://di-uploads-pod16.dealerinspire.com/vikingmotors/uploads/2020/01/what-happens-if-you-drive-on-a-flat-tire.jpeg', CURDATE(), 'Anytime', '2021-01-17', 4, 'Just in time for me to get to work. Thanks so much. Looking forward to hanging out soon!', 'true', 'You and (4) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('2', '3', 'Lawn mower deck belt', 'The deck belt came off of my mower. I could use a second set of hands to get it back on.', '15208', '2021-01-15', 'Home/Repair', 'https://i.pinimg.com/474x/bc/9a/85/bc9a85fd6d0ce9941da35cb18313edeb.jpg', CURDATE(), 'Anytime', '2021-01-16', 5, 'I was back cutting grass in no time. Thanks and let me know if you need anything.', 'false', '(12) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('3', 'b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Carry Sofa', 'I am picking up a new sofa in a couple days and could use some help carrying it in the house.', '15215', '2021-01-15', 'Home/Repair', 'https://media.istockphoto.com/videos/male-friends-carry-sofa-into-new-home-video-id1169552778?s=640x640', CURDATE(), 'Afternoon', '2021-01-17', 2, 'He tossed that couch around like it was made out of paper. Many thanks.', 'false', '(22) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('4', 'b6ab3c46-62a3-11eb-ae93-0242ac130005', 'I need a ride to Dr', 'I am scheduled for a COVID shot but dont have a car', '15224', '2021-01-15', 'Transportation', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqHq3iql6w9O1RW2Phs-hI4LwK0dziU3U7Xg&usqp=CAU', CURDATE(), 'Before 5:00 PM', '2021-01-16', 3, 'Very polite young man. My grandaughter would like him very much. ;)', 'false', '(8) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('5', 'b6ab3c46-62a3-11eb-ae93-0242ac130066', 'TV Question', 'My TV keeps shutting itself off and I am not sure how to fix it.', '15238', '2021-01-15', 'Skill', 'https://www.logolynx.com/images/logolynx/82/826b9ee3f643b7eb3570a5598984a8c8.jpeg', CURDATE(), 'Whenever', '2021-01-29', 4, 'Turns out my cable was bad. He even brought over another to test with. And to think I almost bought a new TV!', 'false', '(4) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('6', 'b6ab3c46-62a3-11eb-ae93-0242ac130005', 'Clear brush at ball field', 'We have a bank at the ball field that needs cleared. Any help would be appreciated.', '15255', '2021-01-15', 'Home/Repair', 'https://www.publicdomainpictures.net/pictures/130000/nahled/river-bank-with-weeds.jpg', CURDATE(), 'Meet at 2:00', '2021-01-18', 5, 'Thank you so much. We are so excited to be able to have a baseball team this year. We have not had luck finding coaches in the past.', 'true', 'You and (5) others send cheers!');
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('7', 'b6ab3c46-62a3-11eb-ae93-0242ac130066', 'Coach baseball team', 'We are in need of a head coach for the Hopedale Huskies this spring.', '15260', '2021-01-15', 'Skill', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKl491WJoF1ptB_uo9EwphZEHNsSAa7GpiLA&usqp=CAU', CURDATE(), 'N/A', '2021-01-25', 2, 'Thanks for bringing your whole family. The field looks so nice now.', 'false', '(1) other sends cheers!');

--incomplete
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('8', '4', 'The wind blew my fence down', 'We had a hard wind a few days back. It blew my fence over. I would appreciate some help standing it back up.', '15278', '2021-02-01', 'Home/Repair', 'https://cbs4local.com/resources/media2/16x9/full/1015/center/80/962a4483-94ce-4dfb-ba19-2c964661309a-large16x9_halbach1.jpg', CURDATE(), 'Lunchtime', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('9', '5', 'Looking for help setting up my internet', 'My son is starting virtual school. I need my router moved close to his room but I dont know how.', '15274', '2021-02-15', 'Home/Repair', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUYBNkH80u-2F4oAg2CDRzfuJZF8H9GMfi3g&usqp=CAU', CURDATE(), 'Morning', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('10', 'b6ab3c46-62a3-11eb-ae93-0242ac130066', 'My cat is missing', 'My cat got out and I cant find him. Please keep an eye out for him.', '15252', '2021-02-15', 'Child/Dependent Care', 'https://media.gettyimages.com/photos/grumpy-cat-attends-the-grumpy-guide-to-life-observations-by-grumpy-picture-id453190194?s=594x594', CURDATE(), 'All day!', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('11', 'b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Shovel snow after upcoming storm', 'My elderly mother has to get on the bus on Wednesday and we have a storm the day before. Can someone please shovel her sidewalk?', '15232', '2021-02-17', 'Home/Repair', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4gkZbIgMFuoEZxRgT2oZkksmKFICEEE9DPA&usqp=CAU', CURDATE(), 'Anytime after the snow stops', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('12', 'b6ab3c46-62a3-11eb-ae93-0242ac130002', 'Interview a nurse for a school report', 'My son is doing a report about nurses. He needs to inverview someone in that profession. It will only take a few minutes and can be done on the phone.', '15289', '2021-02-19', 'Medical', 'https://ffp4g1ylyit3jdyti1hqcvtb-wpengine.netdna-ssl.com/netpolicy/files/2013/05/IMG_00401-1000x750.jpg', CURDATE(), 'Sometime after 4:00', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('13', 'b6ab3c46-62a3-11eb-ae93-0242ac130066', 'Check in on my cat while traveling', 'I am travelling for 2 weeks. If someone could check in on my cat and feed him every few days, that would be very much appreciated.', '15289', '2021-02-05', 'Child/Dependent Care', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQg5xwo6zje1rt0xH395ivdO3rpUXVppxk_0A&usqp=CAU', CURDATE(), 'Whenever', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('b6ab3c46-62a3-11eb-ae93-0242ac130003', 'b6ab3c46-62a3-11eb-ae93-0242ac130005', 'My dogs foot is stuck in a sewer grate.', 'Its in there really good. He sometimes bites so be careful.', '15108', '2021-02-10', 'Child/Dependent Care', 'https://i.pinimg.com/originals/89/a4/1f/89a41fc23f39c20aa0b33b96314405e3.jpg', CURDATE(), 'Any time after 5:00', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('b6ab3c46-62a3-11eb-ae93-0242ac130095', 'b6ab3c46-62a3-11eb-ae93-0242ac130005', 'Rake leaves', 'I have massive yard that has millions of leaves that need raked.', '15108', '2021-01-30', 'Home Repair', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDAgIO608plBhNvG_KMoGH86dWzBW39iTjUw&usqp=CAU', CURDATE(), 'Noonish', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('b6ab3c46-62a3-11eb-ae93-0242ac130077', 'b6ab3c46-62a3-11eb-ae93-0242ac130066', 'Work Project', 'I need help on a work project as I am unable to complete it alone.', '15233', '2021-02-01', 'Skill', 'https://miro.medium.com/max/8064/1*QrqDjJD_rKpitI686FabiA.jpeg', CURDATE(), 'Anytime', NULL, NULL, NULL, NULL, NULL);
insert into help (HELP_ID, USER_ID, TITLE, Description, ZIP, REQUESTED_DATE, HELP_TYPE, IMAGE_URL, create_date, TIME_OF_DAY, COMPLETE_DATE, COMPLETED_BY, COMMENTS, CHEERED, CHEER_MESSAGE) values ('b6ab3c46-62a3-11eb-ae93-0242ac130078', '3', 'Sparring Partner', 'If anyone would like to spare with me as I prepare for Wrestlemania, I would appreciate it.', '15220', '2021-02-03', 'Skill', 'https://sportsmedia.ign.com/sports/image/article/775/775590/top-20-matches-in-wrestlemania-history-20070323040813420-000.jpg', CURDATE(), 'Before sunset', NULL, NULL, NULL, NULL, NULL);
