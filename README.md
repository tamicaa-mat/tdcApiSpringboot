# tdcApiSpringboot

Proyecto backend con una API en Spring Boot con la estructura básica lista; está arrancable pero faltan documentación, pruebas y algunos ajustes operativos. Para que sea mantenible y fiable en producción hay que completar tests, estandarizar manejo de errores, validar requests y alinear nombres/artefactos.

Importante: el nombre del proyecto en la raíz del repositorio no coincide con el nombre que se usa en el deploy. Esto genera confusión al integrar y desplegar; hay que renombrar la raíz para que ambos nombres coincidan (cambiar carpeta/repositorio y/o artifactId en pom según corresponda).

## Lo que hay (estado actual)
- Estructura de proyecto Spring Boot creada.
- Paquetes principales y clases base (controladores, servicios, entidades) — revisar src/.
- README original vacío (este documento lo reemplaza).

## Pendiente
- Documentar endpoints.
- Añadir pruebas unitarias e integración.
- Implementar manejo de errores consistente (responses uniformes, códigos HTTP correctos).
- Validación de request/response.

## Tareas concretas
- Añadir pruebas unitarias para controladores y servicios críticos.
- Implementar manejo de errores global (buscar esto ControllerAdvice) y estandarizar el payload de error.
- Renombrar la raíz del proyecto para que coincida con el nombre usado en deploy (evitar divergencias).
- Añadir validaciones con anotaciones y tests para casos límite.
- Crear scripts de inicialización de BD o configurar migraciones.
- Mejorar logs (estructurados, niveles adecuados) y documentar cómo interpretarlos.

## Cómo ejecutar localmente (rápido)
- Con Maven wrapper (si existe):
    -  **_mvnw spring-boot:run_** (Windows: **_mvnw.cmd spring-boot:run_**)
- Con Maven instalado:
    - **_mvn spring-boot:run_**
- Ajustar application.properties (puerto, datasource).
- Si renuevas el nombre del proyecto, revisar y actualizar referencias en pom.xml.

## Buenas prácticas para leer y entender el proyecto 
- Claridad → reduce errores en deploy y facilita entenderlo. Todo proyecto con buen codigo no necesita explicarse.
- Mantenibilidad → tests y docs previenen regresiones.
- Observabilidad y seguridad → logs, manejo de errores y gestión de secretos evitan incidentes.

Cómo abordarlo rápidamente:
- Levantar la app localmente y ejecutar los endpoints con Postman para ver flujos reales.
- Revisar tests existentes y ejecutar mvn test para ver huecos de cobertura.
- Leer los controladores y seguir la cadena: controlador → servicio → repositorio/entidad.
- Revisar application.properties para entender perfiles y dependencias externas.
- Buscar inconsistencias de nombre: comparar nombre de carpeta/repositorio vs artifactId en pom y en scripts.
- Revisar logs locales para identificar errores silenciosos y mejorar mensajes.
- Hacer pequeños commit enfocados: debe tener un objetivo claro.

### Sugerencias prácticas inmediatas:

- Crear pruebas básicas de integración para los endpoints críticos.
- Implementar un ControllerAdvice simple que devuelva un formato de error consistente.


## Notas finales
- Mantener commits pequeños y descriptivos.
- Priorizar documentación y tests.
- Si se necesita, se puede generar un checklist de comandos para renombrar el proyecto (cambios en carpeta y versiones) y un ejemplo de formatos de error.