**Product Catalog App**

Detta projekt är en fullstack-applikation byggd med Spring Boot och en enkel frontend i HTML, CSS och JavaScript. Syftet med applikationen är att hantera produkter genom ett REST API samt visa och manipulera data via ett användargränssnitt.

Applikationen innehåller grundläggande funktioner för att:

* skapa produkter
* visa alla produkter
* uppdatera produkter
* ta bort produkter
* söka efter produkter
* logga in via en enkel login

Backend är utvecklad i Java med Spring Boot och använder Spring Data JPA för att hantera data. Frontend är byggd med vanlig HTML, CSS och JavaScript där fetch API används för att kommunicera med backend.

För att köra projektet startas backend via terminalen med kommandot:

mvn spring-boot:run

eller på Windows:

.\mvnw spring-boot:run

När applikationen startats öppnas den i webbläsaren via:

[http://localhost:8080](http://localhost:8080)

Vid start visas en login-sida där följande uppgifter används:

Username: admin
Password: 1234

Login-funktionen är inte kopplad till backend utan är en enkel frontend-lösning för att simulera inloggning.

Applikationen använder följande REST API endpoints:

GET /products – hämtar alla produkter
POST /products – skapar en ny produkt
PUT /products/{id} – uppdaterar en produkt
DELETE /products/{id} – tar bort en produkt

Ett exempel på hur data kan se ut i JSON-format:

[
{
"id": 1,
"name": "Laptop",
"price": 9999
}
]

Frontend visar produkterna i en lista där varje produkt kan redigeras eller tas bort via knappar. Det finns även en sökfunktion som filtrerar produkter i realtid.

Designen är gjord för att vara enkel men modern med kort (cards), färger och knappar som förbättrar användarupplevelsen.

Projektet kan vidareutvecklas genom att lägga till:

* riktig autentisering (Spring Security)
* extern databas som MySQL eller PostgreSQL
* produktbilder
* sortering och pagination
* deployment till en molntjänst

Detta projekt visar förståelse för hur frontend och backend samverkar samt hur ett REST API byggs och används i praktiken.
