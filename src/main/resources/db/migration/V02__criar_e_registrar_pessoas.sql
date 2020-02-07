CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo boolean NOT NULL,
	logradouro VARCHAR(80) NOT NULL,
	numero VARCHAR(10) NOT NULL,
	complemento VARCHAR(80) NOT NULL,
	bairro VARCHAR(20) NOT NULL,
	cep VARCHAR(10) NOT NULL,
	cidade VARCHAR(20) NOT NULL,
	estado VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Marcio Willian Chaves Cardoso', true, 'Rua Santo Adalberto, Residencial Granada', '25', 'ao lado da AABEM', 'Forquilha', 'São Luis','65054115', 'MA');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Nitia Cristina Chaves Cardoso', true, 'Rua Santo Adalberto, Residencial Granada', '25', 'ao lado da AABEM', 'Forquilha', 'São Luis','65054115', 'MA');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Felipe Wanderson Chaves Cardoso', true, 'Rua Santo Adalberto, Residencial Granada', '25', 'ao lado da AABEM', 'Forquilha', 'São Luis','65054115', 'MA');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Marcia Cristina Maria Muniz Chaves', true, 'Rua Santo Adalberto, Residencial Granada', '25', 'ao lado da AABEM', 'Forquilha', 'São Luis','65054115', 'MA');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Felipe Neri dos SAntos Cardoso', true, 'Rua Santo Adalberto, Residencial Granada', '25', 'ao lado da AABEM', 'Forquilha', 'São Luis','65054115', 'MA');
