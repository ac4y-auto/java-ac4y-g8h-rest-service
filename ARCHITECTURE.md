# Architektura - java-ac4y-g8h-rest-service

## Attekintes

RESTful web szolgaltatas (WAR) a G8H GUID-HumanId muveletek HTTP API-n keresztuli eleresere. Jersey 1.x JAX-RS implementaciot hasznal.

## Szerkezet

```
src/main/java/ac4y/guid8humanid/service/restful/
  Ac4yGUID8HumanIdRestfulService.java - JAX-RS REST vegpontok
src/main/webapp/
  WEB-INF/web.xml                     - Servlet konfiguracio
  META-INF/context.xml                - JNDI adatforras konfiguracio
```

## Osztalyok

### Ac4yGUID8HumanIdRestfulService
- `@Path("")` gyoker eleresi ut
- POST vegpontok: setByHumanIds, setByRndHumanIds, setTemplateByHumanId
- GET vegpontok: getGUIDByHumanIds, getTemplateGUID, isExistByGUID, isExistByHumanIds, getByGUID, getByHumanIds, getList, getInstanceList, getGUIDList
- JSON kommunikacio (MediaType.APPLICATION_JSON)

## JNDI Konfiguracio

- DataSource neve: `jdbc/ac4y`
- web.xml-ben resource-ref definialva
- context.xml-ben ResourceLink a globalis adatforrashoz

## Fuggetlensegek

- Jersey 1.9/1.19 (JAX-RS)
- ac4y-g8h-object-service (Ac4yGUID8HumanIdObjectService)
- ac4y-http-handler (HTTP kezeles)
- MySQL Connector

## Eredet

Az `IJAc4yG8HModule/RestService` modulbol kinyerve.
