# üåç API REST de Gesti®Æn de Viajes

API REST desarrollada con **Spring Boot** para la gesti®Æn completa de viajes (CRUD).
Implementa las mejores pr®¢cticas de arquitectura en capas con Spring Data JPA y base de datos H2.

## Stack Tecnol®Ægico

- Java 17
- Spring Boot 3.x
- Spring Data JPA / Hibernate
- H2 Database (en memoria)
- Maven
- Arquitectura MVC

## Instalaci®Æn R®¢pida

```bash
# Clonar el proyecto
git clone <url-del-repositorio>

# Ejecutar
mvn spring-boot:run
```

La aplicaci®Æn iniciar®¢ en `https://mi-app-viajes-yl0z.onrender.com`                          

## API Endpoints

### Base URL: `http://localhost:8080/viajes`

| M®¶todo | Endpoint | Descripci®Æn |
|--------|----------|-------------|
| `GET` | `/viajes` | Listar todos los viajes |
| `POST` | `/viajes` | Crear nuevo viaje |
| `PUT` | `/viajes/{id}` | Actualizar viaje |
| `PATCH` | `/viajes/{id}` | Actualizar precio de viaje |
| `DELETE` | `/viajes/{id}` | Eliminar viaje |

## Modelo de Datos

```json
{
  "origen": "Los ®¢ngeles",
  "destino": "Sidney",
  "fecha": "2025-12-22",
  "dias": 15,
  "precioUSD": 3200.00
}
```

## Pruebas con Postman

### 1. Listar todos los viajes
```http
GET http://localhost:8080/viajes
```

### 2. Crear un nuevo viaje
```http
POST http://localhost:8080/viajes
Content-Type: application/json

{
  "origen": "Los ®¢ngeles",
  "destino": "Sidney",
  "fecha": "2025-12-22",
  "dias": 15,
  "precioUSD": 3200.00
}
```

### 3. Actualizar un viaje
```http
PUT http://localhost:8080/viajes/1
Content-Type: application/json

{
  "id":6,
  "origen": "Santiago",
  "destino": "Berl®™n",
  "fecha": "2025-10-01",
  "dias": 9,
  "precioUSD": 1900.00
}
```

### 4. Eliminar un viaje
```http
DELETE http://localhost:3000/viaje?id=6
```

##  Acceso a Base de Datos H2

**URL Console:** `http://localhost:8080/h2-console`

**Credenciales:**
- JDBC URL: `jdbc:h2:mem:viajesdb`
- Usuario: `sa`
- Password: *(empty)*

## Arquitectura

```
‚îú‚îÄ‚îÄ controller/     ‚Ü?Endpoints REST
‚îú‚îÄ‚îÄ service/        ‚Ü?L√≥gica de negocio
‚îú‚îÄ‚îÄ repository/     ‚Ü?Acceso a datos (JPA)
‚îî‚îÄ‚îÄ model/          ‚Ü?Entidades
```

**Patr®Æn:** Modelo-Vista-Controlador (MVC)

---

** Desarrollado con Spring Boot | Java JDK 17 **