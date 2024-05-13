
-- Categoria
-- Inserts para las categorías
INSERT INTO CATEGORIA (id, nombre, descripcion) VALUES (1, 'Ejercicios de fuerza', 'Ejercicios centrados en el desarrollo de fuerza muscular.');
INSERT INTO CATEGORIA (id, nombre, descripcion) VALUES (2, 'Ejercicios de resistencia', 'Ejercicios para mejorar la resistencia física y cardiovascular.');
INSERT INTO CATEGORIA (id, nombre, descripcion) VALUES (3, 'Ejercicios de core', 'Ejercicios enfocados en fortalecer los músculos del core.');

-- Inserts para los ejercicios
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (1, 'Sentadillas', 'Ejercicio que fortalece los músculos de las piernas y glúteos, mejorando la fuerza y la estabilidad.', 'url_video_sentadillas', 1);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (2, 'Flexiones (push-ups)', 'Ejercicio que fortalece los músculos del pecho, hombros y tríceps, ayudando a mejorar la fuerza y la resistencia.', 'url_video_flexiones', 1);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (3, 'Plancha (plank)', 'Ejercicio de estabilidad que fortalece el core y los músculos abdominales, mejorando la postura y la resistencia.', 'url_video_plancha', 3);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (4, 'Zancadas (lunges)', 'Ejercicio que involucra piernas y glúteos, ayudando a mejorar la fuerza y la estabilidad al caminar.', 'url_video_zancadas', 1);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (5, 'Burpees', 'Ejercicio completo que involucra todo el cuerpo, ideal para mejorar la resistencia cardiovascular y la fuerza muscular.', 'url_video_burpees', 2);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (6, 'Saltos de tijera (jumping jacks)', 'Ejercicio que mejora la resistencia cardiovascular y fortalece las piernas y los brazos.', 'url_video_saltos_tijera', 2);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (7, 'Mountain climbers', 'Ejercicio que trabaja el core, las piernas y los brazos, mejorando la resistencia y la coordinación.', 'url_video_mountain_climbers', 2);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (8, 'Skipping (correr en el lugar levantando rodillas altas)', 'Ejercicio cardiovascular que mejora la resistencia y fortalece las piernas y el core.', 'url_video_skipping', 2);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (9, 'Fondos de tríceps en silla', 'Ejercicio que fortalece los músculos del tríceps, los hombros y el pecho.', 'url_video_fondos_triceps', 1);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (10, 'Dominadas en barra (pull-ups)', 'Ejercicio avanzado que trabaja los músculos de la espalda, los brazos y el core.', 'url_video_dominadas', 1);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (11, 'Fondos de tríceps en suelo', 'Ejercicio que fortalece los músculos del tríceps, los hombros y el pecho.', 'url_video_fondos_triceps_suelo', 1);
INSERT INTO EJERCICIO (id, nombre, descripcion, url_video, id_categoria)
VALUES (12, 'Plancha con elevación de piernas', 'Variante avanzada de la plancha que trabaja el core y los músculos abdominales, mejorando la estabilidad y la fuerza.', 'url_video_plancha_elevacion', 3);

--Rol
-- Insert para Entrenador
INSERT INTO ROL (id, nombre, descripcion) VALUES (1, 'Entrenador', 'Rol asignado a los entrenadores del gimnasio.');
-- Insert para Usuario
INSERT INTO ROL (id, nombre, descripcion) VALUES (2, 'Usuario', 'Rol asignado a los usuarios del gimnasio.');
-- Insert para Administrador
INSERT INTO ROL (id, nombre, descripcion) VALUES (3, 'Administrador', 'Rol asignado a los administradores del gimnasio.');

--Usuario
-- Insert para Administrador
INSERT INTO USUARIO (id, nombre, apellido, email, contrasena, urlImagen, numeroDeTelefono, altura, peso, imc, id_rol)
VALUES (1, 'Administrador', 'ActiveFit', 'admin@example.com', 'admin123', 'url_imagen_admin', '123456789', 180.0, 75.0, 23.15, 3);

-- Inserts para Entrenadores
INSERT INTO USUARIO (id, nombre, apellido, email, contrasena, urlImagen, numeroDeTelefono, altura, peso, imc, id_rol)
VALUES (2, 'Entrenador', 'Uno', 'entrenador1@example.com', 'entrenador123', 'url_imagen_entrenador1', '987654321', 175.0, 70.0, 22.86, 1);
INSERT INTO USUARIO (id, nombre, apellido, email, contrasena, urlImagen, numeroDeTelefono, altura, peso, imc, id_rol)
VALUES (3, 'Entrenador', 'Dos', 'entrenador2@example.com', 'entrenador123', 'url_imagen_entrenador2', '654123987', 170.0, 65.0, 22.49, 1);

