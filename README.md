# java-ac4y-g8h-rest-service

RESTful web service (WAR) for G8H GUID-to-HumanId operations. Deploys to Java EE application servers (Tomcat, JBoss).

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-g8h-rest-service`
- **Version**: `1.0.0`
- **Packaging**: `war`

## Endpoints

| Method | Path | Description |
|--------|------|-------------|
| POST | `/setByHumanIds` | Set G8H mapping by template + human IDs |
| POST | `/setByRndHumanIds` | Set with random UUIDs for template and human ID |
| POST | `/setTemplateByHumanId` | Set template by human ID |
| GET | `/getGUIDByHumanIds` | Get GUID by template + human IDs |
| GET | `/getTemplateGUID` | Get template GUID |
| GET | `/isExistByGUID` | Check existence by GUID |
| GET | `/isExistByHumanIds` | Check existence by human IDs |
| GET | `/getByGUID` | Get G8H record by GUID |
| GET | `/getByHumanIds` | Get G8H record by human IDs |
| GET | `/getList` | Get filtered list |
| GET | `/getInstanceList` | Get instance list |
| GET | `/getGUIDList` | Get GUID list |

## Dependencies

- Jersey 1.x (JAX-RS)
- `ac4y-g8h-object-service`
- `ac4y-http-handler`
- MySQL Connector

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJAc4yG8HModule/RestService`.
