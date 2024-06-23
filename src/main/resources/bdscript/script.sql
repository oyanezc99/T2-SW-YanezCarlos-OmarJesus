CREATE TABLE Personaje
(
 IdPersonaje 		INT NOT NULL AUTO_INCREMENT,
 NomPersonaje		VARCHAR(50) NOT NULL,
 ApePersonaje 		VARCHAR(50) NOT NULL,
 FechNacPersonaje	DATE NOT NULL,
 PRIMARY KEY (IdPersonaje)
);

CREATE TABLE ProgramaTv
(
 IdProgramaTv 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Resumen 			VARCHAR(250) NOT NULL,
 FechaInicio	DATE NOT NULL,
 IdPersonaje 			INT NOT NULL,
 PRIMARY KEY (IdProgramaTv),
 FOREIGN KEY (IdPersonaje) REFERENCES Personaje(IdPersonaje)
 );
 
INSERT INTO Personaje (NomPersonaje, ApePersonaje, FechNacPersonaje) VALUES 
('John', 'Doe', '1990-01-15'),
('Jane', 'Smith', '1985-07-30'),
('Michael', 'Johnson', '1978-11-22'),
('Emily', 'Davis', '1995-05-18'),
('William', 'Brown', '2000-03-12');


INSERT INTO ProgramaTv (Titulo, Resumen, FechaInicio, IdPersonaje) VALUES 
('Adventure Time', 'A fun-filled adventure series', '2010-04-05', 1),
('Breaking Bad', 'A high school chemistry teacher turned methamphetamine producer', '2008-01-20', 2),
('Friends', 'Follows the personal and professional lives of six twenty to thirty-something-year-old friends living in Manhattan', '1994-09-22', 3),
('Game of Thrones', 'Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia', '2011-04-17', 4),
('The Office', 'A mockumentary on a group of typical office workers, where the workday consists of ego clashes, inappropriate behavior, and tedium', '2005-03-24', 5);
