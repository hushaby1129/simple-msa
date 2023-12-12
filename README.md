# simple-msa

## Introduce
This project is a simple MSA (Microservices Architecture) project. 
It involves implementing service discovery, API gateway, config server, and services 1 and 2 using Spring Boot.
The goal is to study MSA through practical implementation.
All the content is based on what I've learned from the following [Blog](https://enjoy-dev.tistory.com/category/Spring%20Cloud), [GitHub](https://github.com/chanheejung/SimpleMSA/tree/2.Rest-API-Call).

## branch description
1. Service-Discovery
    - Create Simple MSA Project
      - Create Spring Eureka discovery sever Module (service-discovery)
      - Create Spring Eureka client server Module (service1, service2)
2. Rest-API-Call
    - Using RestTemplate
      - Problems
        1. The calling service needs to manage the IP and PORT (or alternatively, always fetch the information through DiscoveryClient as shown in the example above).
        2. Client-side load balancing is not possible (Unable to use various load balancing configurations of Ribbon).
    - RestTemplate - Ribbon
    - Feign
    - WebClient
      - 추후 진행 예정

    


<details>
    <summary>Reference Links</summary>

- **https://enjoy-dev.tistory.com/12**
- **https://github.com/chanheejung/SimpleMSA/tree/2.Rest-API-Call**
---
- https://themapisto.tistory.com/171
- https://sihyung92.oopy.io/architecture/woowa-msa-travel
- https://may9noy.tistory.com/category/MSA%20%28MicroServiceArchitecture%29
- https://velog.io/@korea3611?tag=msa
- https://velog.io/@kddongkyu/MSAMicro-Service-Architecture%EB%9E%80
- https://velog.io/@jkijki12/Eureka%EB%9E%80

</details>

todo : 영어말고 한글로 쓰자