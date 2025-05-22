INSERT INTO tb_Art_List (name) VALUES ('Poster');
INSERT INTO tb_Art_List (name) VALUES ('Digital Art');

INSERT INTO tb_art (title, genre, img_url, short_description, long_description) VALUES ('Brook','Anime', 'https://raw.githubusercontent.com/LucasCardeoli/minhas-imagens/main/soulKing.png', 'Brutalism Anime Poster', 'Brook is a living skeleton and the musician of the Straw Hat Pirates, known for his outgoing personality, macabre jokes, and unique abilities. He ate the Yomi Yomi no Mi (Revive-Revive Fruit), a Devil Fruit that allowed him to return to life after death—though his body had already decomposed, leaving only his bones.');
INSERT INTO tb_art (title, genre, img_url, short_description, long_description) VALUES ('Zoro','Anime', 'https://raw.githubusercontent.com/LucasCardeoli/minhas-imagens/main/zoro.png', 'Digital Art', 'Roronoa Zoro is the first member to join Monkey D. Luffy’s crew and serves as the Straw Hats’ primary swordsman. Known for his immense strength, loyalty, and terrible sense of direction, Zoro fights using Three-Sword Style (Santoryu), wielding three katanas simultaneously—one in each hand and a third in his mouth.');

INSERT INTO tb_belonging (list_id, art_id, position) VALUES (1, 1, 0);

INSERT INTO tb_belonging (list_id, art_id, position) VALUES (2, 2, 0);