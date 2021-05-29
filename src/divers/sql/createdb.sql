
CREATE TABLE cotation (
                id INT AUTO_INCREMENT NOT NULL,
                cotation VARCHAR(100) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE statut (
                id INT AUTO_INCREMENT NOT NULL,
                statut VARCHAR(40) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE civilite (
                id TINYINT AUTO_INCREMENT NOT NULL,
                civilite VARCHAR(20) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE grimpeur (
                id INT AUTO_INCREMENT NOT NULL,
                nom VARCHAR(100) NOT NULL,
                prenom VARCHAR(100) NOT NULL,
                email VARCHAR(100) NOT NULL,
                mot_de_passe VARCHAR(255) NOT NULL,
                telephone VARCHAR(40) NOT NULL,
                membre_association BOOLEAN NOT NULL,
                civilite_id TINYINT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE site_de_grimpe (
                id INT AUTO_INCREMENT NOT NULL,
                nom VARCHAR(100) NOT NULL,
                descriptif VARCHAR(255) NOT NULL,
                acces VARCHAR(255) NOT NULL,
                tagge_association BOOLEAN NOT NULL,
                grimpeur_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE secteur (
                id INT AUTO_INCREMENT NOT NULL,
                nom VARCHAR(100) NOT NULL,
                temps_de_marche VARCHAR(40),
                altitude VARCHAR(20),
                site_de_grimpe_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE voie (
                id INT AUTO_INCREMENT NOT NULL,
                numero SMALLINT NOT NULL,
                nom VARCHAR(100),
                remarques VARCHAR(255),
                nombres_longueur SMALLINT NOT NULL,
                voie_equipee BOOLEAN NOT NULL,
                cotation_id INT ,
                secteur_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE topo (
                id INT AUTO_INCREMENT NOT NULL,
                nom VARCHAR(100) NOT NULL,
                description VARCHAR(255) NOT NULL,
                lieu VARCHAR(100) NOT NULL,
                date_de_parution DATETIME NOT NULL,
                disponible BOOLEAN NOT NULL,
                grimpeur_id INT NOT NULL,
                site_de_grimpe_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE commentaire (
                id INT AUTO_INCREMENT NOT NULL,
                commentaire VARCHAR(255) NOT NULL,
                grimpeur_fk INT NOT NULL,
                site_de_grimpe_fk INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE reservation (
                id INT AUTO_INCREMENT NOT NULL,
                date_reservation DATETIME NOT NULL,
                grimpeur_fk INT NOT NULL,
                topo_id INT NOT NULL,
                statut_id INT NOT NULL,
                PRIMARY KEY (id)
);


ALTER TABLE voie ADD CONSTRAINT cotation_voie_fk
FOREIGN KEY (cotation_id)
REFERENCES cotation (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE reservation ADD CONSTRAINT statut_reservation_fk
FOREIGN KEY (statut_id)
REFERENCES statut (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE grimpeur ADD CONSTRAINT civilite_grimpeur_fk
FOREIGN KEY (civilite_id)
REFERENCES civilite (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE reservation ADD CONSTRAINT grimpeur_reservation_fk
FOREIGN KEY (grimpeur_fk)
REFERENCES grimpeur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE commentaire ADD CONSTRAINT grimpeur_commentaire_fk
FOREIGN KEY (grimpeur_fk)
REFERENCES grimpeur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE site_de_grimpe ADD CONSTRAINT grimpeur_site_de_grimpe_fk
FOREIGN KEY (grimpeur_id)
REFERENCES grimpeur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE topo ADD CONSTRAINT grimpeur_topo_fk
FOREIGN KEY (grimpeur_id)
REFERENCES grimpeur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE commentaire ADD CONSTRAINT site_de_grimpe_commentaire_fk
FOREIGN KEY (site_de_grimpe_fk)
REFERENCES site_de_grimpe (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE topo ADD CONSTRAINT site_de_grimpe_topo_fk
FOREIGN KEY (site_de_grimpe_id)
REFERENCES site_de_grimpe (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE secteur ADD CONSTRAINT site_de_grimpe_secteur_fk
FOREIGN KEY (site_de_grimpe_id)
REFERENCES site_de_grimpe (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE voie ADD CONSTRAINT secteur_voie_fk
FOREIGN KEY (secteur_id)
REFERENCES secteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE reservation ADD CONSTRAINT topo_reservation_fk
FOREIGN KEY (topo_id)
REFERENCES topo (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
