Create a Spring Boot endpoint with:

HTTP Method: ${input:httpMethod}
URL: ${input:url}
Controller Method: ${input:controllerMethod}
Service Method: ${input:serviceMethod}
DTO: ${input:dto}
Entity: ${input:entity}
Repository Operation: ${input:repoAction}

Generate:
- controller
- service
- service impl
- repository integration
- tests