-- Inserts para Usuarios
INSERT INTO USUARIO (id, nombre, apellido, email, contrasena, urlImagen, numeroDeTelefono, altura, peso, imc, id_rol)
VALUES (4, 'Usuario', 'Uno', 'usuario1@example.com', 'usuario123', 'url_imagen_usuario1', '123456789', 165.0, 60.0, 22.04, 2);
INSERT INTO USUARIO (id, nombre, apellido, email, contrasena, urlImagen, numeroDeTelefono, altura, peso, imc, id_rol)
VALUES (5, 'Usuario', 'Dos', 'usuario2@example.com', 'usuario123', 'url_imagen_usuario2', '987654321', 160.0, 55.0, 21.48, 2);
INSERT INTO USUARIO (id, nombre, apellido, email, contrasena, urlImagen, numeroDeTelefono, altura, peso, imc, id_rol)
VALUES (6, 'Usuario', 'Tres', 'usuario3@example.com', 'usuario123', 'url_imagen_usuario3', '654123987', 155.0, 50.0, 20.81, 2);

--Rutina
INSERT INTO RUTINA (id, nombre) VALUES (1, 'Mantener el peso ideal');
INSERT INTO RUTINA (id, nombre) VALUES (2, 'Bajar de peso');
INSERT INTO RUTINA (id, nombre) VALUES (3, 'Aumentar masa muscular');

--rutina ejercicio
--peso ideal
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (1, 3, 12, 'Realiza 3 series de 12 repeticiones de sentadillas.', 1, 1);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (2, 3, 10, 'Haz 3 series de 10 repeticiones de flexiones (push-ups).', 2, 1);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (3, 3, 1, 'Mantén la posición durante 30-60 segundos, repite 3 veces la plancha (plank).', 3, 1);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (4, 3, 12, 'Realiza 3 series de 12 repeticiones de zancadas (lunges) por pierna.', 4, 1);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (5, 3, 10, 'Haz 3 series de 10 repeticiones de burpees.', 5, 1);

-- bajar peso
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (6, 3, 20, 'Realiza 3 series de 20 repeticiones de saltos de tijera (jumping jacks).', 6, 2);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (7, 3, 15, 'Haz 3 series de 15 repeticiones por pierna de mountain climbers.', 7, 2);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (8, 3, 10, 'Haz 3 series de 10 repeticiones de burpees.', 5, 2);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (9, 3, 30, 'Realiza 3 series de 30 segundos de skipping (correr en el lugar levantando rodillas altas).', 8, 2);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (10, 3, 12, 'Haz 3 series de 12 repeticiones de fondos de tríceps en silla.', 9, 2);

--aumentar masa muscular
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (11, 4, 8, 'Realiza 4 series de 8 repeticiones de sentadillas.', 1, 3);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (12, 4, 8, 'Haz 4 series de 8 repeticiones de flexiones (push-ups).', 2, 3);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (13, 4, 6, 'Realiza 4 series de 6 repeticiones de dominadas en barra (pull-ups).', 10, 3);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (14, 4, 10, 'Haz 4 series de 10 repeticiones de fondos de tríceps en suelo.', 11, 3);
INSERT INTO RUTINA_EJERCICIO (id, cantidad, repeticiones, comentarios, id_ejercicio, id_rutina)
VALUES (15, 3, 45, 'Mantén la posición durante 30-45 segundos, repite 3 veces la plancha con elevación de piernas.', 12, 3);

--programacion
INSERT INTO PROGRAMACION (id, nombre, fecha_inicio, fecha_fin)
VALUES (1, 'Programación mixta', '2024-05-15', '2024-06-15');
INSERT INTO PROGRAMACION (id, nombre, fecha_inicio, fecha_fin)
VALUES (2, 'Programación completa ', '2024-06-20', '2024-07-20');
INSERT INTO PROGRAMACION (id, nombre, fecha_inicio, fecha_fin)
VALUES (3, 'Programación leve', '2024-07-25', '2024-08-25');

--programaion rutina
-- Insert para Programación 1 con Rutina 1 (Mantener el peso ideal) los lunes, miércoles y viernes
INSERT INTO PROGRAMACION_RUTINA (id, dias, id_programacion, id_rutina)
VALUES (1, 'Lunes, Miércoles, Viernes', 1, 1);
-- Insert para Programación 2 con Rutina 2 (Bajar de peso) los martes, jueves y sábado
INSERT INTO PROGRAMACION_RUTINA (id, dias, id_programacion, id_rutina)
VALUES (2, 'Martes, Jueves, Sábado', 2, 2);
-- Insert para Programación 3 con Rutina 3 (Aumentar masa muscular) los lunes, miércoles y viernes
INSERT INTO PROGRAMACION_RUTINA (id, dias, id_programacion, id_rutina)
VALUES (3, 'Lunes, Miércoles, Viernes', 3, 3);

--usuario programacion
INSERT INTO USUARIO_PROGRAMACION (id, id_usuario, id_programacion)
VALUES (1, 4, 1);
INSERT INTO USUARIO_PROGRAMACION (id, id_usuario, id_programacion)
VALUES (2, 4, 2);
INSERT INTO USUARIO_PROGRAMACION (id, id_usuario, id_programacion)
VALUES (3, 5, 2);
INSERT INTO USUARIO_PROGRAMACION (id, id_usuario, id_programacion)
VALUES (4, 5, 3);
INSERT INTO USUARIO_PROGRAMACION (id, id_usuario, id_programacion)
VALUES (5, 6, 1);
INSERT INTO USUARIO_PROGRAMACION (id, id_usuario, id_programacion)
VALUES (6, 6, 3);

