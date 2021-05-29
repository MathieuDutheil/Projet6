INSERT INTO civilite
(civilite)
VALUES
(''),
('Monsieur'),
('Madame'),
('Mademoiselle'),
('Autre')
;

INSERT INTO grimpeur
(id, nom, prenom, email, mot_de_passe, telephone, membre_association, civilite_id)
VALUES
(1, "Dutheil", "Mathieu", "mathieudutheil92@gmail.com", "1234", "118218", TRUE, 2),
(2, "Kamtchoiang", "Noée", "noeekamtchoiang@gmail.com", "5678", "218118", FALSE,3)
;

INSERT INTO statut 
(id, statut)
VALUES
(1, ''),
(2, 'Refusée'),
(3, 'Acceptée'),
(4, 'En Attente')
;

INSERT INTO cotation
(id, cotation)
VALUES
(1, '1'),
(2, '2'),
(3, '3')
;

INSERT INTO site_de_grimpe
(id, nom, descriptif, acces, tagge_association, grimpeur_id)
VALUES
(1, "Les montagnes du Montana", "Un paysage paisible au coeur de l'Amérique", "tranquillou pilou", TRUE, 1),