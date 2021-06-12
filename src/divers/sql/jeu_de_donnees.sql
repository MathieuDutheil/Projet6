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
(2, "Kamtchoiang", "Noée", "noeekamtchoiang@gmail.com", "5678", "218118", FALSE,3),
(3, "Springsteen", "Bruce", "brucespringsteen@gmail.com", "06019", "911", TRUE, 2)
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
(2, "Les vallées de l'ardèche et l'algoritme de Kant", "Un vallon ensoleillé", "iclik a droite et iclik a gauche", FALSE, 2)
;

INSERT INTO commentaire
(id, commentaire, grimpeur_id, site_de_grimpe_id)
VALUES
(1, "Au top moumouth", 1, 2),
(2, "J'ai adoré !", 2, 1)
;


INSERT INTO topo
(id, nom, description, lieu, date_de_parution, disponible, grimpeur_id, site_de_grimpe_id)
VALUES
(1, "La vallée de la mort", "Un endroit très dangereux pour les novices", "Montana", "2004-01-22", FALSE, 2, 1),
(2, "Le canyon des vieux", "La vie de rêve", "Ardèche", "2008-12-31", TRUE, 1, 2)
;


INSERT INTO reservation
(id, date_reservation, grimpeur_id, topo_id, statut_id)
VALUES
(1, "2021-04-25", 1, 1, 2),
(2, "2021-03-31", 2, 2, 4)
;

INSERT INTO secteur 
(id, nom, temps_de_marche, altitude, site_de_grimpe_id)
VALUES
(1, "La bande à jojo", "20minutes", "120 mètres", 2),
(2, "La mère de toutes les batailles", "13minutes 40 secondes", "135 mètres", 2),
(3, "Le renfort de Notre-Dame", "5minutes", "400 mètres", 1)
;

INSERT INTO voie
(id, numero, nombres_longueur, voie_equipee, secteur_id) 
VALUES
(1, 430, 12, TRUE, 2)
;

INSERT INTO voie
(id, numero, nom, remarques, nombres_longueur, voie_equipee, cotation_id, secteur_id)
VALUES
(2, 234, "Raoul", "Aie Caramba", 44, TRUE, 2, 1),
(3, 432, "Pedro", "Outch Raoul", 4, FALSE, 3, 3),
(4, 666, "HellBoy", "Seul Hercule en revient vivant", 66, FALSE, 3, 1)
;









