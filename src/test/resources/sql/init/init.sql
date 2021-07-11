insert into areas (id, title, description) values(1, 'DEV', null);
insert into areas (id, title, description) values(2, 'CX', null);

insert into competences (id, title, description, area_id) values(1, 'Java development', null, 1);
insert into competences (id, title, description, area_id) values(2, 'C development', null, 1);
insert into competences (id, title, description, area_id) values(3, 'Python development', null, 1);
insert into competences (id, title, description, area_id) values(4, 'Automation testing', null, 1);
insert into competences (id, title, description, area_id) values(5, 'Oracle specialist', null, 1);

insert into activities (id, title, description, weight, internal_link, competence_id)
values(1, 'Read a book', null, 1, null, 1);
insert into activities (id, title, description, weight, internal_link, competence_id)
values(2, 'Study a school', null, 3, null, 1);
insert into activities (id, title, description, weight, internal_link, competence_id)
values(3, 'Workshop', null, 2, null, 1);

insert into chapters (id, title, description, area_id) values(1, 'A chapter', null, 1);
insert into chapters (id, title, description, area_id) values(2, 'B chapter', null, 1);

insert into tribes (id, title, description) values(1, 'A Tribe', null);
insert into tribes (id, title, description) values(2, 'B Tribe', null);

insert into squads (id, title, description, tribe_id) values(1, 'A Squad', null, 1);
insert into squads (id, title, description, tribe_id) values(2, 'B Squad', null, 1);

insert into employees (id, name, surname, email, external_id)
values(1, 'Jan', 'CHL', 'jan@chl.cz', 'sapJan');
insert into employees (id, name, surname, email, external_id)
values(2, 'Michal', 'CHM', 'michal@chl.cz', 'sapMichal');

insert into roles (id, title, description, valid_from, valid_to, employee_id)
values(1, 'CHL Jan', null, '2012-09-17 18:47:52.69', null, 1);
insert into roles (id, title, description, valid_from, valid_to, employee_id)
values(2, 'CHM Michal', null, '2012-09-17 18:47:52.69', null, 2);

insert into role_chapter_leaders (id, chapter_id) values(1, 1);
insert into role_chapter_members (id, chapter_id) values(2, 1);

insert into employee_competences (id, competence_level, obtained_date, employee_id, competence_id)
values(1, 1, '2012-09-17 18:47:52.69', 2, 4);

insert into events (id, category, sub_category, type, created, description, read,
deleted, entity_type, entity_id, source_role_id, change_role_id, employee_id)
values(1, 1, 1, 1, '2012-09-17 18:47:52.69', 'new evaluation', 0, 0, 1, 1, 1, null, 2);

insert into paths (id, title, description, due_date, state, one_to_one_date, chapter_member_id)
values(1, 'Get better', null, '2021-09-17 18:47:52.69', 1, null, 2);

insert into path_items (id, weight, progress, completed, path_id, activity_id, employee_competence_id)
values(1, 1, 'Reading Herout', 0, 1, 1, null);
insert into path_items (id, weight, progress, completed, path_id, activity_id, employee_competence_id)
values(2, 5, 'CVUT', 0, 1, 2, null);

insert into path_item_evaluations (id, rating, description, path_item_id, role_id)
values(1, 3, null, 1, 1);
insert into path_item_evaluations (id, rating, description, path_item_id, role_id)
values(2, 4, null, 1, 2);
insert into path_item_evaluations (id, rating, description, path_item_id, role_id)
values(3, 1, null, 2, 1);
insert into path_item_evaluations (id, rating, description, path_item_id, role_id)
values(4, 2, null, 2, 2);

insert into comments (id, text, created, entity_type, entity_id, role_id)
values(1, 'comment', '2021-09-17 18:47:52.69', 1, 1, 2);

insert into comment_notes (id, text, created, comment_id)
values(1, 'note A', '2021-09-17 18:47:52.69', 1);
insert into comment_notes (id, text, created, comment_id)
values(2, 'note B', '2021-09-17 18:47:52.69', 1);