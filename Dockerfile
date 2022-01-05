FROM openjdk:8
ADD target/thbs-jewellery.jar thbs-jewellery.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","thbs-jewellery.jar"]
