CREATE TABLE veiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    placa VARCHAR(255),
    ano int,
    cor VARCHAR(255),
    valor_diaria DECIMAL(10,2)
);

CREATE TABLE pessoas (
      id INT AUTO_INCREMENT PRIMARY KEY,
      nome VARCHAR(255),
      cpf VARCHAR(255),
      telefone int,
      email VARCHAR(255));


INSERT INTO veiculos(marca, modelo, placa, ano, cor, valor_diaria) VALUES ('Chevy', 'Celta', 'ABC-1234', '2010'
                                                                          ,'PRETO', '100.00');

INSERT INTO pessoas(nome, cpf, telefone, email) VALUES ('Eduardo', '12365478925', '44444444', 'eduardo@mail.com');