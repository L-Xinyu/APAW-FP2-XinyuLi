# Arquitectura de un mini API-Rest simulado
> Este proyecto pretende ser un ejemplo sencillo de arquitectura de un API-Rest simulado para comprender las capas que intervienen y la organización de los diferentes tipos de test, con integración continua y control de la calidad del código
### Arquitecta de software
> [Xinyu.Li](https://github.com/L-Xinyu)  
#### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*

## Tecnologías necesarias
* Java
* Maven
* GitHub

## Diseño de entidades
![themes-architecture-diagram](https://github.com/L-Xinyu/APAW-ECP2-XinyuLi/blob/master/docs/Las%20relaciones%20en%20UML.png)

### Responsabilidades
#### Dispatcher
* Centraliza las peticiones y hace de repartidor
* Recupera los datos de la petición y los pasa como parámetros de método
* Captura las excepciones y las convierte en errores Http
#### restControllers
* Define el path del recurso
* Valida la entrada
* Traspasa la petición a los controladores de la capa de negocio
#### businessControllers
* Procesa la petición, apoyándose en los DAO’s
* Crea las entidades a partir de los DTO’s
* Gestiona la respuesta a partir de las entidades. Delega en los DTO’s la creación a partir de la entidad
#### daos
* Gestionan la BD
#### entities
* Son las entidades persistentes en la BD

## API
### POST /temas
#### Parámetros del cuerpo
- `id`: String (**requerido**)
- `name`: String
#### Respuesta
- 200 OK 
  - `id`: String
- 403 BAD_REQUEST
---
### PUT /temas/{id}
#### Parámetros del cuerpo
- `id`: String (**requerido**)
- `name`: String
#### Respuesta
- 200 OK 
- 403 BAD_REQUEST
- 404 NOT_FOUND
--- 
### POST /comentarios
#### Parámetros del cuerpo
- `negative`: Boolean (**requerido**)
- `description`: String (**requerido**)
#### Respuesta
- 200 OK 
- 403 BAD_REQUEST
---
### POST /articulos
#### Parámetros del cuerpo
- `id`: String (**requerido**)
- `name`: String (**requerido**)
#### Respuesta
- 200 OK 
  - `id`: String
- 403 BAD_REQUEST
- 404 NOT_FOUND
---
### GET /articulos
#### Respuesta
- 200 OK 
  - `[ {id:String,name:String} ]`
---
### DELETE /articulos/{id}
#### Respuesta
- 200 OK 
---
### PATCH /articulos/{id}/category
#### Parámetros del cuerpo
- `category`: String (**requerido**)
#### Respuesta
- 200 OK 
- 403 BAD_REQUEST
- 404 NOT_FOUND
---