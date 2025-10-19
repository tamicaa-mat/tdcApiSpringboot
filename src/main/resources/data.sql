-- Clientes
-- Nota: que encontre al probarlo. Los id creados desde aca, estan usados. 
-- Si queres empezar desde 0, sin consultar inicialmente comenta las lineas siguientes.

INSERT INTO cliente (id, nombre, apellido, dni) VALUES (1, 'Juan',  'Perez',  '29986919');
INSERT INTO cliente (id, nombre, apellido, dni) VALUES (2, 'María', 'García', '29986920');
INSERT INTO cliente (id, nombre, apellido, dni) VALUES (3, 'Luis',  'Sola', '29986921');

-- Productos
-- Nota: que encontre al probarlo. Los id creados desde aca, estan usados. 
-- Si queres empezar desde 0, sin consultar inicialmente comenta las lineas siguientes.
INSERT INTO producto (codigo_producto, nombre, marca, costo, cantidad) VALUES (1, 'Camisa',  'Camisa  talla M',   19.99, 50);
INSERT INTO producto (codigo_producto, nombre, marca, costo, cantidad) VALUES (2, 'Pantalon','Pantalon vaquero talla 32',39.99, 30);
INSERT INTO producto (codigo_producto, nombre, marca, costo, cantidad) VALUES (3, 'Zapatos', 'Zapatos deportivos', 59.90, 20);
INSERT INTO producto (codigo_producto, nombre, marca, costo, cantidad) VALUES (4, 'Gorra',   'Gorra ajustable', 9.50, 100);

-- Ventas (referencian cliente_id)
--INSERT INTO venta (id, fecha, cliente_id, total) VALUES (1, '2025-10-01', 1, 59.98);  
--INSERT INTO venta (id, fecha, cliente_id, total) VALUES (2, '2025-10-03', 2, 59.90);
--INSERT INTO venta (id, fecha, cliente_id, total) VALUES (3, '2025-10-05', 3, 29.49);
--INSERT INTO venta (id, fecha, cliente_id, total) VALUES (4, '2025-10-06', 1, 9.50); 